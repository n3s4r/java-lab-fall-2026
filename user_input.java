import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nesar!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integar: ");
        int num = sc.nextInt();

        System.out.println("The integar you entered is "+num);

        sc.close();

        
    }
}
