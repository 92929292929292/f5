package co.sf.user.mapper;

import org.apache.ibatis.annotations.Param;

import co.sf.user.vo.UserVO;

public interface UserMapper {
	UserVO checkUser(@Param("id") String id, @Param("pw") String pw);
	
	int addMember(UserVO uvo);
	
	
}
