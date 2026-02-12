package List_Problems;

import java.util.*;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            // Update backwards to avoid overwriting values
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }

    public static void main(String[] args) {

        // Test Case 1
        System.out.println(getRow(3)); // [1,3,3,1]

        // Test Case 2
        System.out.println(getRow(0)); // [1]

        // Test Case 3
        System.out.println(getRow(1)); // [1,1]
    }
}
