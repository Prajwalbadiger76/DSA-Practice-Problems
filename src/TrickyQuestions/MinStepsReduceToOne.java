package TrickyQuestions;
//Find the minimum number of steps to reduce N to 1 using the operations:
//N → N/2 , N → N/3 , N → N-1.

import java.util.*;
import java.io.*;

public class MinStepsReduceToOne {

    public static int minSteps(int N) {

        int[] dp = new int[N + 1];

        dp[1] = 0;

        for(int i = 2; i <= N; i++)
        {
            dp[i] = dp[i - 1] + 1;

            if(i % 2 == 0)
            {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if(i % 3 == 0)
            {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[N];
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
//Input : 10
//Output : 3
//Explanation -> 10 → 9 → 3 → 1

//Test Case 2
//Input : 6
//Output : 2
//Explanation -> 6 → 3 → 1

//Test Case 3
//Input : 7
//Output : 3
//Explanation -> 7 → 6 → 3 → 1