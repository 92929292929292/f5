package co.sf.order.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.sf.common.DataSource;
import co.sf.order.mapper.OrderMapper;
import co.sf.order.vo.OrderVO;


public class OrderServiceImpl implements OrderService {
	SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
	SqlSession sqlSession = sqlSessionFactory.openSession(true);
	
	OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

	@Override
	public OrderVO getOrderById(String orderCode) {
		// TODO Auto-generated method stub
		return mapper.getOrderById(orderCode);
	}

	@Override
	public List<OrderVO> getOrdersByUserId(String userId) {
		// TODO Auto-generated method stub
		return mapper.getOrdersByUserId(userId);
	}

	@Override
	public boolean insertOrder(OrderVO order) {
		// TODO Auto-generated method stub
		return mapper.insertOrder(order) == 1;
	}


	@Override
	public boolean deleteOrder(String orderCode) {
		// TODO Auto-generated method stub
		return mapper.deleteOrder(orderCode) == 1;
	}

	
}
