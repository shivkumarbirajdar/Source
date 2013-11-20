import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentApplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(1, "Sachin", "Mumbai");
		Student s2 = new Student(2, "Rohan", "Mumbai");
		Student s3 = new Student(3, "Sonam", "Pune");
		Student s4 = new Student(4, "Ashish", "Bhopal");
		Student s5 = new Student(5, "Bala", "Aurangabad");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		System.out.println("Before Sorting: " + students);
		Collections.sort(students);
		System.out.println("Default Sorting: " + students);
		
		//Sort student list by address
		Collections.sort(students, new AddressComparator());
		System.out.println("Address Sorting: " + students);
		
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("Raj");
		lists.add("Ravi");
		lists.add("Radha");
		lists.add("Roshan");
		lists.add("Arun");
		
//		System.out.println("Before Sorting: " + lists);
//		Collections.sort(lists);
//		System.out.println("After Sorting: " + lists);
		
	}

	private static final class AddressComparator implements
			Comparator<Student> {
		@Override
		public int compare(Student stud1, Student stud2) {
			
			return stud1.getAddress().compareTo(stud2.getAddress());
		}
	}
}
