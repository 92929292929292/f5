package co.sf.review.service;

import java.util.List;

import co.sf.review.vo.ReviewVO;

public interface ReviewService {
	List<ReviewVO> reviewList();
	boolean addReview(ReviewVO rvo);
	boolean getReview(String reviewSubject);
	boolean removeReview(String reviewSubject);
	boolean editReview(ReviewVO rvo);
}
