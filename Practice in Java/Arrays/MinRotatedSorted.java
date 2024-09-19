public class MinRotatedSorted {
    public static void main(String[] args) {

        // 4,5,6,7,0,1,2

        int[] nums = { 3, 4, 5, 1, 2 };

        System.out.println(nums);

    }

    public static int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i = i + 2) {

            if (i != nums.length - 1) {
                int temp = Math.min(nums[i], nums[i + 1]);
                min = Math.min(min, temp);
            } else {
                min = Math.min(min, nums[nums.length - 1]);
            }
        }

        return min;
    }
}
