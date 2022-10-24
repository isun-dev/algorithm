import java.util.Scanner;

// 개선된 코드
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] studentNo = new int[31];

        for (int i = 1; i < 29; i++) {
            int presented = sc.nextInt();
            studentNo[presented] = 1;
        }

        for (int i = 1; i < studentNo.length; i++) {
            if (studentNo[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
