 package Pratice;

public class Demo {
  public static void main(String[] args) {

	int n =17,a=1,b=2,c=5;
	int count =0;
	while(n!=0) {
		if(n>=c)
		{
			n=n-c;
			count++;
			System.out.println("$"+c);
		}
		else if(n>=b)
		{
			n=n-b;
			System.out.println("$"+b);
			count++;
		}
		else if(n>=a)
		{
			
			n=n-a;
			System.out.println("$"+a);
			count++;
		}
	}
	System.out.println(count+ " Total Coin Collect");

}
}