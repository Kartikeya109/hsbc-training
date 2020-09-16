/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class StudentConstructor{

	/**
	 * @param args
	 */
	int id;
	String name;
	int age;
	String color;
	
//	public StudentConstructor(int id, String name, int age)
//	{
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		System.out.println("Id : " + this.id + " Name" + this.name + " Age " + this.age);
//	}
	
	public StudentConstructor(int id, String name, int age, String color)
	{
		this(id,name,age);
		this.color = color;
		System.out.println("Id : " + this.id + " Name" + this.name + " Age " + this.age + " Color " + this.color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor obj = new StudentConstructor(222, "Kartikeya", 18, "Red");
		
	}

}
