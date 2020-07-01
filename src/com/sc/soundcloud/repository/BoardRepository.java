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

	public int findByMaxBoardId(int userId) {
		final String SQL = "SELECT max(id) FROM board WHERE userId = ?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findByMaxBoardId : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		return -1;
	}

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
			System.out.println(TAG + "update(id, title, content, fileImage) : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

	public int save(Board board) {
		final String SQL = "INSERT INTO board(id, userId, userName, title, content, likeCount, playCount, musicFile, fileImage, createDate) VALUES(board_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, board.getUserId());
			pstmt.setString(2, board.getUserName());
			pstmt.setString(3, board.getTitle());
			pstmt.setString(4, board.getContent());
			pstmt.setInt(5, board.getLikeCount());
			pstmt.setInt(6, board.getPlayCount());
			pstmt.setString(7, board.getMusicFile());
			pstmt.setString(8, board.getFileImage());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "save : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

	public int update(Board board) {
		final String SQL = "UPDATE board SET title = ?, content = ?, fileImage = ? WHERE userid = ? AND id = ?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getFileImage());
			pstmt.setInt(4, board.getUserId());
			pstmt.setInt(5, board.getId());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "update : " + e.getMessage());
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
			System.out.println(TAG + "deleteById : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

	public List<Board> findAll() { // 매개 변수가 필요없다. 어차피 다 찾을 거니까
		final String SQL = "SELECT * FROM board ORDER BY id DESC";
		List<Board> boards = new ArrayList<>();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// while 돌려서 rs → java 오브젝트에 넣기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board
						(
								rs.getInt("id"), 
								rs.getInt("userId"), 
								rs.getString("userName"),
								rs.getString("title"), 
								rs.getString("content"), 
								rs.getString("musicFile"),
								rs.getString("fileImage"), 
								rs.getInt("likeCount"), 
								rs.getInt("playCount"),
								rs.getTimestamp("createDate")
						);
				boards.add(board);
			}
			return boards;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}

	public Board findById(int id) {
		final String SQL = "SELECT * FROM board WHERE id = ?";
		Board board = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			// if 돌려서 rs → java 오브젝트에 넣기
			if(rs.next()) {
				board = new Board();
				board.setId(rs.getInt("id"));
				board.setUserId(rs.getInt("userId"));
				board.setUserName(rs.getString("userName"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setMusicFile(rs.getString("musicFile"));
				board.setFileImage(rs.getString("fileImage"));
				board.setLikeCount(rs.getInt("likeCount"));
				board.setPlayCount(rs.getInt("playCount"));
				board.setCreateDate(rs.getTimestamp("createDate"));

				return board;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findById : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}

}