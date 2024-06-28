package co.sf.order.vo;

import java.util.Date;

import lombok.Data;

@Data
public class OrderVO {
	private String orderCode;
	private String id;
	private String recipient;
	private Date orderDate;
	private String orderStatus;
	private String phone;
	private String address;
	private String deliveryMessage;
	private int usePoint;
	private int totalPrice;
	
}
