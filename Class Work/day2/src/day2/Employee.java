/**
 * 
 */
package day2;

/**
 * @author Kartikeya
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	
	int id;
	String name;
	
//	public Employee(int id, String name)
//	{
//		this.id = id;
//		this.name = name;
//	}
	
	public static Employee add(int id, String name)
	{
		Employee e = new Employee();
		e.id = id;
		e.name = name;
		return e;
	}
	
	public static int search(int x, Employee emp[])
	{
		
		for(int i=0 ;i<2;i++)
		{
			if(x==emp[i].id )
			{
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emp = new Employee[20];
		
	
		emp[0] = add(1,"Kartikeya");
		emp[1] = add(2,"Shukla");
		
		System.out.println("Enter the id to search");
		int x = Integer.parseInt(args[0]);
		
		int y = search(x,emp);
		if (y==1)
		{
			System.out.println("Match found");
		}
		else if (y==0)
		{
			System.out.println("Match not found");
		}
		
	}
	
}
