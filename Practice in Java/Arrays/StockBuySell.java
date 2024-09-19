public class StockBuySell {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 }; // 2, 4, 1,

        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] nums) {
        int len = nums.length - 1, maxprofit = 0;

        int minsofar = nums[0];

        for (int i = 0; i < len; i++) {
            minsofar = Math.min(minsofar,nums[i]);
            int profit = nums[i] - minsofar;

            maxprofit = Math.max(maxprofit,profit);
        }

        // System.out.println("Max: " + max +" Min:" + min );
        return maxprofit;
    }
}
