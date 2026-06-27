import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length]; // 방문한 곳 체크하는 배열 생성
        Queue<int[]> queue = new LinkedList<>(); // 순회할곳 저장하는 큐 생성
        queue.offer(new int[]{0, 0, 1}); // 첫 시작점 큐에 추가
        visited[0][0] = true; // 첫 시작점은 이미 방문 상태임을 표시, 행, 열, 거리 저장 -> 현재 0행 0열에 있고, 여기까지 1칸왔어 라는 걸 의미한다.

        int[] dx = {-1, 1, 0, 0}; // 행
        int[] dy = {0, 0, -1, 1}; // 열

        while (!queue.isEmpty()) {
            // Queue 전체 출력 추가
            System.out.println("현재 Queue 상태: ");
            for (int[] item : queue) {
                System.out.println("  [" + item[0] + ", " + item[1] + ", " + item[2] + "]");
            }

            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            System.out.println("꺼냄 → x=" + x + " y=" + y + " dist=" + dist);

            if (x == maps.length - 1 && y == maps[0].length - 1) {
                System.out.println("도착! 거리=" + dist);
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] > 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                    System.out.println("  넣음 → nx=" + nx + " ny=" + ny + " dist=" + (dist + 1));
                }
            }
        }

        return -1; // 도착하지 못했을 때는 -1이 결과
    }

    // 직접 실행용 main 메서드
    public static void main(String[] args) {
        Test solution = new Test();

        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        int result = solution.solution(maps);
        System.out.println("최종 결과: " + result);
    }
}
