class Solution {
    boolean[] visited; // 컴퓨터에 방문했는지 확인
    int[][] computers;
    
    public int solution(int n, int[][] computers) {
       this.computers = computers;
        int answer = 0;
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer += 1;
                dfs(i);
            }
        }
        return answer;
    }
    
    void dfs(int node) {
        // 연결된 컴퓨터 탐색
        visited[node] = true; // 현재 컴퓨터 방문 표시
        for (int i = 0; i < computers[0].length; i++) {
            if (!visited[i] && computers[node][i] == 1) {
                dfs(i);
            }
        }
    }
}