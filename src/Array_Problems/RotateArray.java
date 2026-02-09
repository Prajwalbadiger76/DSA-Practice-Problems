package Array_Problems;
import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int k = 3;
		for(int i=0; i<k; i++) {
			rotate(arr);
		}
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		
	}
	public static void rotate(int[] arr) {
		int n = arr.length;
		int temp = arr[n-1];
		for(int i=n-2; i>=0 ;i-- ) {
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
	
	}
}
