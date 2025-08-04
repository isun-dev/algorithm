class Solution {
    public int solution(int[] num_list) {
       StringBuilder odd = new StringBuilder(); // 홀수
        StringBuilder even = new StringBuilder(); // 짝수

        for (int a : num_list) {
            if (a % 2 == 0) {
                even.append(a);
            } else {
                odd.append(a);
            }
        }
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}