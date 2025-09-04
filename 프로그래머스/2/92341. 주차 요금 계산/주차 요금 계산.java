import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> in = new HashMap<>();
        Map<String, Integer> total = new HashMap<>();
        
        for (String record : records) {
            String[] split = record.split(" ");
            String[] timeStr = split[0].split(":");
            int time = Integer.parseInt(timeStr[0]) * 60 + Integer.parseInt(timeStr[1]);
            String car = split[1];
            String status = split[2];

            if (status.equals("IN")) {
                in.put(car, time);
            } else { // OUT
                int inTime = in.remove(car);
                total.put(car, total.getOrDefault(car, 0) + (time - inTime));
            }
        }

        
        for (String car : in.keySet()) {
            int inTime = in.get(car);
            total.put(car, total.getOrDefault(car, 0) + ((23 * 60 + 59) - inTime));
        }

        List<String> cars = new ArrayList<>(total.keySet());
        Collections.sort(cars);

        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        int[] answer = new int[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            int time = total.get(cars.get(i));
            if(time <= baseTime) answer[i] = baseFee;
            else answer[i] = baseFee + (int) Math.ceil((time - baseTime) / (double) unitTime) * unitFee;
        }

        return answer;
    }
}