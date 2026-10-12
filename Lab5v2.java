package lab5;

import java.util.Scanner;

public class Lab5v2 {
	
	public static boolean isPalindrome(String arg) {
		
		String convert = arg.toLowerCase();
		String reversed = "";
		
		for(int i = convert.length() - 1; i >= 0; i--) {
			
			reversed = reversed + convert.charAt(i);
		}
		
		System.out.print("The reversed string is ");
		System.out.println(reversed);
		
		if(convert.equals(reversed))
		{
			return true;
		}
		else
		{
			return false;
		}
			
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello bro!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string bro: ");
		
		String txt = sc.nextLine();
		
		System.out.println("The string you entered is "+txt);
		
		isPalindrome(txt);
		
		System.out.println("Palindrome Status: "+isPalindrome(txt));
		sc.close();
	}

}
