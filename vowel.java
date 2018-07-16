
package Deva;

import java.util.Scanner;

public class Test2 {
	 public static void main(String[] args)
	 {
		String a;
		System.out.println("Enter the Character");
		Scanner s = new Scanner(System.in);
		a=s.next();
		if(a.equals("a") ||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u"))
		{
		   System.out.println("Vowels");	
		}
		else
		{
			System.out.println("Character");
		}
		
		
	 }

    }

