package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classaction.Action;
import classaction.DebutAction;
import classaction.MyFactory;
import classaction.VerifAction;
import form.Form;
import form.LoginForm;


/**
 * Servlet implementation class ActionServelt
 */
public class ActionServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MyFactory f= new MyFactory();
	
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Action debut;
		 String provenance=request.getServletPath();
		 Form form=f.getForm( provenance);
		 /*debut=f.fact(provenance);
		 String resp=debut.execute(request, response,form);
		 getServletContext().getRequestDispatcher(resp).forward(request,response);*/
		 System.out.println(provenance);
		
	}

}
