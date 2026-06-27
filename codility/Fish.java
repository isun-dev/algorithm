import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        int remainingFishCount = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                if (stack.isEmpty()) {
                    remainingFishCount++;
                } else {
                    while (!stack.isEmpty()) {
                        if (stack.peek() < A[i]) {
                            stack.pop();
                            if (stack.isEmpty()) {
                                remainingFishCount++;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return remainingFishCount + stack.size();
    }
}
