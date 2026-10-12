package lab5;

import java.util.Scanner;
public class Lab5 {
	
	public static int countVowels(String str) {
		
		String convert = str.toLowerCase();
		int count = 0;
		
		for(int i = 0; i < convert.length(); i++)
		{
			char c = convert.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;
			
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello Nigga!");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter some string bro: ");
		String txt = sc.nextLine();
		
		System.out.println("Number of Vowels: "+countVowels(txt));
		
		sc.close();
	}
	
	
}
