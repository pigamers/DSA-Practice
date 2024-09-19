import java.util.Arrays;

public class Maxmin {

    static int printMax(int[] nums) {
        int max = nums[nums.length - 1];
        return max;
    }

    static int printMin(int[] nums) {
        int min = nums[0];
        return min;
    }

    public static void main(String[] args) {

        int nums[] = { 10, 2, 45, 0, 5, 6 };
        Arrays.sort(nums);

        System.out.println(printMax(nums));
        System.out.println(printMin(nums));

    }
}
