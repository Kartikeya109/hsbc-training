/**
 * 
 */
package day2;

/**
 * @author Kartikeya
 *
 */
public class OverloadAdder {

	/**
	 * @param args
	 */
	
	public void add()
	{
		System.out.println("Nothing to add..");
	}
	
	public int add(int a, int b)
	{
		System.out.println("int a + int b = "+(a+b));
		return a+b;
	}
	
	public float add(int a, int b)
	{
		System.out.println("int a + int b");
		return a+b;
	}
	
	public double add(double a, double b)
	{
		System.out.println("double a + double b: " + (a+b));
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadAdder o = new OverloadAdder();
		
		o.add();
		o.add(2,3);
		o.add(2.000003,3.00001);
		
	}

}
