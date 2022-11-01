package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eleman sayısı kaç ");
        int N = input.nextInt();
        int n1=0,n2=1,n3;
        System.out.println(N+ "elemanlı Fibonacci serisi:");


        for (int i =1; i<=N; i++) {
            n3=n1+n2;

            n1=n2;
            n2=n3;
            System.out.print(n3+" ");

        }

    }
}
