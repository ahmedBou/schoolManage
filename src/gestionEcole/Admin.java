package gestionEcole;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("String fn", "String ln", "String em","String add", "String br", 12);
		s1.setEmail("email.gmail.com");
		
		System.out.println(s1.getEmail());
		
		
		//s1.email = "gmail";
		//System.out.println(s1.email);

	}

}
