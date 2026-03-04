import java.util.Scanner;

public class CandidateTextCheck{
    public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	      
        System.out.print("Enter Full Name: ");
        String fullName = scan.nextLine();

        System.out.print("Enter Engligh Score: ");
        int engligh = scan.nextInt();		
		
		System.out.print("Enter Maths Score: ");
        int maths = scan.nextInt();	
		
		System.out.print("Enter ICT Score: ");
        int ict = scan.nextInt();
		
		double average = (engligh + maths + ict)/3;
		
		if(average > 75 && average >= 80){
		     System.out.print("Employment letter sent");
        }			 
        else{
             System.out.println("Rejection letter sent");		
       }
	}
 }