class Solution {
    public int solution(int a, int b) {
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        int word = Integer.parseInt( c + d ) ;
        int word2 = Integer.parseInt( d + c ) ;
        return Math.max(word, word2);
    }
}