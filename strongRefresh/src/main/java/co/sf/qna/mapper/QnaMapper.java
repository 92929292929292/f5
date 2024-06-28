package co.sf.qna.mapper;

import java.util.List;

import co.sf.qna.vo.QnaVO;

public interface QnaMapper {
	List<QnaVO> qnaList();
	int insertQna(QnaVO qvo);
	int selectQna(String qnaSubject);
	int deleteQna(String qnaSubject);
	int updateQna(QnaVO qvo);

}
