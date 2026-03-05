package TrickyQuestions;
//Find the minimum number of moves required to reach stair N if you climb 1, 2, 3... steps in consecutive moves.

import java.util.*;
import java.io.*;

public class MinMovesStairs {

    public static int minMoves(int N) {

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

        System.out.print(minMoves(N));
    }
}

//Test Case 1
//Input : 6
//Output : 3
//
//Test Case 2
//Input : 10
//Output : 4
//
//Test Case 3
//Input : 3
//Output : 2