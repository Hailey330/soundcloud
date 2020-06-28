package com.sc.soundcloud.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sc.soundcloud.action.Action;

public class BoardStreamAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dis = request.getRequestDispatcher("board/stream.jsp");
		dis.forward(request, response);
	}
}
