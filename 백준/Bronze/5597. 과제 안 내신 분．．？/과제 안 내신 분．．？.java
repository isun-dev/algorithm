import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] studentNo = new int[30];
        int[] studentPresented = new int[28];

        for (int i = 0; i < studentNo.length; i++) {
            studentNo[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            studentPresented[i] = sc.nextInt();
            for (int j = 0; j < studentNo.length; j++) {
                if (studentPresented[i] == studentNo[j]) {
                    studentNo[j] = 0;
                }
            }
        }

        for (int i = 0; i < studentNo.length; i++) {
            if (studentNo[i] != 0) {
                System.out.println(studentNo[i]);
            }
        }
    }
}
