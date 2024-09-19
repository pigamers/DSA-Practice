public class MaxSubArray {
    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0)
                sum = 0;
        }

        return max;

    }

    public static void main(String[] args) {
        int[] nums = { -1 };
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
