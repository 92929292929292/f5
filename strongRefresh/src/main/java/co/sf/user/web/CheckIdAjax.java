package co.sf.user.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sf.common.Control;
import co.sf.user.service.UserService;
import co.sf.user.service.UserServiceImpl;

public class CheckIdAjax implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		
		UserService uvc = new UserServiceImpl();
		
		if(uvc.checkIdAjax(id)) {// {"retCode":"Exist"}
			resp.getWriter().print("{\"retCode\":\"Exist\"}");
		} else {// {"retCode":"Not Exist"}
			resp.getWriter().print("{\"retCode\":\"Not Exist\"}");
		}
		
	}

}
