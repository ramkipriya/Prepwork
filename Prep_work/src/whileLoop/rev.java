package whileLoop;

import java.util.Scanner;

public class rev {
	public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner num=new Scanner(System.in);
		
		int n=num.nextInt();
		int result=reverse(n);
		System.out.println("The reverse of the number");
		System.out.println( result);
	}
	public static int reverse(int n)
	{
		int result = 0;
    int rem;
    while (n > 0)
    
    {
        rem = n % 10;
        n = n / 10;
        result = result * 10 + rem;
    }
    return result;
		
	}
}
