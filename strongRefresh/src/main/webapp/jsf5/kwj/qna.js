/**
 * qna.js
 */

// QnA 목록 출력
let fields = ['productCode', 'id'];
let qnaList = document.querySelector('.qnaList');

fetch('qnaList.do')
	.then(result => result.json())
	.then(result => {
		console.log(result);
		result.forEach(ele => {
			qnaList.appendChild(makeRow(ele));
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