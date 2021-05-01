
public class Main {

	public static void main(String[] args) {
		 Student student1 = new Student(1,"Hazar","Nas","hazar@gmail.com","123124","1234");
	     Instructor instructor = new Instructor(1242,"Fasdas","Nas","asd@gmail.com","123124","700");
		    
	        
	        User[] users = {student1};
	        
	        StudentManager studentManager = new StudentManager();
	        studentManager.addMultiple(users);
	        
	        
	        System.out.println();
	        InstructorManager instructorManager = new InstructorManager();
	        instructorManager.add(instructor);
	      
	        
	}

}
