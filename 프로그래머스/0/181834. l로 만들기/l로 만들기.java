class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) > 'l'){
                answer.append(myString.charAt(i));
            }else{
                answer.append('l');
            }
        }
        return answer.toString();
    }
}