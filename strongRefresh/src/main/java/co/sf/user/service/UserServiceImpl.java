package co.sf.user.service;

import org.apache.ibatis.session.SqlSession;

import co.sf.common.DataSource;
import co.sf.user.mapper.UserMapper;
import co.sf.user.vo.UserVO;

public class UserServiceImpl implements UserService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	
	@Override
	public UserVO checkUser(String id, String pw) {
		return mapper.checkUser(id, pw);
	}
	
}
