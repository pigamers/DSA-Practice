// import java.util.Arrays;
import java.util.HashMap;

public class Duplicate {
    public static boolean Dup(int[] nums) {
        /*int i=0;
        Arrays.sort(nums);

        while (i < nums.length - 1) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
            i++;
        }
        
        return false;
        */
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 1 };

        System.out.println(Dup(nums));
    }
}