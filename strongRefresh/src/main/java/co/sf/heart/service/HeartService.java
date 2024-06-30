package co.sf.heart.service;

import java.util.List;

import co.sf.product.vo.ProductVO;

public interface HeartService {
	// 찜 목록 출력
	List<ProductVO> heartList(String id);
	
	// 삭제
	boolean removeHeart(String pcode);

}
