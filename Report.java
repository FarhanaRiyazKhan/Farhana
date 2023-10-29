package week1.day1;

/* Created a program to declare variables and to print in 'Report Class
by creating objects to variable 
 */


public class Report {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Variable from the class 'Student;
		//declaring the variables by object
		Student details = new Student();
		details.studentName = "Farhana";
		String name = details.studentName; 

		details.rollNo = 10;
		int rollNo     = details.rollNo;

		details.collegeName = "VIT";
		String collageName = details.collegeName;

		details.markScored = 1088;
		int markScored = details.markScored;

		details.cgpa = 88.9f;
		float cgpa = details.cgpa;

		System.out.println("Student Name : " + name); 
		System.out.println("Roll No : " + rollNo);
		System.out.println("Collage Name : " + collageName);
		System.out.println("Mark Scored : " + markScored);
		System.out.println("CGPA : " + cgpa);

	}

}
