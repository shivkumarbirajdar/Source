public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private String address;

	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return new Integer(rollNo).hashCode() + name.hashCode()
				+ address.hashCode();
	}

	@Override
	public boolean equals(Object arg0) {
		Student temp = (Student) arg0;
		return this.rollNo == temp.getRollNo()
				&& this.name.equals(temp.getName())
				&& this.address.equals(temp.getAddress());
	}

	@Override
	public String toString() {
		return "[" + rollNo + ", " + name + "]";
	}

	@Override
	public int compareTo(Student stud) {
		return this.name.compareTo(stud.getName());
	}

}
