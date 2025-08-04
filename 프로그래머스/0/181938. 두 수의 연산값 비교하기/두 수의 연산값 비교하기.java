class Solution {
    public int solution(int a, int b) {
        int c = Integer.parseInt(a + "" + b);
        int d = 2 * a * b;
        return Math.max(c, d);
    }
}