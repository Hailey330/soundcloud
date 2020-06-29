package com.sc.soundcloud.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sc.soundcloud.action.Action;
import com.sc.soundcloud.model.Board;
import com.sc.soundcloud.model.Users;
import com.sc.soundcloud.repository.BoardRepository;
import com.sc.soundcloud.repository.UsersRepository;
import com.sc.soundcloud.util.Script;

public class BoardWriteProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. write.jsp 에서 넘긴 파일 받기
		String realPath = request.getServletContext().getRealPath("/upload");
		System.out.println("WriteRealPath : " + realPath);
		String contextPath = request.getServletContext().getContextPath();
		System.out.println("WriteContextPath : " + contextPath);
	
		String fileImage = null;
		int maxSize = 10 * 1024 * 1024;

		try {
			MultipartRequest multi = new MultipartRequest
					(
							request, 
							realPath, 
							maxSize, 
							"UTF-8",
							new DefaultFileRenamePolicy()
					);
			// request 되는 순간 null로 변함
			String imageName = multi.getFilesystemName("musicImage");
			System.out.println("imageName : " + imageName);
			
			int id = Integer.parseInt(multi.getParameter("id"));
			String title = multi.getParameter("title");
			String content = multi.getParameter("content");
			String musicFile = multi.getParameter("musicFile");

			fileImage = contextPath + "/upload/" + imageName;
			System.out.println("fileImage : " + fileImage);
			
			// 2. DB 에 넣기
			Board board = Board.builder()
					.userId(id)
					.title(title)
					.content(content)
					.fileImage(fileImage)
					.musicFile(musicFile)
					.build();
			
			System.out.println("board ::: " + board);
			
			// 2. BoardRepository 연결해서 update(board) 함수 호출
			BoardRepository boardRepository = BoardRepository.getInstance();
			int result = boardRepository.update(board);
			System.out.println("result :::" + result);
			
			// 5. 페이지 이동
			if (result == 1) {	
			
				Script.href("/soundcloud/board?cmd=home", response);
//				Script.href("/soundcloud/board?cmd=detail&id" + id, response);
			} else {
				Script.back("ERROR! 다시 진행해주세요.", response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
