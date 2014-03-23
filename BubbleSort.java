import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args){
		
		int A[] ={12,24,11,10,9,8,7,6,5,4,3};
		
		for(int i=0; i<(A.length)-1; i++){
			for(int j=0; j<(A.length)-1-i; j++){
				if(A[j]>A[j+1]){
					int temp= A[j+1];
					A[j+1]= A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(A));		
	}
}
