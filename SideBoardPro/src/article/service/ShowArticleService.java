package article.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import article.dao.ArticleDAO;
import article.model.Article;
import jdbc.JDBCUtil;
import jdbc.connection.ConnectionProvider;

public class ShowArticleService {
	public List<Article> showAllArticle() throws SQLException {
		Connection conn = null;
		List<Article> aritcleList=null;
		try {
			conn = ConnectionProvider.getConnection();
			ArticleDAO articleDAO = new ArticleDAO();
			aritcleList = articleDAO.showAllArticle(conn);
			return aritcleList;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return null;
	}
}
