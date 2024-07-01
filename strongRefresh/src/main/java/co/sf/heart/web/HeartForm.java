package co.sf.heart.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sf.common.Control;
import co.sf.heart.service.HeartService;
import co.sf.heart.service.HeartServiceImplements;
import co.sf.product.vo.ProductVO;

public class HeartForm implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 수정 전) ajax로 list 출력
		//req.getRequestDispatcher("ygm/heart.tiles").forward(req, resp);
		
		
		// 수정 후) jsp로 list 출력
		HeartService hsvc = new HeartServiceImplements();

		//수정 전과 후 둘 다 같은 부분
		// HttpSession session = req.getSession();
		// String id = (String) session.getAttribute("id");
		String id = "1"; // test, 완성된 후에는 위에 코드 입력
		List<ProductVO> hlist = hsvc.heartList(id);
		
		//System.out.println(hlist.get(0).getThumImage());   // test
		//System.out.println(hlist.get(0).getProductName()); // test
		//System.out.println(hlist.get(0).getPrice());       // test

		// 수정 전) ajax로 list 출력 : 찜 화면으로 이동
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//String json = gson.toJson(hlist);
		//resp.getWriter().print(json);
		
		// 수정 후) jsp로 list 출력
		req.setAttribute("heartList", hlist);
		req.getRequestDispatcher("ygm/heart.tiles").forward(req, resp);
	}

}
