package domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dao.BoardDAO;

@Repository
public class BoardDAOImp implements BoardDAO {

	@Inject
	private SqlSession sqlSession;

	private static String namespace = "mapper.boardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace + ".insertBoard", vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listBoard");
	}

	@Override
	public BoardVO read(Integer b_no) throws Exception {		
		return sqlSession.selectOne(namespace + ".detailBoard", b_no);
	}

	@Override
	public void delete(Integer b_no) throws Exception {
		sqlSession.delete(namespace + ".deleteBoard", b_no);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace + ".updateBoard", vo);
	}

}
