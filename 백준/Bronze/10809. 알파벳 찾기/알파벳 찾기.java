import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] location = new int[26]; // 위치
        List<Character> arr = new ArrayList<>();
        int index;
        // 모든 알파벳 저장
        for (char i = 'a'; i <= 'z'; i++) {
            arr.add(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            location[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            index = arr.lastIndexOf(s.charAt(i));
            if (location[index] != -1) {
                continue;
            }
            location[index] = i;
        }
        for (int i = 0; i < location.length; i++) {
            System.out.print(location[i] + " ");
        }
    }
}
