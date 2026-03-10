import java.util.Scanner;

public class MethodOverLoading{
	public static void  main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("1 - calculate Area of a Square");
		System.out.println("2 - calculate Area of a Rectangle");
		System.out.println("3 - calculate Area of a Triangle");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			System.out.print("\nEnter the length of the sqaure: ");
			int square = input.nextInt();
			
			MethodOverLoading.area(square);
		break;
		
		    case 2:
			System.out.print("\nEnter the length of the Rectangle: ");
			int rectangleLenght = input.nextInt();
			
			System.out.print("Enter the breadth  of the Rectangle: ");
			int rectangleBreadth = input.nextInt();
			
			MethodOverLoading.area(rectangleLenght,rectangleLenght);
		break;

		case 3:
		    System.out.print("\nEnter the lenght of the Triangle: ");
			int triangleLength = input.nextInt();
			
			System.out.print("Enter the base of the Triangle: ");
			double base = input.nextDouble();
			MethodOverLoading.area(triangleLength,base);
		break;

        default:
		    System.out.print("Invalid Input ");
	}	
		
}
	
	public static void area(int length){
		int squareArea = (int)Math.pow(length,2);
		System.out.printf("The area of the square is %d",squareArea);
	}
	
	public static void area(int length,int breadth){
		int rectangleArea = length * breadth;
		System.out.printf("The area of the rectangle is %d",rectangleArea);
	}
	
    public static void area(int length,double base){
		double triangleArea = 0.5 * length * base;
		System.out.printf("The area of the Triangle is %.2f",triangleArea);
	}	
	
}