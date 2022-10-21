import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
       
        char[] bArray = b.toCharArray();

        System.out.println(a * (bArray[2] - '0'));
        System.out.println(a * (bArray[1] - '0'));
        System.out.println(a * (bArray[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
