import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // participant의 이름을 key값으로, Value에는 나타난 횟수를 해시맵에 저장
        // completion가 participant에 있으면 -1
        Map<String, Integer> participantMap = new HashMap<>();
        
        for(String key: participant){
            participantMap.put(key, participantMap.getOrDefault(key, 0) + 1);
        }
        
        for(String key: completion){
            participantMap.put(key, participantMap.getOrDefault(key, 0) - 1);
        }
        
        for (String key: participantMap.keySet()){
            if(participantMap.get(key) > 0 ){
                answer = key;
            }
        }
        
        return answer;
    }
}