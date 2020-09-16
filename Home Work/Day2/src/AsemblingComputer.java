/**
 * 
 */

/**
 * @author Kartikeya
 *
 */

class Monitor{
	
	public void LenovoMonitor()
	{
		System.out.println("Lenovo Monitor");
	}
	public void HpMonitor()
	{
		System.out.println("HP Monitor");
	}
	public void DellMonitor()
	{
		System.out.println("Dell Monitor");
	}
}

class Cpu
{
	public void LenovoCPU()
	{
		System.out.println("Lenovo CPU");
	}
	public void HpCPU()
	{
		System.out.println("HP CPU");
	}
	public void DellCPU()
	{
		System.out.println("Dell CPU");
	}
}

class Keyboard
{
	public void LenovoKeyboard()
	{
		System.out.println("Lenovo Monitor");
	}
	public void HpKeyboard()
	{
		System.out.println("HP Monitor");
	}
	public void DellKeyboard()
	{
		System.out.println("Dell Keyboard");
	}
}

class Mouse
{
	public void LenovoMouse()
	{
		System.out.println("Lenovo Mouse");
	}
	public void HpMouse()
	{
		System.out.println("HP Mouse");
	}
	public void DellMouse()
	{
		System.out.println("Dell Mouse");
	}
}

public class AsemblingComputer {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor mon = new Monitor();
		mon.LenovoMonitor();
		
		Keyboard key = new Keyboard();
		key.DellKeyboard();
		
		Mouse mouse = new Mouse();
		mouse.HpMouse();
		
		Cpu cpu = new Cpu();
		cpu.DellCPU();
	}

}
