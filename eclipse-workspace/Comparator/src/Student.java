
public class Student {
	private int id;
	private String firstName;
	private double cgpa;
	
	public Student(int id, String fName, double cgpa) {
		this.id = id;
		this.firstName = fName;
		this.cgpa = cgpa;
	}
	
	public String getFName() {
		return this.firstName;	
	}
	
	public int getID() {
		return this.id;
	}
	
	public double getCgpa() {
		return this.cgpa;
	}
	
}