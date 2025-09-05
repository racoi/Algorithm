class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[10001];
        for(int i=1; i<10001; i++){
            arr[i] = i;
        }
        
        int left = 1;
        int right = 1;
        while(left <= right){
            int num = 0;
            for(int i=left; i<=right; i++){
                num += arr[i];
            }
            if(num <= n) right++;
            else left++;
            
            if(num == n) answer++;
        }
        return answer;
    }
}