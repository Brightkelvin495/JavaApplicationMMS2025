public class OPeratorsPart2{
     public static void main(String[] args){
	     int num1 = 70;
		 int num2 = 50;
		 int num3 = 120;
		 
		 //Logical Operators (&&,||,!)
		 
		 boolean result = (num1 > num2) && (num1 > num3);
		 System.out.printf("The result is %b",result);
		 
		 boolean andResult = (num1 > num2) && (num1 != num3);
		 System.out.printf("The AND result is %b%n", andResult);
		 
		 boolean orResult = (num1 > num2) || (num1 == num3);
		 System.out.printf("The OR result is %b%n", orResult);
		 
		 boolean notResult = !((num1 > num2) || (num1 == num3));
		 System.out.printf("The NOT result is %b%n", notResult);
		 
		 //unary operators(++,_ _)
		 int x = 5;
		 int y = ++x;
		 ++x;
		 
		 System.out.println("The value of x is "+ x);
		 System.out.println("The value of y is "+ y);
		 
		 x = 5;
		 y = x++;
		 
		 System.out.println("The value of x is "+ x);
		 System.out.println("The value of y is "+ y);
		 
		 
		 y = ++x;
		 ++x;
		 
		 System.out.println("The value of x is "+ x);
		 System.out.println("The value of y is "+ y);
		 
		 //Unary Decrement operator
		 --x;
		 --x;
		 y = ++x;
		 
		 System.out.println("The value of decrement x is "+ x);
		 System.out.println("The value of decrement y is "+ y);
		 
		 x = 5;
		 y = x--;
		 
		 System.out.println("The value of x is "+ x);
		 System.out.println("The value of y is "+ y);
		 
		 
		 
	}
	 	 
}	 