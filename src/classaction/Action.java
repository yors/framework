package classaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import form.Form;

public interface Action {
	
	public String execute(HttpServletRequest request, HttpServletResponse response,Form form);
	
	

}
