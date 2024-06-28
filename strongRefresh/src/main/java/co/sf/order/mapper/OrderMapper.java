package co.sf.order.mapper;

import java.util.List;

import co.sf.order.vo.OrderVO;

public interface OrderMapper {
	OrderVO getOrderById(String orderCode);

	List<OrderVO> getOrdersByUserId(String userId);

	int insertOrder(OrderVO order);
	int deleteOrder(String orderCode);
}
