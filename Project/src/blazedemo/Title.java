package blazedemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\gayu\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")).sendKeys("Portland");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]")).sendKeys("Berlin");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
	    driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("inputName")).sendKeys("Gayu");
	    driver.findElement(By.id("address")).sendKeys("123 main street");
	    driver.findElement(By.id("city")).sendKeys("Salem");
	    driver.findElement(By.id("state")).sendKeys("ABC");
	    driver.findElement(By.id("zipCode")).sendKeys("123456");
	    driver.findElement(By.id("cardType")).sendKeys("Visa");
	    driver.findElement(By.id("creditCardNumber")).sendKeys("1234563652413698");
	    driver.findElement(By.id("creditCardMonth")).sendKeys("10");
	    driver.findElement(By.id("creditCardYear")).sendKeys("2023");
	    driver.findElement(By.id("nameOnCard")).sendKeys("Gayu");
	    driver.findElement(By.id("rememberMe")).click();
	    driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
	    boolean display=driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]")).isDisplayed();
	    if(display==true)
	    {  Thread.sleep(4000);
	    
	    System.out.println("The ticket is booked successfully");
	    }
	    else
	    {
	    System.out.println("The ticket is not booked successfully");
	    }
	    String actualtitle=driver.getTitle();
	    System.out.println("The title is " +actualtitle);
	    Thread.sleep(4000); 
	    List<WebElement> frame=driver.findElements(By.tagName("a"));
		int l=frame.size();
		System.out.println("Total.no.frames:"+l);
	    List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	    for(WebElement link:allLinks)
	    {
	    	System.out.println("The link is  " +link.getText() + " - " +link.getAttribute("href"));
	    }
	    
	    
	   
	}

}
