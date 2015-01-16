package classaction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import form.Form;
import form.LoginForm;
import form.Page1Form;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class parseurxml {
	Map mapping=new HashMap();
	Map mappingForm1=new HashMap();


	public parseurxml() {
		
		
		String fichier = "C:\\Users\\yorick\\workspace\\Framework\\WebContent\\action.xml";
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document;
			document = builder.parse(fichier);
			Element racine = document.getDocumentElement();
			NodeList bases = racine.getElementsByTagName("action");
			System.out.println( bases.getLength());
			for (int i = 0; i < bases.getLength(); i++) {
				Node base = bases.item(i);
				NodeList elements = base.getChildNodes();
				Class<?> s2=null;
				Class<?> s3=null;
				String s1="";
				for (int j = 0; j < elements.getLength(); j++) {
					Node enfant = elements.item(j);
					
					if(enfant.getNodeName().equals("action-name"))
							s2=Class.forName(enfant.getTextContent());
					if(enfant.getNodeName().equals("url-pattern"))
						s1=enfant.getTextContent();
					if(enfant.getNodeName().equals("form-name")   )
					{
						if(enfant.getTextContent().equals("0"))
						{
							
						}
						else
						{
							
					    s3=Class.forName(enfant.getTextContent());
						mappingForm1.put(s1,s3);
						}

					}
					mapping.put(s1,s2);
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Map getMapping() {
		return mapping;
	}


	public void setMapping(Map mapping) {
		this.mapping = mapping;
	}


	public Map getMappingForm1() {
		return mappingForm1;
	}


	public void setMappingForm1(Map mappingForm1) {
		this.mappingForm1 = mappingForm1;
	}


}
