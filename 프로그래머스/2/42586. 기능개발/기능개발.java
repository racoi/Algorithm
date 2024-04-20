import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days_q = new LinkedList<Integer>();
        Queue<Integer> result_q = new LinkedList<Integer>();
        
        int[] days = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
            int progress = progresses[i];
            int speed = speeds[i];
            
            days[i] = (int)Math.ceil((double)(100 - progress) / speed);
        }
        
        days_q.offer(days[0]);
        
        for(int i=1; i<days.length; i++){
            int temp = days_q.peek();
            if(days[i] <= temp){
                days_q.offer(days[i]);
            } else{
                result_q.offer(days_q.size());
                days_q.clear();
                days_q.offer(days[i]);
            }
        }
        
        if(!days_q.isEmpty()){
            result_q.offer(days_q.size());
        }
        
        int[] answer = new int[result_q.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = result_q.poll();
        }
        
        return answer;
    }
}