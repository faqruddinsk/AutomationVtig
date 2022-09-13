package Module1programs;

public class armstrngnum {

	public static void main(String[] args) {
		int num=153,arm=0,rem, pa=num;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}if(pa==arm)
			System.out.println("given num is armstrong :"+ pa);
		else
			System.out.println("not armstrong"+ pa);
		}

	}


