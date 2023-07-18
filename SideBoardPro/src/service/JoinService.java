package service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.connection.ConnectionProvider;
import member.dao.MemberDAO;
import member.model.Member;

public class JoinService {
		MemberDAO dao = new MemberDAO();
		public int JoinNewMember(Member member) throws SQLException {
			Connection conn = ConnectionProvider.getConnection();
			int ChangeCount= dao.joinNewMember(conn, member);
			conn.close();
			return ChangeCount;
		}
}
