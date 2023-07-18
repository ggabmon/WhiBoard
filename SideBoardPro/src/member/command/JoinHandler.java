package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import auth.model.User;
import member.model.Member;
import mvc.command.CommandHandler;
import service.JoinService;

public class JoinHandler implements CommandHandler {
	JoinService joinService = new JoinService();
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("JoinHandler.java 시작");
		request.setCharacterEncoding("UTF-8");
		String id =request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String birthdate = request.getParameter("birthdate");
		String tlno = request.getParameter("tlno");
		String nickname = request.getParameter("nickname");
		String gender = request.getParameter("gender");
		Member member = new Member(id, pw, name, birthdate, tlno, nickname, gender);
		System.out.println(member.toString());
		int ChangeCount = joinService.JoinNewMember(member);
		if(ChangeCount==0) {return request.getContextPath()+"/view/join/JoinFail.jsp";}
		else {return request.getContextPath()+"/view/join/JoinSuccess.jsp";	}
		
	}

}
