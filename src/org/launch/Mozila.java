package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozila {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MANASWITA MANDAL\\sourav\\LauchMozila\\Driver\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		
		w.get("https://en.wikipedia.org/wiki/Chelsea_F.C.");
		
		w.quit();
	}

}
