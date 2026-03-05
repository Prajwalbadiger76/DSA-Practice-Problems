package TrickyQuestions;
//Find the minimum number of steps required to reach or cross position N if in step i you move i units.

import java.util.*;
import java.io.*;

public class MinMovesPosition {

    public static int minMoves(int N) {

        int position = 0;
        int step = 1;

        while(position < N)
        {
            position += step;
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