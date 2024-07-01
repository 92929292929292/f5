package co.sf.orderDetail.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.sf.common.DataSource;
import co.sf.orderDetail.mapper.OrderDetailMapper;
import co.sf.orderDetail.vo.OrderDetailVO;

public class OrderDetailServiceImpl implements OrderDetailService{
	SqlSessionFactory sqlSessionFactory = DataSource.getInstance();
	SqlSession sqlSession = sqlSessionFactory.openSession(true);
	
	OrderDetailMapper mapper = sqlSession.getMapper(OrderDetailMapper.class);

	@Override
	public List<OrderDetailVO> OrderDetailList() {
		// TODO Auto-generated method stub
		return mapper.OrderDetailList();
	}

}
