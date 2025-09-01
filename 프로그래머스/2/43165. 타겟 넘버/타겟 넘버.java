class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    static void dfs(int num, int depth, int[] numbers, int target){
        if(depth == numbers.length){
            if(num == target) answer++;
            return;
        }
        dfs(num + numbers[depth], depth + 1, numbers, target);
        dfs(num - numbers[depth], depth + 1, numbers, target);
    }
}