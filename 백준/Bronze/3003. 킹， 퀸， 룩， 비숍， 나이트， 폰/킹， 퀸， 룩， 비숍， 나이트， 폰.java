import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        king -= Integer.parseInt(st.nextToken());
        queen -= Integer.parseInt(st.nextToken());
        rook -= Integer.parseInt(st.nextToken());
        bishop -= Integer.parseInt(st.nextToken());
        knight -= Integer.parseInt(st.nextToken());
        pawn -= Integer.parseInt(st.nextToken());

        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);

    }
}
