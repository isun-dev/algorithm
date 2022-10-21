import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int result = 0;
	        for(int i = 1 ; i < 10 ; i++){
	            result = N * i;
	            System.out.println(N+ " * " + i + " = " + result);
	        } 
            sc.close();
	}

}