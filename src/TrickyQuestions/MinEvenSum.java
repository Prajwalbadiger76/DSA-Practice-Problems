package TrickyQuestions;
//Find the minimum even number i such that the sum 2 + 4 + 6 + ... + i ≥ N.

import java.util.*;
import java.io.*;

public class MinEvenSum {

    public static int minEven(int N) {

        int sum = 0;
        int i = 2;

        while(sum < N)
        {
            sum += i;
            i += 2;
        }

        return i - 2;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(minEven(N));
    }
}

//Test Case 1
//Input : 9
//Output : 6
//
//Test Case 2
//Input : 5
//Output : 4
//
//Test Case 3
//Input : 20
//Output : 8