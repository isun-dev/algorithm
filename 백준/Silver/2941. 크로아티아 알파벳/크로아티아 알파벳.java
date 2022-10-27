import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < arr.length; i++) {
            line = line.replace(arr[i], "a"); // 크로아티아 알파벳을 a로 바꿔준다.
        }
        System.out.println(line.length());
    }
}