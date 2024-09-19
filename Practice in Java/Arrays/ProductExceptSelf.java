
public class ProductExceptSelf {
    public static void main(String[] args) {

        // -1,1,0,-3,3

        int[] nums = { 1, 2, 3, 4 };

        System.out.println(java.util.Arrays.toString(Answer(nums)));
    }

    public static int[] Answer(int[] nums) {
        int size = nums.length;
        int[] productFromStart = new int[size];
        int[] productFromEnd = new int[size];
        int[] productAnswer = new int[size];

        productFromStart[0] = nums[0];
        for (int i = 1; i < size; i++) {
            productFromStart[i] = nums[i] * productFromStart[i - 1];
        }

        productFromEnd[size - 1] = nums[size - 1];
        for (int j = size - 2; j >= 0; j--) {
            productFromEnd[j] = nums[j] * productFromEnd[j + 1];
        }

        for (int k = 0; k < size; k++) {
            if (k == 0) {
                productAnswer[k] = productFromEnd[k + 1];
            } else if (k == size - 1) {
                productAnswer[k] = productFromStart[k - 1];
            } else {
                productAnswer[k] = productFromStart[k - 1] * productFromEnd[k + 1];
            }
        }

        return productAnswer;
    }
}
