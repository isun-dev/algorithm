import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }
        System.out.println(sum == X ? "Yes" : "No");
    }
}