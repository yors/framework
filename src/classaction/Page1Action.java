package classaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public class Page1Action implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		
		return "/aur.jsp";
	}

}
