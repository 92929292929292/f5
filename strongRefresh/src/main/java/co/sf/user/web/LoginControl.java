package co.sf.user.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.sf.common.Control;
import co.sf.user.service.UserService;
import co.sf.user.service.UserServiceImpl;
import co.sf.user.vo.UserVO;

public class LoginControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPw");
		
		UserService svc = new UserServiceImpl();
		
		UserVO uvo = svc.checkUser(id, pw);
		
		
		if(uvo != null) {
			HttpSession session = req.getSession();
			
			session.setAttribute("id", id);
			resp.sendRedirect("main.do");
//			req.getRequestDispatcher("main.do").forward(req, resp);
		} else {
			resp.sendRedirect("loginForm.do");
		}
		
	}

}
