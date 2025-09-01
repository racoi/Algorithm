import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        while(pq.peek() < K && pq.size() >= 2){
            int a = pq.poll();
            int b = pq.poll();
            
            pq.offer(a + (b * 2));
            answer++;
        }
        
        if(pq.peek() >= K) return answer;
        else return -1;
    }
}