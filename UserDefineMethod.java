public class UserDefineMethod{
    public static String userName(String name){  // public method1:it returns userName
		
		return name;
	}	
	
	public static int checkAge(int age){  // public method2:it checks age 
	    if(age >= 18){
			System.out.println(UserDefineMethod.userName("Bright Kelvin ") + "you are an adult");
		}
		else{
			System.out.println(UserDefineMethod.userName("Bright Kelvin ") + "you are still a minor");
		
		}
        return age;		
    }
	
    public static void main(String[] args){  // main methed is the Boss, it calls checkAge Calls userName and returns bright kelvin
		System.out.println(UserDefineMethod.checkAge(25));	
	}
	
}	