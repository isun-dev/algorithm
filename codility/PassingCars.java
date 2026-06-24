public class PassingCars {
    public int solution(int N, int[] A) {
        int zeroCount = 0;
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroCount++;
            } else {
                result += zeroCount;
                if (result > 1_000_000_000) {
                    return -1;
                }
            }
        }
        return result;
    }
}
