import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복된 만큼 카운트를 줘서 풀기
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            int sum = 0;
            int repeatCount = 0;
            arr[i] = sc.next();
            char[] charArray = arr[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == 'X') {
                    repeatCount = 0;
                } else if (charArray[j] == 'O') {
                    repeatCount++;
                }
                sum += repeatCount;
            }
            System.out.println(sum);
        }
    }
}
