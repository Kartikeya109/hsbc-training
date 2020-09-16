/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class BiggestNumber {

	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("Greatest Number is : " + (a>b?a>c?a:b>c?b:c:c));
	}
}
