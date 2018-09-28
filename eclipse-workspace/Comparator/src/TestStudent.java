import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;
import org.hamcrest.*;
import org.junit.Assert.*;

public class TestStudent{
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student(33,"Rumpa",3.68);
		Student student2 = new Student(85,"Ashis",3.85);
		Student student3 = new Student(56,"Samiha",3.75);
		Student student4 = new Student(19,"Samara",3.75);
		Student student5 = new Student(21,"Samara",3.75);
		
		
		List<Student> student = new ArrayList<Student>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);	
		
		Solution solution = new Solution();
		
		Collections.sort(student,solution);
	
	// Method when the comparison logic is defined with in the method	
	//Collections.sort(student, new Comparator<Student>() {

/*	public int compare(Student s1, Student s2) {
		if (s1.getCgpa()==s2.getCgpa()) {
			if(s1.getFName().equalsIgnoreCase((s2.getFName()))) {
				return (s1.getID() - s2.getID());
			} else {
				return (s1.getFName().compareTo(s2.getFName()));
			}
		} else if (s2.getCgpa() > s1.getCgpa()) {
			return 1 ;
		} else {
			return -1 ;
		}
	}

});*/
	
		//Asserting
		
	//asserThat(student.get(0).getFName(), is)	
	
	for(Student s : student) {
		System.out.println("Student : " + s.getFName() + " and ID is : " + s.getID());
	}
}}

