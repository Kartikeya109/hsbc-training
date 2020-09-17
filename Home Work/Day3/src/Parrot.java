/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class Parrot extends Bird{
	
	@Override
	public String fly() {
		
		return "Parrots can "+super.fly();
	}
}
