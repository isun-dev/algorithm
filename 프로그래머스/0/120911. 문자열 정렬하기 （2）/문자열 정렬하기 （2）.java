import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] answer = my_string.toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }
}