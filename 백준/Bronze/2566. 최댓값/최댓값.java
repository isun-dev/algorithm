import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] arr = new int[9][9];

		for (int i = 0; i < 9; i++) {
			String[] strArr = br.readLine().split(" ");
			for (int j = 0; j < strArr.length; j++) {
				arr[i][j] = Integer.parseInt(strArr[j]);
			}
		}

		int num = 0;
		int rowOrder = 0;
		int columnOrder = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (num < arr[i][j]) {
					num = arr[i][j];
					rowOrder = i;
					columnOrder = j;
				}
			}
		}

		System.out.println(num);
		System.out.println((rowOrder + 1) + " " + (columnOrder + 1));
	}
}