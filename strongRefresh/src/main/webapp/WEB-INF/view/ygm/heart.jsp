<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- heart.jsp -->

<h2>WISH LIST</h2>

<table border="1">
	<!-- <caption>관심상품목록</caption> -->
	<thead>
		<tr>
			<th scope="col"><input type="checkbox" onclick="(event)"></th>
			<th scope="col">이미지</th>
			<th scope="col">상품정보</th>
			<th scope="col">판매가</th>
			<th scope="col">적립금</th>
			<th scope="col">배송구분</th>
			<th scope="col">배송비</th>
			<th scope="col">합계</th>
			<th scope="col">선택</th>
		</tr>
	</thead>
	<tbody class="wishList">
	</tbody>
<!-- 	<tfoot>
		<tr>
			<td>선택상품을</td>
			<td><input type="button" value="삭제하기"></td>
			<td><a href="">삭제하기</a></td>
			<td><input type="button" value="장바구니담기"></td>
			<td>전체상품주문</td>
			<td>관심상품 비우기</td>
	</tfoot> -->
</table>

<script src="jsf5/ygm/heart.js"></script>