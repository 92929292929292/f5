package co.sf.review.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.sf.common.Control;
import co.sf.review.service.ReviewService;
import co.sf.review.service.ReviewServiceImpl;
import co.sf.review.vo.ReviewVO;

public class ReviewList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=utf-8");
		
		ReviewService rsvc = new ReviewServiceImpl();
		
		List<ReviewVO> rlist = rsvc.reviewList();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(rlist);
		resp.getWriter().print(json);		

	}

}
