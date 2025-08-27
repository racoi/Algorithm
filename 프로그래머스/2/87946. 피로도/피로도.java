class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    static void dfs(int cnt, int k, int[][] dungeons){
        answer = Math.max(answer, cnt);
        
        for(int i=0; i<dungeons.length; i++){
            int need = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if(!visited[i] && k >= need){
                visited[i] = true;
                dfs(cnt + 1, k - cost, dungeons);
                visited[i] = false;
            }
        }
    }
}