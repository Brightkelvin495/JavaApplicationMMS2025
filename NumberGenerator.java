import java.util.Random;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		//any integer
		System.out.println(rand.nextInt());
		
		//generate a specify number
		System.out.println(rand.nextInt(20)+1);
		
       //generate any double
	   System.out.println(rand.nextDouble());
	   
	   //generate any boolen
	    System.out.println(rand.nextBoolean());
	   
		
	}
}	