package List_Problems;


import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        triangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {

            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {

        // Test Case 1
        int numRows1 = 5;
        System.out.println(generate(numRows1));

        // Test Case 2
        int numRows2 = 1;
        System.out.println(generate(numRows2));
    }
}
