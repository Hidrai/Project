import java.util.Scanner;

public class Program
{
	Scanner sc = new Scanner (System.in);

    	public static void main (String[] args)
    	{
        	System.out.println ("Hello");
		Program program = new Program();
		program.start();
    	}
	
	public void start ()
	{
		int a = input ("First number: ");
		int b = input ("Second number: ");
		System.out.println("Sum: "+ (a+b));
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