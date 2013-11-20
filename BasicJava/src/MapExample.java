import java.util.HashMap;


public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Student, String> mapString = new HashMap<Student, String>();
		
		Student s1 = new Student(1, "Sachin", "Mumbai");   
		Student s2 = new Student(2, "Rohan", "Mumbai");    
		Student s3 = new Student(5, "Bala", "Aurangabad"); 
		Student s4 = new Student(5, "Bala", "Aurangabad"); 
		
		mapString.put(s1, "Sachin");
		mapString.put(s2, "Rohan");
		mapString.put(s3, "Sonam");
		mapString.put(s4, "Ashish");

		System.out.println(mapString);
		
		HashMap<Integer, String> mapInteger = new HashMap<Integer, String>();
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(5);
		Integer i4 = new Integer(5);
		                 
		mapInteger.put(i1, "Sachin");
		mapInteger.put(i2, "Rohan");
		mapInteger.put(i3, "Sonam");
		mapInteger.put(i4, "Ashish");

		System.out.println(mapInteger);

		
	}

}

//{[5, Bala]=Ashish, [5, Bala]=Sonam, [2, Rohan]=Rohan, [1, Sachin]=Sachin}
//{1=Sachin, 2=Rohan, 5=Ashish}

//{[1, Sachin]=Sachin, [2, Rohan]=Rohan, [5, Bala]=Ashish}
//{1=Sachin, 2=Rohan, 5=Ashish}













