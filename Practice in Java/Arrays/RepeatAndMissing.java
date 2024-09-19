public class RepeatAndMissing {
    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 5, 3 };

        findRandM(A);
    }

    public static void findRandM(final int[] A) {
        int len = A.length;

        long sum = 0, sumOfN = (len * (len + 1)) / 2;
        long sumOfSqr = 0, sumOfSqrOfN = (len * (len + 1) * (2 * len + 1)) / 6;

        for (int i = 0; i < len; i++) {
            sum += A[i];
            sumOfSqr += (long) A[i] * (long) A[i];
        }

        long val1 = sum - sumOfN;
        long val2 = sumOfSqr - sumOfSqrOfN;
        val2 = val2 / val1;

        long X = (val1 + val2) / 2;
        long Y = X - val1;

        System.out.println((int) X + " " + (int) Y);
    }
}
