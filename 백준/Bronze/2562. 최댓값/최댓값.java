import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0;
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for (int i = 0; i < 9; i++) {
            if (temp < arr[i]) {
                index = i;
                temp = arr[i];
            }
        }
        System.out.println(temp);
        System.out.println(index + 1);
    }
}