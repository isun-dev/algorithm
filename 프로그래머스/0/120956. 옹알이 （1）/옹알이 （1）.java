class Solution {
    public int solution(String[] babbling) {
        int answer = 0; // 발은 가능한 단어 갯수
        String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"}; // 발음 가능한 단어
        for (String word : babbling) {
            String prev = ""; // 직전에 발음한 단어
            boolean isValid = true;  // 발음 가능한지 확인 
            int index = 0; // 어디까지 읽었는지 확인

            while (index < word.length()) {
                boolean matched = false; // 현재 위치에서 발음 가능한 단어를 찾았는지
                for (String speak : canSpeak) {
                    if (word.startsWith(speak, index)) {
                        if (speak.equals(prev)) {
                            isValid = false;
                            break;
                        }
                        prev = speak;
                        index += speak.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                answer++;
            }
        }

        return answer; 
    }
}