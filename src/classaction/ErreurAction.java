package classaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public class ErreurAction implements Action{

	
	

	
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		return "/erreur.jps";
	}
	
	
}
