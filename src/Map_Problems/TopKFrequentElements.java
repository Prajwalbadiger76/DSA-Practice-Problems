package Map_Problems;


import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String s : input) {
            int num = Integer.parseInt(s);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap (reverse logic for top k)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!map.get(a).equals(map.get(b))) {
                    return map.get(a) - map.get(b); // lower freq first
                }
                return b - a; // larger number first
            }
        );

        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll(); // remove lowest priority
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
