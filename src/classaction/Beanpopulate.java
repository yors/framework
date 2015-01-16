package classaction;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import form.Form;

public class Beanpopulate {
	
	
	
public static Object populate(Object o,Map<String, ?> param){
		
		
		Set<String> lesParam=param.keySet();
		
		
		for(String unParam:lesParam){
			String nom;
			//
			nom=FirstUpper(unParam);
			
		    nom="set"+nom;
			Class<? extends Object> c=o.getClass();
			Method m=null;
			try {
			  m	=c.getMethod(nom, String.class);

			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] value= (String[]) param.get(unParam);
		    try {
		   
				m.invoke(o,value );
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
					
		    
		}
		/// method.invoke(objet,{"martin"})
		
		return o;
	}
	

	public static String FirstUpper(String nom){
		
		char[] char_table = nom.toCharArray();
		char_table[0]=Character.toUpperCase(char_table[0]);
		nom = new String(char_table);
		
		return nom;
	}
	

	
}
