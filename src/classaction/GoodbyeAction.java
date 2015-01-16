package classaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public class GoodbyeAction implements Action{


	

	
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		return "/goobye.jsp";
	}
	
	

}
