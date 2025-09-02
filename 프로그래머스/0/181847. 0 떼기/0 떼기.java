class Solution {
    public String solution(String n_str) {
        return n_str.replaceFirst("^0+(?!$)", "");
    }
}