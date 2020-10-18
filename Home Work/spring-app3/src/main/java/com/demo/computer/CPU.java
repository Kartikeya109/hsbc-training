/**
 * 
 */
package com.demo.computer;

/**
 * @author Kartikeya
 *
 */
public class CPU {
	
	private String cpuType;
	private String cpuFrequency;
	
	public CPU() {
		
	}
	
	public CPU(String cpuType, String cpuFrequency) {
		this.cpuType = cpuType;
		this.cpuFrequency = cpuFrequency;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public String getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuFrequency(String cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}
	
	public String getSpecs() {
		return cpuType + " "+cpuFrequency;
	}
	
}
