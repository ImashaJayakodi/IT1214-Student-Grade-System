import java.util.*;

class Main{
	private static ArrayList <Student> studentList= new ArrayList<>();
	private static Scanner sc =new Scanner(System.in);
	
	
 public static void main(String[]arg){
	int choice;
	
	do{
		System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add a Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search for a Student by ID");
            System.out.println("4. Calculate and Display Average Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
		
		
		choice = sc.nextInt();
            sc.nextLine(); 

            
	}while (choice != 5);	
        
			
		
	}
 
 }