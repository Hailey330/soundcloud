package com.sc.soundcloud.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.sc.soundcloud.action.Action;

public class BoardFileUploadProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String realPath = request.getServletContext().getRealPath("upload");
		int id;
		String fileName = null;
		String contextPath = request.getServletContext().getContextPath();
		String userFile = null; // DB에 들어갈 변수
		
		System.out.println("realPath : " + realPath);
		System.out.println("contextPath : " + contextPath);
		
//		MultipartRequest multi = new MultipartRequest(request, realPath, )
		
		
	}
}
