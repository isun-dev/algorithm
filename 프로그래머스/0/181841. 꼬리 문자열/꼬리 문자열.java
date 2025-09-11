class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder endStr = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].contains(ex)) {
                str_list[i] = str_list[i].replace(str_list[i], "");
            }
        }
        for (String str : str_list) {
            endStr.append(str);
        }

        return endStr.toString();
    }
}