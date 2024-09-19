// import java.util.Scanner;

public class NextPerm {

    public static void Next(int[] nums) {
        int idx1 = 0, idx2 = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 == 0) {
            reverse(nums);
        } else {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[idx1] < nums[j]) {
                    idx2 = j;
                    break;
                }
            }
        }

        swap(idx1, idx2, nums);
    }

    public static void reverse(int[] nums) {
        int temp;
        temp = nums[nums.length-1];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
    }

    public static void swap(int idx1, int idx2, int[] nums) {
        int temp;
        temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        Next(nums);

    }
}
