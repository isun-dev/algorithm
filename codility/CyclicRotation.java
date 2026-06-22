public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;

        return (int) Math.ceil((double) distance / D);
    }
}
