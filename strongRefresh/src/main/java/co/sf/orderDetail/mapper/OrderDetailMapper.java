package co.sf.orderDetail.mapper;

import java.util.List;

import co.sf.orderDetail.vo.OrderDetailVO;

public interface OrderDetailMapper {
	List<OrderDetailVO> getOrderDetailsByOrderCode(String orderCode);
	int insertOrderDetail(OrderDetailVO orderDetail);
	int updateOrderDetail(OrderDetailVO orderDetail);
	int deleteOrderDetail(String orderDetailCode);
}
