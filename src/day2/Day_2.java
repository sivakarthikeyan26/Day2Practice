package day2;

import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet for check vowel or consonant  ");
		char ch=sc.next().charAt(0);
		switch(ch){
		    //check lower case vowel letters
		    case 'a':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'e':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'i':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'o':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'u':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    //check upper case vowel letters
		    case 'A':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'E':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'I':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'O':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    case 'U':
		    System.out.println(ch+" is a vowel");
		    break;
		    
		    default:
		    System.out.println(ch+" is a consonant");
		    break;
		
		}
		sc.close();
	}
}

