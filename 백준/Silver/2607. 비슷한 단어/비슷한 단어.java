import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        int res = 0;
        for(int i=0; i<N-1; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>(map);
            String str = sc.next();

            int cnt = 0;
            for(int j=0; j<str.length(); j++) {
                if(map2.containsKey(str.charAt(j)) == true) {
                    int value = map2.get(str.charAt(j));
                    if(value > 0) {
                        cnt += 1;
                        map2.put(str.charAt(j), value - 1);
                    }
                }
            }

            if(S.length() == str.length() && (S.length() == cnt || S.length()-1 == cnt)) res++;
            else if(S.length()+1 == str.length() && str.length()-1 == cnt) res++;
            else if(S.length() == str.length()+1 && str.length() == cnt) res++;
        }
        System.out.println(res);
    }
}