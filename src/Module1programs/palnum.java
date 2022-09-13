package Module1programs;

public class palnum {

	public static void main(String[] args) {
		int num=181,rev=0,rem,pal=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(pal==rev) {
			System.out.println("given number is plindrome :"+ rev);
		}else
		{
			System.out.println("give num is not palindrome :"+ rev);
		}

	}

}
