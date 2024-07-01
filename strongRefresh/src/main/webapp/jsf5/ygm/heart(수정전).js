/**
 * heart.js
 */

// 찜 목록 출력
let fields = ['productCode', 'thumImage', 'productName', 'price'];
let wishList = document.querySelector('.wishList');

fetch('heartList.do')
	.then(result => result.json())
	.then(result => {
		result.forEach(ele => {
			wishList.appendChild(makeRow(ele));
		})
	})


function makeRow(obj = {}) {
	let tr = document.createElement('tr');
	tr.setAttribute("class", "pcode");
	tr.setAttribute('data-id', obj.productCode);	
	let td = document.createElement('td');
	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	input.setAttribute('class', 'boxs'); //체크박스 아이디	
	td.appendChild(input);
	tr.appendChild(td);
	
	fields.forEach(field => {
		if(field == "productCode") {
			//input = document.createElement('input');
			//input.setAttribute('type', 'hidden');
			//input.setAttribute('id', 'pcode');
			//input.setAttribute('value', obj[field]);
			//wishList.appendChild(input);
			//console.log(field + "프코");
		} else {
			td = document.createElement('td');
			td.innerHTML = obj[field];
			tr.appendChild(td);	
			//console.log(field + "그외");
		}
		
	})
	
	// 주문하기 버튼
	td = document.createElement('td');
	let orderButton = document.createElement('button');
	let orderATag = document.createElement('a');
	orderATag.setAttribute('href', '../khs/checkout.jsp');
	orderButton.setAttribute('type', 'button');
	orderButton.innerHTML = '주문하기';
	orderButton.onclick = onClickRowOrderPage;
	orderButton.appendChild(orderATag);
	td.appendChild(orderButton);
	tr.appendChild(td);
	
	// 장바구니 담기 버튼
	let cartButton = document.createElement('button');
	let cartATag = document.createElement('a');
	cartATag.setAttribute('href', '');
	cartButton.setAttribute('type', 'button');
	cartButton.innerHTML = '장바구니담기';
	cartButton.onclick = onClickRowCartPage;
	cartButton.appendChild(cartATag);
	td.appendChild(cartButton);
	tr.appendChild(td);
	
	// 삭제하기 버튼
	let deleteButton = document.createElement('button');
	deleteButton.setAttribute('type', 'button');
	deleteButton.innerHTML = '삭제하기';
	deleteButton.onclick = onClickRowDelete;
	td.appendChild(deleteButton);
	tr.appendChild(td);
	
	return tr;
} // end of makeRow();


// 삭제하기 이벤트
function onClickRowDelete(e){
	let delTr = e.target.parentElement.parentElement;
	del(delTr)
} // end of onClickRowDelete();


// 주문하기 버튼 클릭시 주문 페이지로 이동하는 function
function onClickRowOrderPage(e){
	onClickRowDelete(e);
	let pcode = document.querySelector('.pcode').dataset.id;
	document.location.href="order.do?productCode=" + pcode;
}

// 장바구니 클릭시 장바구니 페이지
// TODO
function onClickRowCartPage(e){
	console.log("onClickRowCartPage");
	onClickRowDelete(e);
	let pcode = document.querySelector('.pcode').value;
	//document.location.href="order.do?productCode=" + pcode;
}


// 체크박스 전체선택
document.getElementById('checkbox').addEventListener('click', function(){
	document.querySelectorAll('.boxs').forEach(box => box.checked = this.checked);
}) // end of 체크박스.


// 체크 선택 상품 삭제
document.getElementById('checkDelete').addEventListener('click', onClickCheckDelete);
function onClickCheckDelete(){
	console.log("onClickCheckDelete");
	document.querySelectorAll('.boxs').forEach(box => {
	//console.log("박스");
	//console.log(box);
		if(box.checked){
			let selectTr = box.parentElement.parentElement;
			console.log('체크된 박스의 부모의 부모는 누구일까요?');
			console.log(box.parentElement.parentElement);
			del(selectTr);
		}
	})
} // end of onClickCheckDelete();


// 체크박스 선택 상품 장바구니 담기
document.getElementById('checkCartPage').addEventListener('click', onClickCheckCartPage);
function onClickCheckCartPage(){
	console.log("onClickCheckCartPage");
	
}


// 전체 상품 주문
document.getElementById('allOrderProduct').addEventListener('click', onClickAllOrderProduct);
function onClickAllOrderProduct(){
	console.log("onClickAllOrderProduct");
		
	Array.from(wishList.children).forEach(product => {
		//console.log("프로덕트" ,product);
		document.location.href="order.do?productCode=" + product.dataset.id;
		//select * from heart_f5 where id = 'user01' ==> List<heartVO> req.setAttribute("heartList", list)
	})
}


// 관심 상품 비우기
document.getElementById('allHeartReset').addEventListener('click', onClickAllHeartReset);
function onClickAllHeartReset(){
	console.log("onClickAllHeartReset");
	Array.from(wishList.children).forEach(ele => {
		let pcode = ele.dataset.id;
		if(pcode != null){
			console.log(pcode);
			let url = 'removeHeart.do?productCode=' + pcode;
			fetch(url)
				.then(result => result.json())
				.then(result => {
					if (result.result == "OK") {
						//alert("삭제되었습니다.");
						ele.remove();
					} else {
						//alert("삭제되지 않았습니다.");
					}
					
				})
		}
		wishList.remove();	
	})
}


// 삭제
function del(tr){
	let pcode = tr.dataset.id;
	console.log(pcode);
	let url = 'removeHeart.do?productCode=' + pcode;
	fetch(url)
		.then(result => result.json())
		.then(result => {
			if (result.result == "OK") {
				alert("삭제되었습니다.");
				tr.remove();
			} else {
				alert("삭제가 되지 않았습니다.");
			}
		})
} // end of del();