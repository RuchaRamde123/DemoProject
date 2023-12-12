package OJT;


import java.util.Scanner;

public class oddeven {

	

	public static void main(String[] args) {
		System.out.println("enter n");
				Scanner sc=new Scanner(System.in);
				
				int n=sc.nextInt();
				int i=2;
			
		for(i=2;i<=n;i=i+2);
		{
				
				System.out.println(i);
	}
		
/*
		for (int j=2;j<=n;j=j+2);
		{
			System.out.println("j");
		}*/
		
}
}