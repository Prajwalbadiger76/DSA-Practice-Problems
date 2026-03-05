package TrickyQuestions;
//Find the minimum number of steps k such that the sum 1 + 2 + 3 + ... + k ≥ N.

import java.util.*;
import java.io.*;

public class MinSteps {
    public static int minSteps(int N) {
        int sum = 0;
        int step = 1;

        while(sum < N)
        {
            sum += step;
            step++;
        }

        return step - 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(minSteps(N));
    }
}

//Test Case 1
//Input : 8
//Output : 4
//
//Test Case 2
//Input : 3
//Output : 2
//
//Test Case 3
//Input : 15
//Output : 5