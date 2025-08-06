class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        char a = charArray[num1];
        char b = charArray[num2];

        charArray[num1] = b;
        charArray[num2] = a;

        return new String(charArray);
    }
}