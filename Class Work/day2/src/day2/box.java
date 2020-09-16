/**
 * 
 */
package day2;

/**
 * @author Kartikeya
 *
 */
public class box {

	private int length;
	private int breadth;
	private int height;
	private String color;
	private double weight;
	
	public box(int length,int breadth, int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public box(int length, int breadth, int height, String color)
	{
		this(length,breadth,height);
		this.color = color;
		System.out.println(this.color);
	}
	
	public box(int length, int breadth, int height, String color, Double weight)
	{
		this(length,breadth,height,color);
		this.weight = weight;
	}
	
	public  void volume(int length,int breadth, int height)
	{
		System.out.println("Volume is :"+(length*breadth*height));
	}
	
	public  void getColor(int length,int breadth, int height, String color)
	{
		System.out.println("Color is :" +color);
	}
	
	public  void getColor(int length,int breadth, int height)
	{
		System.out.println("Color is not present");
	}
	
	public void volume(int length,int breadth, float height)
	{
		System.out.println("Volume is :"+(length*breadth*height));
	}
	
	public void volume(float length,float breadth, float height)
	{
		System.out.println("Volume is :"+(length*breadth*height));
	}
	
	public void volume(double length,double breadth, double height)
	{
		System.out.println("Volume is :"+(length*breadth*height));
	}
	
}
