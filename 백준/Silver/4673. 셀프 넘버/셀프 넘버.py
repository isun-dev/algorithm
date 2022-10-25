// 풀기전 참고: https://junghn.tistory.com/entry/%EC%9E%90%EB%B0%94-int%EB%A5%BC-%EC%9E%90%EB%A6%BF%EC%88%98%EB%B3%84-int-%EB%B0%B0%EC%97%B4%EB%A1%9C-%EB%B6%84%ED%95%A0
public class Main {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[10001];

        for (int i = 1; i < 10001; i++) {
            if (d(i) < 10001) {
                arr[d(i)] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (arr[i] == null) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
