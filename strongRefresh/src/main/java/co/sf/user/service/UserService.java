package co.sf.user.service;

import co.sf.user.vo.UserVO;

public interface UserService {
	
	//로그인
	UserVO checkUser(String id,String pw);
	
	//회원가입 (참은 1)
	boolean addMember(UserVO uvo);
	
	
	
}
