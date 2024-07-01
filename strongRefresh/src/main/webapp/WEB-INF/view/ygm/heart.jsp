<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!-- heart.jsp -->
  <style>
    #container {
      width: 1000px;
      margin: auto;
      text-align: center;
    }

    table {
      margin-left: auto;
      margin-right: auto;
    }
  </style>


  <!-- <div id="container">
    <h2>WISH LIST</h2>
    <table id="table" border="1">
      <caption>관심상품목록</caption>
      <thead>
        <tr>
          <th scope="col"><input type="checkbox" id="checkbox"></th>
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
  </div> -->

  <div class="container">

    <div class="row mb-5">
      <form class="col-md-12" method="post">
        <div class="site-blocks-table">
          <table class="table table-bordered">
            <thead>
              <tr>
                <th class="product-thumbnail"><input type="checkbox" id="checkbox"></th>
                <th class="product-name">이미지</th>
                <th class="product-price">상품명</th>
                <th class="product-quantity">판매가</th>
                <th class="product-total">선택</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="heart" items="${heartList }">
              <!-- <script>console.log(">>>>>>>>${heart.thumImage}")</script> -->
              <tr data-id="${heart.productCode }" class="pcode">
                <td class="product-thumbnail">
                  <input type="checkbox" id="checkbox">
                </td>
                <td class="product-thumbnail">
                  <img src="images/${heart.thumImage }" alt="Image" class="img-fluid">
                </td>
                <td class="product-name">
                  <h2 class="h5 text-black">${heart.productName }</h2>
                </td>
                <td>${heart.price }</td>
                <td>
                  <%-- <a href="order.do?${heart.productCode }" class="btn btn-primary" onclick="onClickRowDelete(event)">주문하기</a><br> --%>
                  <%-- <a href="order.do?productCode=${heart.productCode }" class="btn btn-primary" >주문하기</a><br> --%>
                  <a href="cart.do?productCode=${heart.productCode }" class="btn btn-primary btn-sm">카트담기</a><br>
                  <button type="button" id="deleteRowHeart" class="btn btn-primary btn-sm">하트삭제</button>
                </td>
              </tr>
              </c:forEach>
            </tbody>
<!--             <tfoot>
            	<tr>
            		<td>
	            	  <a href="#" class="btn btn-primary">주문하기</a><br>
	                  <a href="#" class="btn btn-primary">장바구니담기</a><br>
	                  <a href="#" class="btn btn-primary btn-sm">X 삭제</a>
            		</td>
            	</tr>
            </tfoot> -->
          </table>
			    <input type="button" value="선택상품삭제" id="checkDelete">
			    <input type="button" value="선택상품카트담기" id="checkCartPage">
			    <input type="button" value="선택상품주문" id="allOrderProduct">
			    <input type="button" value="관심상품비우기" id="allHeartReset">
        </div>
      </form>
    </div>
  </div>

<script src="jsf5/ygm/heart.js"></script>