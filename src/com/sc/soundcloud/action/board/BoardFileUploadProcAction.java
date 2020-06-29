package com.sc.soundcloud.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Param;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sc.soundcloud.action.Action;
import com.sc.soundcloud.model.Board;
import com.sc.soundcloud.model.Users;
import com.sc.soundcloud.repository.BoardRepository;
import com.sc.soundcloud.util.Script;

public class BoardFileUploadProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 인증 확인 
		HttpSession session = request.getSession();
//		if(session.getAttribute("principal") == null) {
//			Script.getMessage("잘못된 접근!", response);
//			return;
//		}
		Users principal = (Users)session.getAttribute("principal");
		
		// 1. fileUpload.jsp 에서 넘긴 파일 받기
		String realPath = request.getServletContext().getRealPath("/upload");
		System.out.println("realPath : " + realPath);
		String contextPath = request.getServletContext().getContextPath();
		System.out.println("contextPath : " + contextPath);
	
		int id;
		String musicFile = null;
		int maxSize = 10 * 1024 * 1024;

		try {
			MultipartRequest multi = new MultipartRequest(request, realPath, maxSize, "UTF-8",
					new DefaultFileRenamePolicy());
			// request 되는 순간 null로 변함
			String fileName = multi.getFilesystemName("userFile");
			System.out.println("fileName : " + fileName);
			
			id = Integer.parseInt(multi.getParameter("id"));
			musicFile = contextPath + "/upload/" + fileName;
			System.out.println("musicFile : " + musicFile);
						
			// 2. DB 에 넣기
			Board board = Board.builder()
					.id(id)
					.userId(principal.getId())
					.musicFile(musicFile)
					.build();
			
			// 4. BoardRepository 연결해서 save(board) 함수 호출
			BoardRepository boardRepository = BoardRepository.getInstance();
			int result = boardRepository.save(board);
			
			// 5. DB 에 넣은 users.userfile 값 들고 이동
			if (result == 1) {	
				Script.href("/soundcloud/board?cmd=write&musicFile" + musicFile, response);
			} else {
				Script.back("ERROR! 다시 진행해주세요.", response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
