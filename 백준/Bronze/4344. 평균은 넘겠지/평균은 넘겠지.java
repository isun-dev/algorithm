import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr;

        for (int i = 0; i < count; i++) {
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double average = sum / N;
            double greaterThanAverage = 0;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > average) {
                    greaterThanAverage++;
                }
            }
            double result = greaterThanAverage / N;
            System.out.println(String.format("%.3f", result * 100) + "%");
        }
    }
}