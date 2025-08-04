import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int answer;
        Set<Integer> result = new HashSet<>(Arrays.asList(a, b, c));
        if (result.size() == 3) {
            answer = a + b + c;
        } else if (result.size() == 1) {
            answer =
                (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(
                    c, 3));
        } else {
            answer = (a + b + c) * (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        return answer;
    }
}