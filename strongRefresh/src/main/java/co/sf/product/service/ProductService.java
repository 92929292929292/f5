package co.sf.product.service;

import java.util.List;

import co.sf.product.vo.ProductVO;

public interface ProductService {
	//제품 목록
	List<ProductVO> ProductList();
	List<ProductVO> ProductListPaging(int page);
}
