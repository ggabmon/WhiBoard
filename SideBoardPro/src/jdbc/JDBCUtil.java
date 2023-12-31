package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	
	public static void rollback(Connection conn) throws SQLException {
		if(conn!=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			conn.rollback();
		}
		}
		
	}
	public static void close(ResultSet rs) {
		if(rs!=null) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
	public static void close(PreparedStatement stmt) {
		if(stmt!=null) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
	public static void close(Statement stmt) {
		if(stmt!=null) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
	
}
