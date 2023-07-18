package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.connection.ConnectionProvider;
import member.dao.MemberDAO;

public class MemberDeleteService {

	public int memberDelete(String id) throws SQLException {
		Connection conn = null;
		MemberDAO memberdao = new MemberDAO();
		int delRow=0;
		try {
			conn = ConnectionProvider.getConnection();
			delRow = memberdao.MemberDelete(conn, id);
			return delRow;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return delRow;
	}
	
}
