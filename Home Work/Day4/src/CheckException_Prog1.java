/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class CheckException_Prog1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7, b =0;
		try {
			System.out.println(a/b);
		}
		
		// Answer 1 : Try must consist of a catch block, if no catch block is found then error is generated
		// Answer 2: If there is no try block, and only catch block is there, then an error is shown
		// Answer 3: No, the finally block is also important, to use final, you must implement atleast try block for compiling program.
		// Answer 4: Yes, Try and finally can be operated with catch block.
		// Answer 5: Yes, if an exception occurs, then only the triggering try-catch block must handle it
		// Answer 6: To catch an exception, I will try to run through manual test cases and note the types of error, and also discuss it with other developers.
		
//		catch {
//			System.out.println("Program Ended");
//		}
		finally {
			System.out.println("Program in final");
		}

	}

}
