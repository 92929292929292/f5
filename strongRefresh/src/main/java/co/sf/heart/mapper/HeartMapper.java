package co.sf.heart.mapper;

import java.util.List;

import co.sf.heart.vo.HeartVO;

public interface HeartMapper {
	//찜 목록 쿼리
	List<HeartVO> heartList();
	
	//선택 상품 삭제 쿼리
	
	//전체 상품 삭제 쿼리 (장바구니 비우기)
}
