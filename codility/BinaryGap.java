class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);

        int maxGap = 0;
        int curGap = 0;
        boolean foundOne = false;

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);

            if (c == '1') {
                if (foundOne) {
                    maxGap = Math.max(maxGap, curGap);
                }
                foundOne = true;
                curGap = 0;  // ← 리셋 핵심!

            } else {
                if (foundOne) {
                    curGap++;
                }
            }
        }

        return maxGap;
    }
}
