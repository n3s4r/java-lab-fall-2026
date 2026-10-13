// Write a program that takes an integer and determines if it’s prime or not. A number is prime if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        if(num < 2){
          System.out.println("Enter an integer greater than 1");
        }
        else
        {
            boolean isPrime = true;

        for(int i = 2; i*i <= num; i++)
            if(num % i == 0){
                isPrime = false;
            break;
            }
                
            
    
        if(isPrime)
        {
            System.out.println("Prime");
        }
            else{
            
            
            System.out.println("Not Prime");
        }
        }
        
        }
}
