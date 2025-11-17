import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 1. 모든 종류의 갯수를 센다.
        // 2. 내가 가져갈 수 있는 폰켓몬의 갯수를 정한다. n/2
        // 3. 내가 가져갈 수 있는 포켓몬의 갯수와 계산했을때 가져갈 수 있는 폰켓몬의 수를 구해서, 그중 작은 수를 return 한다.
        
        int count = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return Math.min(map.size(), count);
    }
}