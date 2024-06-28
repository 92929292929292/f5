const xthp = new XMLHttpRequest();
xthp.open('get', 'productListJason.do');
xthp.send();
xthp.onload=function(){
	let data = JSON.parse(xthp.responseText);
	data.forEach(product => document.getElementById('List').appendChild(makeRow(product)));
};

//제품 리스트 출력
const fields = ['categorie', 'productName', 'productSize', 'color', 'price'];
function makeRow(obj = {}){
	let tr = document.createElement('tr');
	
	fields.forEach(field => {
		let td = document.createElement('td');
		td.innerHTML = obj[field];
		tr.appendChild(td);
	})
	
	console.log(tr);
	
	return tr;
}