import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hasNextInt() : 입력값이 들어올때까지 while이 실행되지 않고, 들어오는 값이 int 일 경우 true를 반환한다.
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);

        }
    }
}
