package marathon.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PvrTC3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver browser = new ChromeDriver ();

		browser.manage().window().maximize();
		
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		browser.get("https://www.pvrcinemas.com/");
		
		Thread.sleep(3000);
		
		// browser.findElement(By.xpath("(//button[contains(@class,'close close-modal')])[2]")).click();
		
		// browser.findElement(By.xpath("//div[contains(@class,'location-element')]")).click();
		
		// browser.findElement(By.xpath("//img[@alt='Chennai']")).click();
		
		browser.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		
		Thread.sleep(5000);
		
		WebElement city = browser.findElement(By.name("city"));
		
		Select chennai = new Select(city);
		
		chennai.selectByValue("Chennai");
		
		WebElement genre = browser.findElement(By.name("genre"));
		
		Select animation = new Select(genre);
		
		animation.selectByVisibleText("ANIMATION");
		
		WebElement lang = browser.findElement(By.name("lang"));
		
		Select eng = new Select(lang);
		
		eng.selectByVisibleText("ENGLISH");
		
		browser.findElement(By.xpath("//button[text()='Apply']")).click();
		
		Thread.sleep(7000);
		
	//	browser.findElement(By.xpath("//div[@class='movie-list']//div[text()='Paw Patrol']")).click();
		
		browser.findElement(By.xpath("(//div[contains(@class,'ng-star-inserted')])[5]")).click();
		
		Thread.sleep(3000);
		
		browser.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement cinema = browser.findElement(By.name("cinemaName"));
		
		Select pvr = new Select(cinema);
		
		pvr.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		browser.findElement(By.xpath("//div[contains(@class,'datepicker-default')]")).click();
		
		browser.findElement(By.xpath("//div[@class='main-calendar-days']//span[text()='8']")).click();
		
		WebElement time = browser.findElement(By.name("timings"));
		
		Select ampm = new Select(time);
		
		ampm.selectByIndex(3);
		
		browser.findElement(By.name("noOfTickets")).sendKeys("2");
		
		browser.findElement(By.name("name")).sendKeys("MMRaj");
		
		browser.findElement(By.name("email")).sendKeys("haripriya.mba27@gmail.com");
		
		browser.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8110908336");		
		
		WebElement fb = browser.findElement(By.name("food"));
		
		Select yes = new Select(fb);
		
		yes.selectByIndex(0);
		
		browser.findElement(By.name("comment")).sendKeys("No");
		
		browser.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		
		browser.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		Thread.sleep(3000);
		
		browser.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		browser.findElement(By.xpath("//button[@class='swal2-close']")).click();
		
		String title= browser.getTitle();
		
		System.out.println(title);
		
	}
	

}
