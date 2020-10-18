/**
 * 
 */
package com.demo.computer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kartikeya
 *
 */
@Configuration
@ComponentScan(basePackages = "com.demo.computer")
public class AppConfig {
	
	@Bean 
	public Ram ram() {
		Ram ram = new Ram();
		ram.setRamSize(16);
		ram.setRamType("DDR4");
		return ram;
	}
	
	@Bean
	public CPU cpu() {
		CPU cpu  = new CPU();
		cpu.setCpuFrequency("3.00 GHZ");
		cpu.setCpuType("Intel Core i5");
		return cpu;
	}
	
	@Bean	
	public Storage storage() {
		Storage storage = new Storage();
		storage.setStorageSize(512);
		storage.setStorageType("SSD");
		return storage;
	}
	
	@Bean
	public Display display() {
		Display display = new Display();
		display.setDisplayType("Nvidia GEForce");
		display.setResolution("1900x1600");
		display.setDisplayMemory("4GB");
		return display;
	}
	
}
