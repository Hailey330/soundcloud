package com.sc.soundcloud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sc.soundcloud.db.DBConn;
import com.sc.soundcloud.model.Board;
import com.sc.soundcloud.model.Users;

// DAO
public class BoardRepository {

	private static final String TAG = "BoardRepository : ";
	private static BoardRepository instance = new BoardRepository();

	private BoardRepository() {
	}

	public static BoardRepository getInstance() {
		return instance;
	}

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	
	public int update(int id, String title, String content, String fileImage) {
		final String SQL = "UPDATE board SET title = ?, content = ?, fileImage = ? WHERE id = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, fileImage);
			pstmt.setInt(4, id);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "update(id, title, content, fileImage) : " +e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	
	public int save(Board board) {
		final String SQL = "INSERT INTO board(id, userId, title, content, likeCount, playCount, musicFile, fileImage, createDate) VALUES(board_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, board.getUserId());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getLikeCount());
			pstmt.setInt(5, board.getPlayCount());
			pstmt.setString(6, board.getMusicFile());
			pstmt.setString(7, board.getFileImage());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	
	public int update(Board board) {
		final String SQL = "UPDATE board SET title = ?, content = ?, fileImage = ? WHERE userid = ?";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getFileImage());
			pstmt.setInt(4, board.getUserId());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "update : " +e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	
	public int deleteById(int id) {
		final String SQL = "";
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "deleteById : " +e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	
	public List<Board> findAll() { // 매개 변수가 필요없다. 어차피 다 찾을 거니까
		final String SQL = "";
		List<Board> boards = new ArrayList<>();
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			
			// while 돌려서 rs → java 오브젝트에 넣기 
			
			return boards;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " +e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}
	
	public Board findById(int id) { // 매개 변수가 필요없다. 어차피 다 찾을 거니까
		final String SQL = "";
		Board board = new Board();
		
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			
			// if 돌려서 rs → java 오브젝트에 넣기 
			
			return board;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findById : " +e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}

}