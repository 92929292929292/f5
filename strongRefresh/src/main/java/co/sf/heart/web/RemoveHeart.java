package co.sf.heart.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.sf.common.Control;
import co.sf.heart.service.HeartService;
import co.sf.heart.service.HeartServiceImplements;

public class RemoveHeart implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/json;charset=utf-8");
		 
		 String pcode = req.getParameter("productCode");
		 
		 HeartService hsvc = new HeartServiceImplements();
		 
		 Map<String, Object> map = new HashMap<String, Object>();
		 Gson gson = new GsonBuilder().create();
		 
		 if(hsvc.removeHeart(pcode)) {
			 map.put("result", "OK");
		 } else {
			 map.put("result", "NG");
		 }
		 String json = gson.toJson(map);
		 resp.getWriter().print(json);
	}

}
