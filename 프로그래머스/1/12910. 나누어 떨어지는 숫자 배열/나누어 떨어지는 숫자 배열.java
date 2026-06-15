import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int n : arr){
            if(n % divisor == 0) {
                arrList.add(n);
            }
        }
        
        if(arrList.size()==0){
            return new int[]{-1};
        }
        
        Collections.sort(arrList);
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0;i < arrList.size();i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}