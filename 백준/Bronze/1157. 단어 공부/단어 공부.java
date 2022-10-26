import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_lower = br.readLine().toLowerCase(); // 입력 받기
        int[] arr = new int[26]; // 알파벳 개수만큼 배열 생성

        for (int i = 0; i < str_lower.length(); i++) {
            arr[str_lower.charAt(i) - 97]++; // 알파벳 개수만큼 배열에 넣기
        }

        // 많이 사용된 알파벳이 여러개 있을 경우, 예를 들어 i 4개, j 4개 이런식으로!
        int max = -1;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                ch = '?';
            } else if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }

        }
        System.out.println(ch);
    }
}