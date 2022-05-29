package week3.day1;

//Overloading concepts - Method Name should be same with different number of arugments
public class Students {
	
	
	  public void getStudentInfo(int Id) {
	  
	  System.out.println("Student Id: "+Id);
	  
	  } 
	  public void getStudentInfo(int Id, String name) {
	  
	  System.out.println("Student Id: "+Id+"  : Name : "+name);
	  
	  }
	  
	  public void getStudentInfo(String email, int PhoneNumber) {
	  System.out.println("Student Email : "+email+" :phonenumber: "+PhoneNumber); }
	 
	
	public static void main(String[] args) {
		  Students students = new Students();
		  students.getStudentInfo(1001);
		  students.getStudentInfo(1001, "Sumitha"); 
		  students.getStudentInfo("testleaf@gmail.com", 901010000);
		  
		  Students students1 = new Students(); 
		  students1.getStudentInfo(1002);
		  students1.getStudentInfo(1002, "TestLeaf");
		  students1.getStudentInfo("testleaf@gmail.com", 910010000);
		 
	}

}
