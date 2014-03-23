
public class Nested_if_else {
	public static void main(String[] args){
		int age = 60;
		
		if (age<50){
			System.out.println("You are Young");
		}else{
			System.out.println("You are Old");
			if(age>75){
					System.out.println("You are really OLD");
				}else{
					System.out.println("Dont worry , You are not that old");
					
				}
			}
	}

}
