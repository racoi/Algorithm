class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for(int i=1; i<arr.length; i++){
            int gcd = getGcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }
    
    static int getGcd(int a, int b){
        if(b == 0) return a;
        return getGcd(b, a % b);
    }
}