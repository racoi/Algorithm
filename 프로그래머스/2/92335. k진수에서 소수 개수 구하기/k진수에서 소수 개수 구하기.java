class Solution {
    public int solution(int n, int k) {
        int ans = 0;
        String trans = Integer.toString(n, k);
        String[] arr = trans.split("0");
        
        for(String i : arr){
            if(i.equals("")) continue;
            long num = Long.parseLong(i);
            if(isPrime(num)) ans++;
        }
        return ans;
    }
    
    static boolean isPrime(Long num){
        if(num < 2) return false;
        if(num == 2) return true;
        
        for(long i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
}