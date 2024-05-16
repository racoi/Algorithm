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
            int N = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<N; i++){
                list.add(sc.nextInt());
            }

            int M = sc.nextInt();
            for(int i=0; i<M; i++){
                char c = sc.next().charAt(0);
                if(c == 'I'){ //삽입
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    for(int j=x; j<x+y; j++){
                        list.add(j, sc.nextInt());
                    }
                }
                else if(c == 'D'){ //삭제
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    for(int j=x; j<x+y; j++){
                        list.remove(x);
                    }
                }
                else{ //c == 'A' 추가
                    int y = sc.nextInt();
                    for(int j=0; j<y; j++){
                        list.add(sc.nextInt());
                    }
                }
            }

            System.out.print("#" + test_case);
            for(int i=0; i<10; i++){
                System.out.print(" " + list.get(i));
            }
            System.out.println();
        }
    }
}