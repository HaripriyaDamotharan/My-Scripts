package marathon.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTC2 {

	public static void main(String[] args) {
		WebDriver browser = new ChromeDriver ();

		browser.manage().window().maximize();
		
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		browser.get("https://www.amazon.in/");
		
		browser.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		
		browser.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		WebElement totalresult = browser.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small a-spacing-top-small')]"));
		
		System.out.println(totalresult.getText());
		
		browser.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		
		browser.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		
		browser.findElement(By.xpath("//span[contains(@id,'a-autoid')]")).click();
		
		browser.findElement(By.xpath("(//a[contains(@id,'s-result-sort-select')])[5]")).click();
		
		WebElement name = browser.findElement(By.xpath("//span[contains(@class,'a-color-base a-text-normal')]"));
		
		System.out.println(name.getText());
		
		WebElement price = browser.findElement(By.xpath("//span[@class=\"a-price-whole\"]"));
		
		System.out.println(price.getText());
		
		browser.close();

	
	}

}
