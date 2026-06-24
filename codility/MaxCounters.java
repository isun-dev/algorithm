public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        /**
         * maxVal  → 규칙1 실행될 때마다 업데이트 (현재 최댓값 추적)
         * lastMax → 규칙2 실행될 때만 업데이트 (기준값 저장)
         */
        int maxVal = 0;
        int lastMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (counters[A[i] - 1] < lastMax) {
                    counters[A[i] - 1] = lastMax;
                }
                counters[A[i] - 1] += 1;
                maxVal = Math.max(maxVal, counters[A[i] - 1]);
            } else {
                lastMax = maxVal;
            }
        }
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax;
            }
        }
        return counters;
    }
}
