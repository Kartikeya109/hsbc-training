/**
 * 
 */
package day2;

/**
 * @author Kartikeya
 *
 */
public class box_main {

	public static void main(String args[])
	{
		box b = new box(3,4,5);
		b.volume(3,4,4.5f);
		b.volume(3.22,4.43,4.1133);
		b.getColor(2, 3, 4);
		
		box b2 = new box(4,5,6,"green",9.11);
		
	}
}
