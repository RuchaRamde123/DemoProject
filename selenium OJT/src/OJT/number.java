package OJT;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		
		System.out.println("enter n:");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
System.out.println("odd");
for(int i= n -1;i>=0;i--)
{
	if (i % 2 == 0) {
				System.out.println (i);
	}
	
	}
System.out.println("even");
		
for(int j=2;j<=n;j=j+2)
{
	System.out.println(j);
	}
}}
