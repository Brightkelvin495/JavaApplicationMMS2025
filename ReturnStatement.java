public class ReturnStatement{
    public static void main(String[] args){
	    System.out.println(ReturnStatement.addition());
	}
	public static int addition(){   // static statement: its belongs to a class
	    int num1 = 20;
		int num2 = 60;
		int num3 = 25;
		
		int sum = num1 + num2 + num3;
		
		return sum;
	}	
}	