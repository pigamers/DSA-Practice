import java.util.*;

public class KthLargest {
    public static void main(String[] args) {

        // 3,2,3,1,2,4,5,5,6

        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        System.out.println(findKl(nums, k));
    }

    public static int findKl(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }
        return pq.peek();
    }
}
