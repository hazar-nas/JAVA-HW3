
public class Instructor extends User {
	String instructorNumber;
	
	

	public Instructor(int id ,String instructorNumber,String firstName , String lastName , String email , String password) {
		super(id , firstName , lastName , email, password);
		this.instructorNumber= instructorNumber;
	}
	
	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber= instructorNumber;
	}
	
	
}
