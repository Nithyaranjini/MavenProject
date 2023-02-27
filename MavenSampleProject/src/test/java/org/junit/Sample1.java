package org.junit;

import java.util.Date ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sample1 {
	
	
	static WebDriver driver;
	 @BeforeClass
	public static void  BeforeClass() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	 }
	 @AfterClass
		public static void afterClass() {
		
		driver.quit();}
	  @Before
		public void BeforeMethod() {
		java.util.Date d = new Date();
		System.out.println("start time:"+d);}
	  
	  @After
	  public void afterMethod() {
			java.util.Date d = new Date();
			System.out.println("end time:"+d);}
	  @Test
	  public void Test1() {
		  driver.findElement(By.id("email")).sendKeys("greens");
		  driver.findElement(By.name("pass")).sendKeys("password123%");
		  driver.findElement(By.name("login")).click();}
		  
	  
	  
	  
	 
		

}
