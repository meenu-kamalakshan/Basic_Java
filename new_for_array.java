public class new_for_array {
	public static void main(String[] args){
		int array[]={3,5,7,8,9,2};
		int total =0;
		
		for (int x: array){
			total+=x;
		}
		
		System.out.println(total);
	}
}
