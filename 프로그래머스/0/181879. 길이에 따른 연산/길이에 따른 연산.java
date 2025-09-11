class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        if(num_list.length >= 11){
            answer=0;
            for(int num:num_list){ 
                answer+=num;
            }
        }else{
            for(int num:num_list){
                answer*=num;
            }
        }
        return answer;
    }
}