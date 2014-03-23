
import java.util.Arrays;
public class Selection_sort {
	public static void main(String[] args){	
		int A[]={8,7,4,6,9};
		
		for (int i=0; i<A.length; i++){
			int small = A[i];
			int small_index = i;			
			for (int j= i+1; j<A.length; j++){
				 
				if (small > A[j]){
					small = A[j];
					small_index=j;
					}
			}
			//System.out.println("small index: " + small_index);
			//System.out.println("min: " + A[small_index]);
			//System.out.println("a-i " + A[i]);
			//System.out.println("small: " + small);
			A[small_index]= A[i];
			A[i]= small;
			System.out.println(Arrays.toString(A));
			}
		System.out.println(Arrays.toString(A));	
	}
		
}


