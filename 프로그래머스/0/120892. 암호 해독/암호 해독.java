class Solution {
    public String solution(String cipher, int code) {
       StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= cipher.length(); i++){
             if(i % code == 0){
               sb.append(cipher.charAt(i - 1));
             }
        }
        return sb.toString();
    }
}