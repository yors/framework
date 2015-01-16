package classaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public class IndexAction implements Action {

	
	
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		 return "/index.html";
	}

}
