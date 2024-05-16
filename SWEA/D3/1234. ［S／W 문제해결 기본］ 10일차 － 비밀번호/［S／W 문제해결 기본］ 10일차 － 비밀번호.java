import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            List<Character> list = new LinkedList<>();
            int N = sc.nextInt();
            String s = sc.next();
            for(int i=0; i<N; i++){
                list.add(s.charAt(i));
            }

            boolean flag = false;
            while(!flag){
                flag = true;
                for(int i=0; i<list.size()-1; i++){
                    if(list.get(i) == list.get(i+1)){
                        list.remove(i);
                        list.remove(i);
                        flag = false;
                    }
                }
            }

            System.out.print("#" + test_case + " ");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}