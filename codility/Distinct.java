import java.util.HashSet;

public class Distinct {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : A){
            set.add(i);
        }
        return set.size();
    }
}
