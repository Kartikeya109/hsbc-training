/**
 * 
 */
package com.demo.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Kartikeya
 *
 */
@Component
public class ComputerService {

	@Autowired
	private CPU cpu;
	@Autowired
	private Display display;
	@Autowired
	private Ram ram;
	@Autowired
	private Storage storage;
	
	
	
	
	public String getSpecs() {
		return cpu.getSpecs()+ " "+ ram.getSpecs()+" "+storage.getSpecs()+" "+display.getSpecs();
	}
	
	
	
	
	
	public CPU getCpu() {
		return cpu;
	}





	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}





	public Display getDisplay() {
		return display;
	}





	public void setDisplay(Display display) {
		this.display = display;
	}





	public Ram getRam() {
		return ram;
	}





	public void setRam(Ram ram) {
		this.ram = ram;
	}





	public Storage getStorage() {
		return storage;
	}





	public void setStorage(Storage storage) {
		this.storage = storage;
	}





	public String getComputer(CPU cpu, Display display, Ram ram, Storage storage) {
		String ans = "";
		ans += ram.getRamType() + ram.getRamSize() + " ";
		ans +=  cpu.getCpuType() + cpu.getCpuFrequency() + " ";
		ans += storage.getStorageType() + storage.getStorageSize();
		return ans;
	}
	
}
