import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int number: arr){
            if(stack.isEmpty()){
                stack.push(number);
            }else if(!stack.peek().equals(number)){
                stack.push(number);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = stack.size()-1; i >= 0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}