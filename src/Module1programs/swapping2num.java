package Module1programs;

public class swapping2num {

	public static void main(String[] args) {
		//with extra variable
		/*int a=10,b=20,c;
		System.out.println("before swapping :"+a +" "+ b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping :"+a + " "+ b);*/
		
       //with out using extra variable
		int a=124,b=20;
		System.out.println("before swapping :"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping :"+a + " "+ b);
	}

}
