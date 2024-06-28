package co.sf.review.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.sf.common.DataSource;
import co.sf.review.mapper.ReviewMapper;
import co.sf.review.vo.ReviewVO;

public class ReviewServiceImpl implements ReviewService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	ReviewMapper mapper = sqlSession.getMapper(ReviewMapper.class);
	
	@Override
	public List<ReviewVO> reviewList() {
		return mapper.reviewList();
	}
	@Override
	public boolean addReview(ReviewVO rvo) {
		return mapper.insertReview(rvo) == 1;
	}
	@Override
	public boolean getReview(String reviewSubject) {
		return mapper.selectReview(reviewSubject) == 1;
	}
	@Override
	public boolean removeReview(String reviewSubject) {
		return mapper.deleteReview(reviewSubject) == 1;
	}
	@Override
	public boolean editReview(ReviewVO rvo) {
		return mapper.updateReview(rvo) == 1;
	}

}
