package com.board.Service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> list() throws Exception; 
	
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO view(int bno) throws Exception;

	public void modify(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public int count() throws Exception;
	
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
}