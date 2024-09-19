import java.util.Scanner;

public class Rotated {
    public static int Rsearch(int[] nums, int target) {
        int i = 0, pos = 0, min = nums[0];
        int X = 0;
        while (i < nums.length) {
            if (min > nums[i]) {
                min = nums[i];
                pos = i;
            }
            i++;
        }

        if (nums[0] < target && target < nums[pos - 1]) {
            for (int j = 0; j < pos - 1; j++) {
                if (target == nums[i]) {
                    X = i;
                    break;
                }
            }
        } else if (nums[pos] <= target && target < nums[nums.length - 1]) {
            for (int k = pos; k < nums.length; k++) {
                if (target == nums[k]) {
                    X = k;
                    break;
                }
            }
        } else {
            X = -1;
        }

        return X;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println(Rsearch(nums, target));
    }
}

/*
int n = nums.length;
        int low = 0, high = n-1;
        int mid = -1;
        while(low <= high){
            mid = low + (high-low)/2;
            if(nums[mid] == target) return  mid;
            if(nums[mid] >= nums[low]){
                // left half sorted 
                if(target >= nums[low] && target < nums[mid]) high = mid-1;
                else low = mid+1;
            }
            else{
                // right half is sorted
                if( target > nums[mid] && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
*/
