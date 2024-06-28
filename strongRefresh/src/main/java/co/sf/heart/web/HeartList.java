package co.sf.heart.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.sf.common.Control;
import co.sf.heart.service.HeartService;
import co.sf.heart.service.HeartServiceImplements;
import co.sf.heart.vo.HeartVO;

public class HeartList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 찜 목록 출력 요청
		resp.setContentType("text/json;charset=utf-8");
		
		HeartService hsvc = new HeartServiceImplements();
		
		List<HeartVO> hlist = hsvc.heartList();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(hlist);
		resp.getWriter().print(json);		

	}

}
