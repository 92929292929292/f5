package co.sf.review.mapper;

import java.util.List;

import co.sf.review.vo.ReviewVO;

public interface ReviewMapper {
	List<ReviewVO> reviewList();
	int insertReview(ReviewVO rvo);
	int selectReview(String reviewSubject);
	int deleteReview(String reviewSubject);
	int updateReview(ReviewVO rvo);	
}
