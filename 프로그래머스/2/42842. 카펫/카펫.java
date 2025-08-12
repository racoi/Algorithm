class Solution {
    public int[] solution(int brown, int yellow) {
        int[] ans = new int[2];
        
        int total = brown + yellow;
        for(int i=3; i<=total; i++){
            int a = i; 
            int b = total / i;
            
            if((a-2)*(b-2) == yellow){
                ans[0] = Math.max(a, b);
                ans[1] = Math.min(a, b);
                break;
            }
        }
        return ans;
    }
}