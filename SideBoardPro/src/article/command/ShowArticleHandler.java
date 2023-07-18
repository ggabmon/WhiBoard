package article.command;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import article.model.Article;
import article.service.ShowArticleService;
import mvc.command.CommandHandler;

public class ShowArticleHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ShowArticleService showArticleService = new ShowArticleService();
		List<Article> articleList = showArticleService.showAllArticle();
		HttpSession session3 = request.getSession();
		session3.setAttribute("ARTICLE", articleList);
		return request.getContextPath()+"/view/board/ShowArticle.jsp";
	}

}
