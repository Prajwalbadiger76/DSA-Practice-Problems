package TrickyQuestions;
//Find the minimum number of operations required to make all elements equal
//if in one operation you can increase N-1 elements by 1.

import java.util.*;
import java.io.*;

public class MinOperationsEqualArray {

    public static int minOperations(int[] arr) {

        int min = arr[0];
        int operations = 0;

        // Find minimum element
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        // Count total difference from minimum
        for(int i = 0; i < arr.length; i++)
        {
            operations += arr[i] - min;
        }

        return operations;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.print(minOperations(arr));
    }
}

//Test Case 1
//Input :
//3
//1 2 3
//Output : 3
//Explanation ->
//Operation 1 : increase 1,2 -> [2,3,3]
//Operation 2 : increase 2,3 -> [3,4,3]
//Operation 3 : increase 3,3 -> [4,4,4]

//Test Case 2
//Input :
//3
//1 1 1
//Output : 0
//Explanation ->
//All elements are already equal

//Test Case 3
//Input :
//4
//1 2 3 4
//Output : 6
//Explanation ->
//Total operations = (1-1)+(2-1)+(3-1)+(4-1) = 0+1+2+3 = 6