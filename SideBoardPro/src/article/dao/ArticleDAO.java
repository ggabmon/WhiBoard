package article.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import article.model.Article;
import jdbc.JDBCUtil;

public class ArticleDAO {
	PreparedStatement stmt=null;
	ResultSet rs=null;
	public List<Article> showAllArticle(Connection conn){
		String sql = "select * from article";
		List<Article> articleList = new LinkedList<>();
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int article_no = rs.getInt("article_no");
				String writer_id = rs.getString("writer_id");
				String title = rs.getString("title");
				String regdate = rs.getString("regdate");
				int read_cnt = rs.getInt("read_cnt");
				Article article = new Article(article_no, writer_id, title, regdate, read_cnt);
				articleList.add(article);
			}
			return articleList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt);
			JDBCUtil.close(rs);
			
		}
		
		return null;
	}
}
