/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class PassByValue {

	/**
	 * @param args
	 */
	
	int x = 20;
	
	
	public void display()
	{
		x = 10;
		System.out.println("The Value ="+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassByValue p = new PassByValue();
		System.out.println(p.x);
		p.display();
	}

}
