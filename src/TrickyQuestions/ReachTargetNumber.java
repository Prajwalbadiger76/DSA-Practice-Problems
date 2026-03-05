package TrickyQuestions;
//Find the minimum number of steps to reach exactly N starting from 0 if at step i you can move +i or -i.

import java.util.*;
import java.io.*;

public class ReachTargetNumber {

    public static int minSteps(int N) {

        N = Math.abs(N); // handle negative targets
        int sum = 0;
        int step = 0;

        while(sum < N || (sum - N) % 2 != 0)
        {
            step++;
            sum += step;
        }

        return step;
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
//Input : 3
//Output : 2
//Explanation -> +1 +2 = 3

//Test Case 2
//Input : 2
//Output : 3
//Explanation -> +1 -2 +3 = 2

//Test Case 3
//Input : 4
//Output : 3
//Explanation -> -1 +2 +3 = 4