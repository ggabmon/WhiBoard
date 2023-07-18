package auth.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import auth.model.User;
import mvc.command.CommandHandler;
import service.LoginService;

public class LoginHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("loginId");
		String pw = request.getParameter("loginPw");
		LoginService loginService = new LoginService();
		User user = loginService.loginService(id, pw);
		HttpSession session = request.getSession();
		session.setAttribute("AUTH_USER", user);
		if(user!=null) {return request.getContextPath()+"/view/login/LoginSuccess.jsp";}
		else {return request.getContextPath()+"/view/login/LoginFail.jsp";}
	}
}
