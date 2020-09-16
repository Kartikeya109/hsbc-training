/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class HelloOverload {

	/**
	 * @param args
	 */
	public static void hello(int i)
	{
		System.out.println("Integer Hello is called");
	}
	public static void hello(byte i)
	{
		System.out.println("Byte Hello is called");
	}
	public static void hello(short i)
	{
		System.out.println("Short Hello is called");
	}
	public static void hello(long i)
	{
		System.out.println("Long Hello is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(5);
	}

}
