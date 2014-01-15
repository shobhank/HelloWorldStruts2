package org.shobhank.struts2;

public class HelloWorldAction {
	private String name;

	public String execute(){
		System.out.println(getName());
		if(!getName().equals("")){
			return "Success";
		}	
		else{
			return "Failed";
		}			
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
