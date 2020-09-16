/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class GetCity {

	/**
	 * @param args
	 */
	public static String getCityByCode(int x)
	{
		if(x==1)
			return "DELHI";
		if(x==2)
			return "NOIDA";
		if(x==3)
			return "GUARGAON";
		if(x==4)
			return "BANGLORE";
		else
			return "INVALIDCODE";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(args[0]);
		System.out.println(getCityByCode(x));
		
	}

}
