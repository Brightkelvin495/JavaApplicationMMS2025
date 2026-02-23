import Java.Util.Scanner;
	
public class ProductCalculator{

    public static void main(String[] args){
	
	//This program will calculate the product of three integers
	Scanner input = new Scanner(System.in);
	
	//Declare the variables x,y,z and result to be of type int.
	int x,y,z, result;
	
	//prompt the user to enter the first integer.
	System.out.print("Enter the first integer: ");
	
	//Read the second integer from the user and store it in the variable y.
	 int y = input.nextInt();
	
	//Prompt the user to enter the third integer.
	System.out.print("Enter the third integer: ");
	
	//Read the third integer from the user and store it in the variable z.
	int z = input.nextInt();
	
	//Use System.out.printf to display the message "product is" followed by the value of the variable result.
	System.out.printf("Product is %d\n",result);
	
	result = x,y,z;
	
	System.out.printf("Product is %d\n",result);
	
	}
	
 }