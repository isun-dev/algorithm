class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int result = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                result = answer;
                break;
            }
        }
        return result;
    }
}