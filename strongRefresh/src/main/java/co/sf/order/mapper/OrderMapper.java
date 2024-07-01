package co.sf.order.mapper;

import java.util.List;

import co.sf.order.vo.OrderVO;

public interface OrderMapper {

	List<OrderVO> OrderList();

	int addAddress(OrderVO order);
}
