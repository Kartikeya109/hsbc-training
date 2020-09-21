/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class NestedTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("1st try block");
			try {
				System.out.println("2nd try block");
				int d = 10/0;
			} catch (ArithmeticException e) {
				System.out.println("arithmatic exception found in 2nd try block");
				throw e;
			}
		}
		catch(Exception e) {
			System.out.println("Exception found in 1st try block");
		}
	}

}
