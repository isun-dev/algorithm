import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        double sum = 0;
        int course = sc.nextInt();

        for (int i = 0; i < course; i++) {
            numbers.add(sc.nextDouble());
        }

        Double max = Collections.max(numbers);


        for (int i = 0; i < course; i++) {
            sum += ((numbers.get(i) / max) * 100);
        }

        System.out.println(sum / numbers.size());
    }
}