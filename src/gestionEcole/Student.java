package gestionEcole;

public class Student {
	String firstname, lastname, address, email, branche;
	int age;
	
	public Student(String fn, String ln, String em,String add, String br, int age) {
		this.age = age;
		this.firstname = fn;
		this.lastname = ln;
		this.address = add;
		this.branche = br;
		this.email = em;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getFirstname() {
		return this.firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public String getAddress() {
		return this.address;
	}
	public String getBranch() {
		return this.branche;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String em) {
		this.email = em;
	}
	
}