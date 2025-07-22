import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                int target = board[j][moves[i]-1];
                if(target != 0){
                    board[j][moves[i]-1] = 0;
                    
                    if(stack.size()>0 && stack.peek() == target){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(target);
                    }
                    
                    break;
                }
                
            }
        }
        
        return answer;
    }
}