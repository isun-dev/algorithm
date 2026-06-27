import java.util.Queue;
import java.util.LinkedList;


class Solution {
    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>(); 
        queue.offer(new int[]{0, 0, 1});

        visited[0][0] = true;
        int[] dx = {-1, 1, 0, 0}; // 행
        int[] dy = {0, 0, -1, 1}; // 열

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            // 도착점 확인
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && maps[nx][ny] > 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }

        return -1;
    }
}