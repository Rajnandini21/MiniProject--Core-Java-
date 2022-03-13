package coursemanagementsystem;
import java.util.Scanner; // import scanner class 

public class Main {
	
	

	public static void main(String[] args) 
	{
		 Course c = new Course();   // Create object of Course Class
		 c.show();
		 
		try (
		Scanner sc = new Scanner(System.in))             // Create new scanner object instance.
		{         
			System.out.println("\n Enter your Name:");  // Get input from the user in the console.
			String userName = sc.nextLine();   //  Read user input  

			
			System.out.println("\n Enter the course you need:"); // Get i/p from the user in the console
			String courseName = sc.nextLine();    // Read user input
			

			System.out.println("\n Enter the joining date:"); // Get i/p from the user in the console
			String date = sc.nextLine();   // Read user input
			  
			Student s = new Student();  //Create object of student class
			s.setStudentName(userName);   // Using object set the values
			s.setCourseName(courseName);
			s.setDate(date);
			s.print();               // Using student object access print method
		}

		
		c.values();            // Using course object access values method
	 
	}

}
