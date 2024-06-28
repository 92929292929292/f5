package co.sf.orderDetail.vo;

import lombok.Data;

@Data
public class OrderDetailVO {
	private String orderDetailCode;
	private String orderCode;
	private String productCode;
	private int productCnt;

}
