package whileLoop;
//Program to reverse of a number
import java.util.Scanner;

public class rev {
	private static Scanner num;
	public static void main(String args[]){
		System.out.println("Enter the number");
		num=new Scanner(System.in);
		
		int n=num.nextInt();
		int result=reverse(n);
		System.out.println();
		System.out.println("output");
		System.out.println("------");
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
