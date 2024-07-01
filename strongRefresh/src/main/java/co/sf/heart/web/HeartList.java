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
import co.sf.product.vo.ProductVO;

public class HeartList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 찜 목록 출력 요청
		resp.setContentType("text/json;charset=utf-8");

		HeartService hsvc = new HeartServiceImplements();
		// System.out.println("start"); //test

		// HttpSession session = req.getSession();
		// String id = (String) session.getAttribute("id");
		String id = "1"; // test
		// System.out.println(id); //test

		List<ProductVO> hlist = hsvc.heartList(id);
		System.out.println(hlist.get(0).getThumImage());
		System.out.println(hlist.get(0).getProductName());
		System.out.println(hlist.get(0).getPrice());

//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String json = gson.toJson(hlist);
//		resp.getWriter().print(json);

		req.setAttribute("heartList", hlist);

		req.getRequestDispatcher("ygm/heart.tiles").forward(req, resp);

	}

}
