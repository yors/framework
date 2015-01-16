package classaction;

import java.util.HashMap;
import java.util.Map;

import form.Form;
import form.LoginForm;
import form.Page1Form;

public class MyFactory {
	
	parseurxml parse;
	
	
	public MyFactory()
	{
		
		parse=new parseurxml();
		
		
		
		
	}
	
 public Form getForm( String form) {
	 Class<?> c1=(Class<?>) parse.getMappingForm1().get(form);
	
	 if(c1!=null)
	 {
	 Form   a=null;
		 try {
			 a= (Form) c1.newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
		 return a;
 }
	 return null;
 }



 public  Action  fact(String path)
 {
	 Class<?> c=(Class<?>) parse.getMapping().get(path);
	 Action   a=null;
		 try {
			 a= (Action) c.newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
		}
	 
		 return a;
 }
}
