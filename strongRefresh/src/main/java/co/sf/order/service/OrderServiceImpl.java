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
	public List<OrderVO> OrderList() {
		return mapper.OrderList();
	}

	@Override
	public boolean addAddress(OrderVO ovo) {
		return mapper.addAddress(ovo) == 1;
	}

	
	
}
