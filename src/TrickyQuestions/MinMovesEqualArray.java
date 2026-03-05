package TrickyQuestions;
//LeetCode 453: Minimum Moves to Make Array Equal
//Find the minimum number of moves required to make all array elements equal
//if in one move you can increment N-1 elements by 1.
//Key Insight -> Incrementing N-1 elements by 1 is equivalent to decrementing 1 element by 1.

import java.util.*;
import java.io.*;

public class MinMovesEqualArray {

    public static int minMoves(int[] arr) {

        int min = arr[0];
        int moves = 0;

        // Find minimum element
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        // Total moves needed
        for(int i = 0; i < arr.length; i++)
        {
            moves += arr[i] - min;
        }

        return moves;
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

        System.out.print(minMoves(arr));
    }
}

//Test Case 1
//Input :
//3
//1 2 3
//Output : 3
//Explanation ->
//Instead of increasing N-1 elements, we can imagine decreasing the maximum.
//[1,2,3] → decrease 3 → [1,2,2]
//[1,2,2] → decrease 2 → [1,1,2]
//[1,1,2] → decrease 2 → [1,1,1]

//Test Case 2
//Input :
//3
//1 1 1
//Output : 0
//Explanation ->
//All elements are already equal.

//Test Case 3
//Input :
//4
//1 2 3 4
//Output : 6
//Explanation ->
//Moves = (1-1) + (2-1) + (3-1) + (4-1)
//      = 0 + 1 + 2 + 3
//      = 6