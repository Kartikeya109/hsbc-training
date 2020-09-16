/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class StaticVariable {

	/**
	 * @param args
	 */
	
	static int days=0;
	
	public static void CountDays()
	{
		days++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDays();
		CountDays();
		CountDays();
		CountDays();
		CountDays();
		
		System.out.println("Number of days counted : "+ days);
	}

}
