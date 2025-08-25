class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right - (int)left + 1];
        
        int idx = 0;
        long row, col;
        for(long i=left; i<=right; i++){
            row = i / n;
            col = i % n;
            answer[idx++] = Math.max((int)row, (int)col) + 1;
        }
        return answer;
    }
}