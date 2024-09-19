public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1 };

        System.out.println(singleNo(nums));
    }

    public static int singleNo(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}