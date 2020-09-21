/**
 * 
 */

/**
 * @author Kartikeya
 * The aim is to check if a constructor can throw exceptions
 *
 */
public class ConstructorException {
	
	private String s;
	
	public  ConstructorException(String s) throws ArithmeticException{
		this.s = s;
		System.out.println("Creating and intializing an object");
	
		System.out.println(s);
		System.out.println(10/0);
		
	}
	
	public static void main(String args[]) {
		try {
			ConstructorException obj = new ConstructorException("Hello");
		}
		catch (ArithmeticException e) {
			System.out.println("Caught an interrupted exception");
		}
		System.out.println("Object created successfully");
	}
}
// Hence constructor can also invoke exception