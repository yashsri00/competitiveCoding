package challenge;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Day24Question3 {

    public static void main(String[] args) {
            //decreasing order
            PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) -> {
                return o2-o1;
            });
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 1-insert 2-remove 3-exit");
                Integer num = sc.nextInt();

                if(num==1)
                {
                    int val=sc.nextInt();
                    queue.add(val);
                }
                else if(num==2)
                {
                    queue.poll();
                }
                else
                {
                    break;
                }

            }
            System.out.println(queue);
        }
}
