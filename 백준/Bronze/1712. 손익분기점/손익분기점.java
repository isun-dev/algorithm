import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);

        int A = Integer.parseInt(st.nextToken()); // 고정비용
        int B = Integer.parseInt(st.nextToken()); // 가변비용
        int C = Integer.parseInt(st.nextToken()); // 판매비용

        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }
}