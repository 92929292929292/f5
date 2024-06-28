package co.sf.user.service;

import co.sf.user.vo.UserVO;

public interface UserService {
	//checkMember(id,pw)
	UserVO checkUser(String id,String pw);
}
