import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
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
	
	

}
