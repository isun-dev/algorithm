import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int result;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            result = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            result = num_list[num_list.length - 1] * 2;
        }

        answer[answer.length - 1] = result;
        return answer;
    }
}