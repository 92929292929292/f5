document.getElementById('deleteRowHeart').addEventListener('click', onClickRowDelete);

function onClickRowDelete(e){
	console.log(e);
	let delTr = e.target.parentElement.parentElement;
	del(delTr)
} // end of onClickRowDelete();

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