public class arrays_in_methods {
	
	public static void main(String[] args){
		int array[]= {3,4,5,6,7,8,9};
		change(array);
		
		for(int y: array)
			System.out.println(y);
	}

	public static void change(int x[]){
		for (int counter=0; counter<x.length;counter++)
			x[counter]+=5;
	}
}
