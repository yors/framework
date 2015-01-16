package classaction;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import form.Form;
import form.LoginForm;

public class VerifAction  implements Action {

	
	
	public String execute(HttpServletRequest request,
			HttpServletResponse response, Form form) {
		
		LoginForm f=(LoginForm)form;
		/////
		
		
		String log=request.getParameter("login");
	  	String pass=request.getParameter("pass");
	  	HttpSession session = request.getSession();
	  	session.setAttribute("nom", log);
	  	 LoginForm loginForm=(LoginForm)form;
	  	 Map lesParametres= request.getParameterMap();
	  	 
	  	loginForm=(LoginForm) Beanpopulate.populate(loginForm,lesParametres);
	  	
		System.out.println(" une pass "+loginForm.getPass());
		
		System.out.println(" une login "+loginForm.getLogin());

		 if(pass.isEmpty() || log.isEmpty())
			return "/erreur.jsp";
			 else
			return  "/page1.jsp";
	}

}
