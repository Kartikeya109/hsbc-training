/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class Factorial {
	
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		
		int fact = 1;
		while(a!=1)
		{
			fact*=a;
		}
		System.out.println("Factorial of the Number is :" + fact);
	}
}
