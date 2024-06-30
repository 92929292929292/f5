package co.sf.user.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sf.common.Control;
import co.sf.user.service.UserService;
import co.sf.user.service.UserServiceImpl;
import co.sf.user.vo.UserVO;

public class JoinControl implements Control {
	

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8"); //post방법으로 요청 시 한글포함 문자 변경
		//resp.setContentType("text/json;charset=utf-8");
		
		String name = req.getParameter("userName");
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPw");
		String checkPw = req.getParameter("checkPw");
		String frontPhone = req.getParameter("frontPhone");
		String middlePhone = req.getParameter("middlePhone");
		String lastPhone = req.getParameter("lastPhone");
		String email = req.getParameter("email");
		
		UserVO uvo = new UserVO();
		uvo.setName(name);
		uvo.setId(id);
		uvo.setPw(pw);
		uvo.setPhone(frontPhone+"-"+middlePhone+"-"+lastPhone);
		uvo.setEmail(email);
		
		UserService uvc = new UserServiceImpl();
		
		if(uvc.addMember(uvo)) {
			req.getRequestDispatcher("cyj/joinFinish.tiles").forward(req, resp);
		} else {
			req.getRequestDispatcher("cyj/joinForm.tiles").forward(req, resp);
		}
		
		
	}

}
