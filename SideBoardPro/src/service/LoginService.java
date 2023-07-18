package service;

import java.sql.Connection;
import java.sql.SQLException;

import auth.model.User;
import jdbc.connection.ConnectionProvider;
import member.dao.MemberDAO;

public class LoginService {
	public User loginService(String id, String pw) throws SQLException {
		Connection conn = ConnectionProvider.getConnection();
		MemberDAO dao = new MemberDAO();
		User user = dao.CheckPwById(conn, id, pw);
		return user;
	}
}
