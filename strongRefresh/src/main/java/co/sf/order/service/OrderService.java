package co.sf.order.service;

import java.util.List;

import co.sf.order.vo.OrderVO;

public interface OrderService {
	OrderVO getOrderById(String orderCode);
	List<OrderVO> getOrdersByUserId(String userId);
	boolean insertOrder(OrderVO order);
	boolean deleteOrder(String orderCode);
}
