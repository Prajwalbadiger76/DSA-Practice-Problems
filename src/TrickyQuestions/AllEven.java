//Given an integer N, find the minimum operation number i such that the sum of all even numbers 
//up to i (2 + 4 + 6 + … + i) is greater than or equal to N.
package TrickyQuestions;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class AllEven {

    public static int allEven(int N){

        int result = -404;

        int converted = 0;
        int i = 2;

        while(converted < N){
            converted += i;
            result = i;
            i += 2;
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        System.out.print(allEven(N));
    }
}

//Test Case 1
//Input : 2
//Output : 2
//
//Test Case 2
//Input : 5
//Output : 4
//
//Explanation
//2 + 4 = 6 ≥ 5 → operation 4
//
//Test Case 3
//Input : 9
//Output : 6
//
//Explanation
//2 + 4 + 6 = 12 ≥ 9 → operation 6