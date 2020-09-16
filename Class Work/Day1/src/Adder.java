
public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 0;
		
		if(args.length<2)
		{
			System.out.println("Please enter atleast 2 arguments");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				s+=Integer.parseInt(args[i]);
			}
			System.out.println("Sum is "+s);
		}
	}

}
