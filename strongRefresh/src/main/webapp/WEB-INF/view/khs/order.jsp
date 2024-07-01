<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="site-wrap">
    <div class="site-section">
        <div class="container">
            <div class="col-md-12">
                <h6 class="h6 mb-3 text-black">주문 내역</h6>
                <div class="p-3 p-lg-5 border">
                    <table class="table site-block-order-table mb-5">
                        <thead>
                            <tr>
                                <th><label><input type = "checkbox" name = "allselect"></label></th>
                                <th>Product</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Point</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody id="list">
                        </tbody>
                    </table>
                </div>
                
                <div class="d-flex justify-content-between mb-4">
                    <div>
                    	<strong><b>선택 상품을</b></strong>
                        <button type="button" class="btn btn-secondary btn-sm"> 삭제하기</button>
                    </div>
                    <div>
                        <strong> 합계 : <span style="color: black;">KRW 155,000</span></strong>
                    </div>
                </div>
                
                    <h6 class="h6 mb-3 text-black">배송 정보</h6>
                    <div class="p-3 p-lg-5 border">
                        <div class="form-group">
                            <label for="deliveryOption" class="text-black">배송지 선택</label>
                            <div>
                                <label><input type="radio" name="deliveryOption" value="sameAsUser" checked> 회원 정보와 동일</label>
                                <label><input type="radio" name="deliveryOption" value="newAddress"> 새로운 배송지</label>
                                <button type="button" class="btn btn-primary btn-sm">주소록 보기</button>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="recipient" class="text-black">받으시는 분</label>
                            <input type="text" class="form-control" id="recipient" name="recipient" value="">
                        </div>

                        <div class="form-group">
                            <label for="address" class="text-black">주소</label>
                            <input type="text" class="form-control" id="postalCode" name="postalCode" placeholder="우편번호">
                            <input type="text" class="form-control mt-2" id="address" name="address" placeholder="기본주소">
                            <input type="text" class="form-control mt-2" id="addressDetail" name="addressDetail" placeholder="나머지주소 (선택입력가능)">
                        </div>

                        <div class="form-group">
                            <label for="phone" class="text-black">휴대전화</label>
                            <div class="row">
                                <div class="col-md-3">
                                    <select id="phone1" class="form-control">
                                        <option value="010">010</option>
                                        <option value="011">011</option>
                                        <option value="016">016</option>
                                        <option value="017">017</option>
                                        <option value="018">018</option>
                                        <option value="019">019</option>
                                    </select>
                                </div>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" id="phone2" name="phone2" value="">
                                </div>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" id="phone3" name="phone3" value="">
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email" class="text-black">이메일</label>
                            <div class="row">
                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="emailUser" name="emailUser" value="">
                                </div>
                                <div class="col-md-5">
                                    <select id="emailDomain" class="form-control">
                                        <option value="naver.com">naver.com</option>
                                        <option value="daum.net">daum.net</option>
                                        <option value="nate.com">nate.com</option>
                                        <option value="hotmail.com">hotmail.com</option>
                                        <option value="yahoo.com">yahoo.com</option>
                                        <option value="gmail.com">gmail.com</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="deliveryMessage" class="text-black">배송메시지</label>
                            <textarea name="deliveryMessage" id="deliveryMessage" cols="30" rows="5" class="form-control" placeholder="배송메시지를 입력해주세요."></textarea>
                        </div>
                    </div>

                <div class="row mb-5">
                    <div class="col-md-12">
                    <br>
                        <h6 class="h6 mb-4 text-black" >결제 예정 금액</h6>
                        <div class="p-3 p-lg-5 border">
                            <div class="row">
                                <div class="col-md-6">
                                    <span class="text-black">총 주문 금액:</span>
                                </div>
                                <div class="col-md-6 text-right">
                                    <strong>KRW 155,000</strong>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <span class="text-black">총 할인:</span>
                                </div>
                                <div class="col-md-6 text-right">
                                    <strong>- KRW 0</strong>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <span class="text-black">총 결제 예정 금액:</span>
                                </div>
                                <div class="col-md-6 text-right">
                                    <strong>KRW 155,000</strong>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
</div>
<script src="js/orderDetails.js"></script>