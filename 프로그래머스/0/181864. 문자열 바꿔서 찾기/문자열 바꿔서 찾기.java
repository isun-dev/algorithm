class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) == 'A'){
                newString.append('B');
            }else{
                newString.append('A');
            }
        }
        
        return newString.toString().contains(pat) ? 1 : 0;
    }
}