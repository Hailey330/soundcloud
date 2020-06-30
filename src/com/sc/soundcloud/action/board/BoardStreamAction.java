package com.sc.soundcloud.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sc.soundcloud.action.Action;
import com.sc.soundcloud.model.Board;
import com.sc.soundcloud.repository.BoardRepository;

public class BoardStreamAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. DB연결해서 Board 목록 다 불러오기
		BoardRepository boardRepository = BoardRepository.getInstance();
		List<Board> boards = boardRepository.findAll();
		
		request.setAttribute("boards", boards);

		RequestDispatcher dis = request.getRequestDispatcher("board/stream.jsp");
		dis.forward(request, response);
	}
}
