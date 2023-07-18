package member.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.Member;
import mvc.command.CommandHandler;
import service.MemberShowService;

public class MemberShowHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//파라미터 없음
		//비즈니스로직 - 리스트에 멤버 담아와서 세션으로 출력하기
		MemberShowService memberShowService = new MemberShowService();
		List<Member> userlist = memberShowService.MemberSelectAll();
		HttpSession session2 = request.getSession();
		session2.setAttribute("USER", userlist);
		
		return request.getContextPath()+"/view/admin/UserManagement.jsp";
	}

}
