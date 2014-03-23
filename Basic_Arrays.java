public class Basic_Arrays {
	public static void main(String[] args){
		System.out.println("Index\tValue");
		int newarray[]= {32,12,18,54,2};
		int sum =0; 
		
		for(int counter = 0; counter< newarray.length; counter++){	
				System.out.println(counter + "\t" +newarray[counter]);
		}
		for(int counter = 0; counter< newarray.length; counter++){	
			sum += newarray[counter];
		}
		
		System.out.println("The sum of array is "+ sum);
		
	}
	
}
