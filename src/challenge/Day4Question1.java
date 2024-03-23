package challenge;

import java.util.Scanner;

public class Day4Question1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=fibonacci(n);
        System.out.println(sum);
    }

    private static int fibonacci(int n) {
        if(n<=1)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
