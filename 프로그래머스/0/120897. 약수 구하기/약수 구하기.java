import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }

        int[] arr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            arr[i] = answer.get(i);
        }

        return arr;
    }
}