import java.util.HashMap;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }
        return -1;

    }
}
