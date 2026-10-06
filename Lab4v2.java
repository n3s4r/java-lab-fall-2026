package nesar;

import java.util.Scanner;

public class Lab4v2 {

    public static void main(String[] args) {

        System.out.println("Hello Nigga!");
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int[] fibo = new int[a];

        if (a > 0) {
            fibo[0] = 0;
        }

        if (a > 1) {
            fibo[1] = 1;
        }

        for (int i = 2; i < a; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.print("First " + a + " Fibonacci numbers: ");

        for (int i = 0; i < a; i++) {
            System.out.print(fibo[i] + " ");
        }

        sc.close();
    }
}
