import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중복을 허용하지 않는 HashSet 을 사용
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(hashSet.size());

    }
}