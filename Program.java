import java.util.Scanner;

public class Program
{
	Scanner sc = new Scanner (System.in);

    	public static void main (String[] args)
    	{
        	System.out.println ("Hello");
    	}

	public int input (String text)
	{
		System.out.print(text);
		return sc.nextInt();
	}
    	public int sum (int a, int b)
    	{
		return a+b;
    	}
}