package loopsinjava;

import java.util.Scanner;

public class ScannerInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		
		int a=1;
		for(int i=1;i<=n;i++)
		{
				a=a*i;
		}
		
		System.out.println("Factorial of Number : "+a);
		
		
	}

}
