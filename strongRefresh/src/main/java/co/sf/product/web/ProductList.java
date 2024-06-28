package co.sf.product.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.sf.common.Control;
import co.sf.product.service.ProductService;
import co.sf.product.service.ProductServiceImpl;
import co.sf.product.vo.ProductVO;

public class ProductList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=utf-8");
		ProductService svc = new ProductServiceImpl();
		List<ProductVO> list = svc.ProductList();
		System.out.println(list);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(list);
	
		resp.getWriter().print(json);

	}

}
