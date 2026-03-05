package TrickyQuestions;
//Find the minimum number of perfect squares whose sum equals N.

import java.util.*;
import java.io.*;

public class MinPerfectSquares {

    public static int minSquares(int N) {

        int[] dp = new int[N + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j * j <= i; j++)
            {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }

        return dp[N];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(minSquares(N));
    }
}

//Test Case 1
//Input : 12
//Output : 3
//Explanation -> 4 + 4 + 4

//Test Case 2
//Input : 13
//Output : 2
//Explanation -> 4 + 9

//Test Case 3
//Input : 16
//Output : 1
//Explanation -> 16