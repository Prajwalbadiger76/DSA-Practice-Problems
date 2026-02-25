package Binary_Search_Problems;

public class SquareRootBS {

    public static int sqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n;
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid == n) {
                return mid;
            }
            else if (mid * mid < n) {
                answer = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return answer;
    }
}