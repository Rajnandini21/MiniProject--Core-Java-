package coursemanagementsystem;

public class Course {
	
	
	private int days = 30;
	private int fees = 50000;
	
	public void show() {
		 String course[] = {"JAVA", "Web Designing", "Selenium "};
		 System.out.println("Courses Offered:");
		 for(int i=1; i< course.length; i++) {
			 System.out.println(course[i]);
		 }
	}
	
	public void values() {
		
		System.out.println(" Training Days: " +days);
		System.out.println("Fees: " +fees);
	}

}
