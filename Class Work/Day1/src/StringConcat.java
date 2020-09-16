/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class StringConcat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "" ;
		System.out.println(args.length);
		
		for(int i=0;i<args.length;i++)
		{
			s += args[i];
		}
		
		System.out.println(s);
	}

}
