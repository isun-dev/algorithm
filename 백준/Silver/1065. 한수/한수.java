import java.util.Scanner;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                count++; // 99까지는 모두 등차수열로 볼 수 있기 때문에, 무조건 카운트 해준다. 
            } else {
                if (n == 1000) {
                    n = 999;
                }
                AP(i);
            }
        }
        System.out.println(count);
    }

    public static int AP(int num) {
        String strNum = Integer.toString(num);
        int[] arr = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            arr[i] = strNum.charAt(i) - '0';
        }

        // 1000은 등차수열이 아니기 때문에 1000이 입력될 경우 999로 예외처리.
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] == arr[i + 2] - arr[i + 1]) {
                count++;
            }
        }

        return count;
    }
}