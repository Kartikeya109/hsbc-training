/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class MethodOverloading {

	/**
	 * @param args
	 */
	
	public static void volume(int length, int breadth, int height)
	{
		System.out.println("Volume is :" + (length * breadth * height));
	}
	
	public static void volume(int length, int breadth, float height)
	{
		System.out.println("Volume is :" + (length * breadth * height));
	}
	
	public static void volume(int length, float breadth, float height)
	{
		System.out.println("Volume is :" + (length * breadth * height));
	}
	
	public static void volume(float length, float breadth, float height)
	{
		System.out.println("Volume is :" + (length * breadth * height));
	}
	
	public static void volume(double length, double breadth, double height)
	{
		System.out.println("Volume is :" + (length * breadth * height));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		volume(2,3,4);
		volume(2,3,4.5f);
		volume(2,3.5f,4.5f);
		volume(2.1f,3.2f,4.3f);
		volume(2.001,3.002,4.003);
	}

}
