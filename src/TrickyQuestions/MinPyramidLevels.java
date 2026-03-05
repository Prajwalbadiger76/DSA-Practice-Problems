package TrickyQuestions;
//Find the minimum number of pyramid levels such that the total blocks 1 + 2 + 3 + ... + level ≥ N.

import java.util.*;
import java.io.*;

public class MinPyramidLevels {

    public static int minLevels(int N) {

        int blocks = 0;
        int level = 1;

        while(blocks < N)
        {
            blocks += level;
            level++;
        }

        return level - 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(minLevels(N));
    }
}

//Test Case 1
//Input : 14
//Output : 5
//Explanation -> 1+2+3+4+5 = 15
//
//Test Case 2
//Input : 6
//Output : 3
//
//Test Case 3
//Input : 20
//Output : 6