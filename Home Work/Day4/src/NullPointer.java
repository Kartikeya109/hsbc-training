/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class NullPointer {
	
	public static void main(String args[]) throws  MyNullPointerException
	{
		int arr[]= {1,2,3};
		
		try {
			
			System.out.println(arr[3]);
			
		}
		catch(Exception e) {
			throw new MyNullPointerException();
		}
	}

}
