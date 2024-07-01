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
import co.sf.heart.web.HeartForm;
import co.sf.heart.web.HeartList;
import co.sf.order.web.OrderForm;
import co.sf.orderDetail.web.OrderDetailForm;
import co.sf.product.web.ProductForm;
import co.sf.product.web.ProductList;
import co.sf.qna.web.QnaForm;
import co.sf.user.web.CheckIdAjax;
import co.sf.user.web.FindIdForm;
import co.sf.user.web.FindPwForm;
import co.sf.user.web.JoinControl;
import co.sf.user.web.JoinForm;
import co.sf.user.web.LoginControl;
import co.sf.user.web.LoginForm;
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

		// 찜 화면으로 이동
		map.put("/heart.do", new HeartForm());
		// 찜 목록 요청
		map.put("/heartList.do", new HeartList());

		map.put("/order.do", new OrderForm());
		map.put("/orderdetail.do", new OrderDetailForm());

		// 제품 페이지
		map.put("/productForm.do", new ProductForm());
		// 제품 페이지에 제품 출력
		map.put("/productListJason.do", new ProductList());

		map.put("/qnaForm.do", new QnaForm());

		// 로그인
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new LoginControl());

		// 회원가입
		map.put("/joinForm.do", new JoinForm());
		map.put("/join.do", new JoinControl());
		
		//아이디 중복체크
		map.put("/checkIdAjax.do", new CheckIdAjax());


		// 아이디찾기
		map.put("/findId.do", new FindIdForm());
		// 비밀번호찾기
		map.put("/findPw.do", new FindPwForm());

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
