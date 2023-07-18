package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import auth.model.User;
import jdbc.JDBCUtil;
import member.model.Member;

public class MemberDAO {
	ResultSet rs = null;
	PreparedStatement stmt = null;
	public int joinNewMember(Connection conn, Member member) throws SQLException {
		String sql="INSERT INTO MEMBER(USER_ID, USER_PW, USER_NAME, USER_BIRTH, USER_TLNO, USER_JOINDATE, USER_NICKNAME ,USER_GENDER) "
				+ "VALUES(?,?,?,?,?,NOW(),?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, member.getUser_id());
		stmt.setString(2, member.getUser_pw());
		stmt.setString(3, member.getUser_name());
		stmt.setString(4, member.getUser_birth());
		stmt.setString(5, member.getUser_tlno());
		stmt.setString(6, member.getUser_nickname());
		stmt.setString(7, member.getUser_gender());
		int ChangeCount = 0;
		try {
			ChangeCount = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			stmt.close();
		}
		return ChangeCount;
	}
	
	public User CheckPwById(Connection conn, String id, String pw) throws SQLException {
		String sql="SELECT * FROM MEMBER WHERE USER_ID = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, id);
		try {
			 rs=stmt.executeQuery();
			 String pwd;
			 String name;
			 while(rs.next()) {
				 pwd = rs.getString("USER_PW");
				 name = rs.getString("USER_NAME");
				 if(pwd.equals(pw)) {
					 User user = new User(id, name);
					 user.toString();
					 return user;
				 }else {
					 return null;
				 }
				 
			 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			stmt.close();
		}
		return null;
	}	
	
	public List<Member> MemberSelectAll(Connection conn){
		String sql = "SELECT * FROM MEMBER";
		List<Member> userList = new LinkedList<>();
		
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Member member = new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				userList.add(member);
			}
			if (userList!=null){return userList;}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(stmt);
		}
		return null;
		
	}

	public int MemberDelete(Connection conn, String id) {
		String sql = "DELETE FROM MEMBER WHERE USER_ID=?";
		int delRow=0;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			delRow = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return delRow;
		
	}
}
