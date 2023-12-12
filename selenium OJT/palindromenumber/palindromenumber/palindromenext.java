package palindromenumber;

public class palindromenext {

	 
	static int ispalindrome(int num)
		{
		int n,k,rev =0;
		n = num;
		while (num !=0) {
			k =  num %10;
			rev = (rev * 10 )+ k;
			num = num / 10;
		}
		if (n==rev) {
			return 1;
		}
		else {
			return 0;
			
		}
	}
public static void main(String[] args)
{
int num = 2345;
while (ispalindrome(num)==0) {
	num = num +1;
}
	System.out.println("Next palindrome:");

	System.out.println(num);
}
}

