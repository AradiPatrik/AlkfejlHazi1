package hu.aradipatrik.appdev.model;

public class AddCustomerFormData {
	
	public String name;
	public int age;
	public boolean isMale;
	public boolean isFemale;
	public boolean grantee;
	public String qualification;
	
	public AddCustomerFormData(String name, int age, boolean isMale, boolean isFemale, boolean grantee,
			String qualification) {
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.isFemale = isFemale;
		this.grantee = grantee;
		this.qualification = qualification;
	}
	
}
