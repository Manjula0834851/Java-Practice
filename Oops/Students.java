package Oops;

class TestStudents {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name);

	}
}

 class Students {
	public static void main(String args[]) {
		TestStudents s1 = new TestStudents();
		TestStudents s2 = new TestStudents();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.display();
		s2.display();
	}
}
