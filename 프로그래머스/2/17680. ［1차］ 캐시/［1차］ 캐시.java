import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        HashMap<String, Integer> cache = new HashMap<>();
        
        for(int i=0; i<cities.length; i++){
            String city = cities[i].toLowerCase();
            
            if(cache.containsKey(city)){
                cache.put(city, i);
                answer++;
            }else{
                if (cache.size() >= cacheSize) {
                    String lruCity = "";
                    int oldest = Integer.MAX_VALUE;
                    for (String key : cache.keySet()) {
                        if (cache.get(key) < oldest) {
                            oldest = cache.get(key);
                            lruCity = key;
                        }
                    }
                    cache.remove(lruCity);
                }
                cache.put(city, i);
                answer += 5;
            }
        }
        return answer;
    }
}