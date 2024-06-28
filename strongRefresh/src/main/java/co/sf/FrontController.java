package co.sf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sf.common.Control;
import co.sf.order.web.OrderForm;
import co.sf.orderDetail.web.OrderDetailForm;
import co.sf.product.web.ProductForm;
import co.sf.product.web.ProductList;
import co.sf.web.MainControl;

//front -> 요청 url(*.do) - 실행컨트롤 매칭.
//main.do -> FrontController -> /web-inf/public/main.jsp
//객체생성 - init -> service - destroy
public class FrontController extends HttpServlet {
	private Map<String, Control> map; // key: url, value: control

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainControl());
		map.put("/order.do", new OrderForm());
		map.put("/orderdetail.do", new OrderDetailForm());

		// 제품 페이지
		map.put("/productForm.do", new ProductForm());
		// 제품 페이지에 제품 출력
		map.put("/productListJason.do", new ProductList());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI(); // http://localhost/BoardWeb/main.do
//		System.out.println("URI : " + uri); //BoardWeb/main.do
		String context = req.getContextPath(); // /BoardWeb -> project name;
//		System.out.println("context : " + context);
		String page = uri.substring(context.length()); // main.do
//		System.out.println("page : " + page);

		Control result = map.get(page);
		result.exec(req, resp);
	}
}
