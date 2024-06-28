package co.sf.qna.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.sf.common.DataSource;
import co.sf.qna.mapper.QnaMapper;
import co.sf.qna.vo.QnaVO;

public class QnaServiceImpl implements QnaService{
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	QnaMapper mapper = sqlSession.getMapper(QnaMapper.class);
	
	@Override
	public List<QnaVO> qnaList() {
		return mapper.qnaList();
	}
	@Override
	public boolean addQna(QnaVO qvo) {
		return mapper.insertQna(qvo) == 1;
	}
	@Override
	public boolean getQna(String qnaSuject) {
		return mapper.selectQna(qnaSuject) == 1;
	}
	@Override
	public boolean removeQna(String qnaSuject) {
		return mapper.deleteQna(qnaSuject) == 1;
	}
	@Override
	public boolean editQna(QnaVO qvo) {
		return mapper.updateQna(qvo) == 1;
	}

}
