public class Reverse {

    static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    static void reverse(int[] nums) {
        int temp, i = 0, len = nums.length;

        while (i < len / 2) {
            temp = nums[i];
            nums[i] = nums[len - i - 1];
            nums[len - i - 1] = temp;

            i++;
        }

    }

    public static void main(String[] args) {

        int[] nums = { 10, 9, 8, 7, 6, 5, 4 };

        reverse(nums);
        printArray(nums);
    }
}
