
public class Factorial {
	public static void main(String[] args) {
		long n=20;
		long factorial=1;
		
		long i=1;
		while(i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("The factorial of number "+n +"is :"+factorial);
		
		
	}

}
