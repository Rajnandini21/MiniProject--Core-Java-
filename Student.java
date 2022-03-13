package coursemanagementsystem;

public class Student {

	private String studentName;
	private String courseName;
	private String date;
	
	public void print() {
		System.out.println("\nStudent Name: " +studentName);
		System.out.println("Course Required: " +courseName);
		System.out.println("Joining Date " +date);

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
