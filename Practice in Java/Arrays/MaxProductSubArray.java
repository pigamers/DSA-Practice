public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = { 0,2 };

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int left = 1;
        int right = 1;
        int maxproduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (left == 0)
                left = 1;
            if (right == 0)
                right = 1;
            left = left * nums[i];
            right = right * nums[nums.length - i - 1];
            maxproduct = Math.max(maxproduct, Math.max(left, right));
        }
        return maxproduct;
    }
}
