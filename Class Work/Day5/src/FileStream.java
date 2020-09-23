import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Kartikeya
 *
 */
public class FileStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fis = null;
		FileWriter fos = null;
		BufferedReader bis = null;
		BufferedWriter bos = null;
		
		//File file = new File("d:\\temp\\io\\Arrays.txt");
		
		try {
			FileWriter writer = new FileWriter("d:\\temp\\io\\Arrays.txt");
		//bis = new BufferedReader(fis);
		bos = new BufferedWriter(writer);
		
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		
			try {
				String lines[] = new String[20];
				for(int i =0;i<20;i++)
				{
					if(i%2==0) {
					lines[i] = "line no "+(i+1)+"\n";
					bos.write(lines[i]);
					}
				}
				
//				int i =0;
//				while(lines.length < 20) {
//					if(lines[i]!=null) {
//						bos.write(lines[i]);
//					}
//					i++;
//				}
		
				
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
