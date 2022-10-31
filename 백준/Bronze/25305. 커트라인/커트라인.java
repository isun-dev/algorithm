import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");
        int[] arrNum = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arrNum);
        System.out.println(arrNum[N - k]);
    }
}