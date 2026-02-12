package Array_Problems;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Update minimum price
            if (price < minPrice) {
                minPrice = price;
            }

            // Update max profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1)); // Output: 5

        // Test Case 2
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2)); // Output: 0
    }
}
