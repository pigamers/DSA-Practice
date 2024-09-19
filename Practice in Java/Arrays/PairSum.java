public class PairSum {
    public static void main(String[] args) {
        int[] arr = { 11, 15, 6, 8, 9, 10 };

        int X = 16;

        System.out.println(Result(arr, X));
    }

    public static boolean Result(int[] arr, int X) {
        int n = arr.length;
        /*
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i + 1;
                break;
            }
        }
        
        int left = pivot;
        int right = pivot - 1;
        while (left != right) {
            if (arr[left] + arr[right] == X) {
                return true;
            } else if (arr[left] + arr[right] < X) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }
        */

        

        return false;
    }
}
