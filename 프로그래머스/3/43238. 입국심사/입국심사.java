import java.util.Arrays;

class Solution {
    static long answer;
    static int [] time;
    static int size;
    
    public long solution(int n, int[] times) {
        size = times.length;
        time = Arrays.copyOf(times, size);
        
        long start = 0;
        long end = times[times.length-1] * (long)n; 
        
        while(start < end){
            long mid = (start + end) / 2;
            long count = calculate(mid);
            if(n <= count){
                end = mid;
            }
            else start = mid + 1;
        }
        return start;
    }
    public static long calculate(long check){
        long sum = 0;
        for(int i = 0; i < size; i++){
            sum += check / time[i];
        }
        return sum;
    }
}