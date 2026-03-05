package TrickyQuestions;
//Find the minimum number of operations required to fill N buckets if operation i fills i buckets.

import java.util.*;
import java.io.*;

public class MinOperationsBuckets {

    public static int minOperations(int N) {

        int sum = 0;
        int operation = 1;

        while(sum < N)
        {
            sum += operation;
            operation++;
        }

        return operation - 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(minOperations(N));
    }
}

//Test Case 1
//Input : 11
//Output : 5
//
//Test Case 2
//Input : 3
//Output : 2
//
//Test Case 3
//Input : 20
//Output : 6