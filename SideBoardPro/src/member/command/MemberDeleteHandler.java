package member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberDeleteService;
import mvc.command.CommandHandler;

public class MemberDeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		MemberDeleteService memberDeleteService = new MemberDeleteService();
		int delRow = memberDeleteService.memberDelete(id);
		
		if(delRow==1) {return request.getContextPath()+"/view/admin/DeleteSuccess.jsp";}
		else {return request.getContextPath()+"/view/admin/DeleteFail.jsp";}
		
	}

}
