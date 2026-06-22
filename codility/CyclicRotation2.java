

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        K = K % A.length;

        for (int k = 0; k < K; k++) {
            int last = A[A.length - 1];

            for (int i = A.length - 1; i >= 1; i--) {
                A[i] = A[i - 1];

            }
            A[0] = last;
        }
        return A;
    }
}
