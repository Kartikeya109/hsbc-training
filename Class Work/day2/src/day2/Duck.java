/**
 * 
 */
package day2;

/**
 * @author Kartikeya
 *
 */
public class Duck {

	public static int duckcount=0;
	
	public Duck()
	{
		duckcount++;
	}
	
	public static String getDuckBreed() {
		return "Marsh Duck";
	}
}
