/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class Duck extends Bird {
	
	@Override
	public String fly() {
		
		return "Duck cannot "+super.fly();
	}
}
