package classaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public class DebutAction  implements Action{

	

	
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		return "/verif.do";
	}

}
