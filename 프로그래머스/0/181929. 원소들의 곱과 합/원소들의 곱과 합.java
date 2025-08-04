class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;
        for (int a : num_list) {
            multiply *= a;
            sum += a;
        }
        if (multiply < (int) Math.pow(sum, 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}