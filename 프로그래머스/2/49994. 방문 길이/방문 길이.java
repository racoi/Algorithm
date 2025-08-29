import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();

        for(int i=0; i<dirs.length(); i++){
            char dir = dirs.charAt(i);
            int nx = x, ny = y;
            
            if(dir == 'U' && y < 5) ny++;
            else if(dir == 'D' && y > -5) ny--;
            else if(dir == 'R' && x < 5) nx++;
            else if(dir == 'L' && x > -5) nx--;
            
            if (nx == x && ny == y) continue;

            set.add(x + "," + y + "-" + nx + "," + ny);
            set.add(nx + "," + ny + "-" + x + "," + y);
            
            x = nx;
            y = ny;
        }
        
        return set.size() / 2;
    }
}