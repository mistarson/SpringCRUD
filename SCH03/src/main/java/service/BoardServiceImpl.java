package service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import dao.BoardDAO;
import domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void create(BoardVO vo) throws Exception {
		dao.create(vo);

	}

	@Override
	public List<BoardVO> listAll() throws Exception {

		return dao.listAll();
	}

	@Override
	public BoardVO read(Integer b_no) throws Exception {

		return dao.read(b_no);
	}

	@Override
	public void delete(Integer b_no) throws Exception {
		dao.delete(b_no);

	}

	@Override
	public void modify(BoardVO vo) throws Exception {

		dao.update(vo);

	}

}