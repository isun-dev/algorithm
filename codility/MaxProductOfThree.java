import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int maxMutiply1 = A[0] * A[1] * A[A.length - 1];
        int maxMutiply2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];

        return Math.max(maxMutiply1, maxMutiply2);
    }
}
