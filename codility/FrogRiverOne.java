import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
