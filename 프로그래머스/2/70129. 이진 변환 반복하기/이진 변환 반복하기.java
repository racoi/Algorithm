class Solution {
    public int[] solution(String s) {
        int oneCnt;
        int zeroCnt = 0;
        int transCnt = 0;
        while(!s.equals("1")){
            oneCnt = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1') oneCnt++;
            }
            zeroCnt += s.length() - oneCnt;
            s = Integer.toBinaryString(oneCnt);
            transCnt++;
        }
        
        return new int[]{transCnt, zeroCnt};
    }
}