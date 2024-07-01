package co.sf.heart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.sf.product.vo.ProductVO;

public interface HeartMapper {
	//찜 목록 쿼리
	List<ProductVO> heartList(@Param("userId") String id);
	
	// 삭제
	int deleteHeart(String pcode);
	
	//선택 상품 삭제 쿼리
	
	//전체 상품 삭제 쿼리 (장바구니 비우기)
}
