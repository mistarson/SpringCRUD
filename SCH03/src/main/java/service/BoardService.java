package service;

import java.util.List;

import domain.BoardVO;

public interface BoardService {
	public void create(BoardVO vo) throws Exception;

	public List<BoardVO> listAll() throws Exception;

	public BoardVO read(Integer b_no) throws Exception;

	public void delete(Integer b_no) throws Exception;

	public void modify(BoardVO vo) throws Exception;

}
