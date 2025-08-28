import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n!=1){
            
            if(n%2==0){
                n=n/2;
                answer.add(n);
            }else{
                n=3*n+1;
                answer.add(n);
            }
        }
        int[] arr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            arr[i] = answer.get(i);
        }
        return arr;
    }
}