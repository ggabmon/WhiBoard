package mvc.command;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public interface CommandHandler {
	public String process(HttpServletRequest request,HttpServletResponse response) throws Exception;
}






