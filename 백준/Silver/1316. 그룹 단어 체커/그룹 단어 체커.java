import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (check(sc.next())) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static boolean check(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String word = str.substring(i, i + 1);
            if (!list.contains(word)) {
                list.add(word);
            } else if (str.charAt(i - 1) != str.charAt(i)) {
                // 리스트에 있는데 값이 다르면 false
                return false;
            }
        }
        return true;
    }
}
