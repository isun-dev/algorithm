class Solution {
    public int solution(int[] A) {
        long arrSum = 0;
            for (int i = 0; i < A.length; i++) {
                arrSum += A[i];
            }

            long sum = 0;
            for (int j = 1; j <= A.length + 1; j++) {
                sum += j;
            }

            return (int) (sum - arrSum);
    }
}
