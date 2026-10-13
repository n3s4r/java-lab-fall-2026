// Write a program that takes an integer and prints its divisors, i.e. divisors of 12 are 1, 2, 3, 4, 6.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0)
            {
                System.out.println(i );
            }
        }
    }
}
