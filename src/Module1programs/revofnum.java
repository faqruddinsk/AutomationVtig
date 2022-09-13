package Module1programs;

public class revofnum {

	public static void main(String[] args) {
	int num=123,rev=0,rem;
	System.out.println(" given number :"+ num);
	while (num>0) {
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
	}
	System.out.println(" reverse of number is:"+ rev);

	}

}
