package co.sf.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.sf.product.vo.ProductVO;

public interface ProductMapper {
	//목록
	List<ProductVO> selectList();
	List<ProductVO> selectListPaging(@Param("page") int page);
}
