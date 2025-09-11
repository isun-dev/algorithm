import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int k : arr) {
            arrList.add(k);
        }

        ArrayList<Integer> deleteList = new ArrayList<>();
        for (int j : delete_list) {
            deleteList.add(j);
        }

        for (Integer integer : deleteList) {
            arrList.remove(integer);
        }

        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}