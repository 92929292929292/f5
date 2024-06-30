<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- heart.jsp -->
<style>
#container {
	width: 1000px;
	margin: auto;
	text-align: center;
}
table {
	margin-left:auto; 
    margin-right:auto;
}
</style>


<div id="container">
	<h2>WISH LIST</h2>
	<table id="table" border="1">
		<!-- <caption>관심상품목록</caption> -->
		<thead>
			<tr>				
				<th scope="col"><input type="checkbox"></th>
				<th scope="col">이미지</th>
				<th scope="col">상품명</th>
				<th scope="col">판매가</th>
				<th scope="col">선택</th>
			</tr>
		</thead>

		<tbody class="wishList">
		</tbody>
	</table>

	<p>선택상품을</p>
	<input type="button" value="삭제하기" id="checkDelete">
	<input type="button" value="장바구니담기" id="checkCartPage">
	<input type="button" value="전체상품주문" id="allOrderProduct">
	<input type="button" value="관심상품비우기" id="allHeartReset">
</div>

<script src="jsf5/ygm/heart.js"></script>