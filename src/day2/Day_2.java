package day2;

import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
	    int th,h,t,u;  
	 
	    u=n%10; 
	    t=(n/10)%10; 
	    h=(n/100)%10; 
	    th=n/1000; 
	    System.out.println("ones= "+u+" tens = "+t+" hundreds = "+h+" thousands= "+th);
	}
}
