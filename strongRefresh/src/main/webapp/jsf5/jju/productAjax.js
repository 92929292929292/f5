const xthp = new XMLHttpRequest();
xthp.open('get', 'productListJason.do');
xthp.send();
xthp.onload = function() {
	let data = JSON.parse(xthp.responseText);
	data.forEach(product => document.getElementById('list').appendChild(cloneRow(product)));
};

let page = 1;

// 제품 리스트 출력
function cloneRow(product = {}) {
	let template = document.getElementById('clone').cloneNode(true);
	template.setAttribute('style', 'display: block;');
	template.querySelector('#listImg').setAttribute('src', 'images/cloth_2.jpg');
	template.querySelector('#listName').innerHTML = product.productName;
	template.querySelector('#listPrice').innerHTML = product.price;
	template.querySelector('#listCategorie').innerHTML = product.categorie;
	return template;
}

// 페이징 목록
function makePagingFnc(){
	
}

let pagination = document.querySelector('#pagination');
function createPagingList(){
	let totalCnt = this.responseText;
	console.log(totalCnt); // 100건/12 => 9page
	let startPage, endPage;
	let prev, next;
	let realEnd = Math.ceil(totalCnt / 5); // 9페이지
	
	endPage = Math.ceil(page / 10) * 10; // 10page
	startPage = endPage - 9;
	endPage = endPage > realEnd ? realEnd : endPage;
	
	prev = startPage > 1;
	next = endPage < realEnd;
	
	// startPage, endPage, prev, next => a태그 생성
	pagination.innerHTML = '';
	if(prev) {
		let aTag = document.createElement('a');
		aTag.setAttribute('data-page', startPage - 1);
		aTag.setAttribute('href', '#');
		aTag.innerHTML = "&laquo;";
		pagination.appendChild(aTag);
	}
	
	for(let p = startPage; p <= endPage; p++) {
		let aTag = document.createElement('a');
		aTag.setAttribute('data-page', p);
		aTag.setAttribute('href', '#');
		aTag.innerHTML = p;
		if (page == p) {
			aTag.className = 'active';
		}
		pagination.appendChild(aTag);
		
	}
	
	if(next) {
		let aTag = document.createElement('a');
		aTag.setAttribute('data-page', endPage + 1);
		aTag.setAttribute('href', '#');
		aTag.innerHTML = "&raquo;";
		pagination.appendChild(aTag);
	}
	
	// 페이징 a 태그를 클릭하면 목록 보여주기
	document.querySelectorAll('div.pagination a').forEach(item => {
	item.addEventListener('click', function(e) {
		e.preventDefault(); // 페이지 이동하는 기본기능 차단
		page = item.dataset.page;
		svc.replyList({ bno, page }, replyListFnc);
	});
});

	
} // end of createPagingList()