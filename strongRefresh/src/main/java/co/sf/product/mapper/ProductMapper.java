package co.sf.product.mapper;

import java.util.List;

import co.sf.product.vo.ProductVO;

public interface ProductMapper {
	//목록
	List<ProductVO> selectList();
}
