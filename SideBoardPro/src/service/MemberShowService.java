package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.JDBCUtil;
import jdbc.connection.ConnectionProvider;
import member.dao.MemberDAO;
import member.model.Member;

public class MemberShowService {
	public List<Member> MemberSelectAll() throws SQLException{
		MemberDAO memberdao = new MemberDAO();
		Connection conn = null;
		List<Member> userList = null;
		try {
			conn = ConnectionProvider.getConnection();
			userList = memberdao.MemberSelectAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return userList;
	}
}
