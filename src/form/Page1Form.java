package form;

public class Page1Form implements Form{

	String attribut1;
	String attribut2;
	
	public boolean validate() {
		
		return true;
	}

	public String getAttribut1() {
		return attribut1;
	}

	public void setAttribut1(String attribut1) {
		this.attribut1 = attribut1;
	}

	public String getAttribut2() {
		return attribut2;
	}

	public void setAttribut2(String attribut2) {
		this.attribut2 = attribut2;
	}

	
	
}
