/**
 * review.js
 */

// 리뷰 목록 출력
let fields = ['productCode', 'id'];
let reviewList = document.querySelector('.reviewList');

fetch('reviewList.do')
	.then(result => result.json())
	.then(result => {
		console.log(result);
		result.forEach(ele => {
			reviewList.appendChild(makeRow(ele));
		})
	})

function makeRow(obj = {}) {
	let tr = document.createElement('tr');
	
	let td = document.createElement('td');
	let input = document.createElement('input');
	input.setAttribute('type', 'checkbox');
	
	td.appendChild(input);
	tr.appendChild(td);
	
	fields.forEach(field => {
		td = document.createElement('td');
		td.innerHTML = obj[field];
		tr.appendChild(td);
	})	
	
	return tr;
}