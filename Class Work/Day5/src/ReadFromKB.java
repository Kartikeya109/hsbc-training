import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class ReadFromKB {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line ="";
		System.out.println("Type exit to end!!");
		while(!(line=br.readLine()).equalsIgnoreCase("exit"))
		{
			System.out.println(line);
		}
	}
}
