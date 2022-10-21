import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\\s");
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        
        if(A > B) {
            System.out.println(">");
        } else if(A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}