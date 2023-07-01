package marathon.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBusTC1 {

	public static void main(String[] args) {
		
		WebDriver browser = new ChromeDriver ();

		browser.manage().window().maximize();
		
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		browser.get("https://www.abhibus.com/");
		
		browser.findElement(By.id("pills-home-tab")).click();
		
		browser.findElement(By.id("source")).sendKeys("Chennai");
		
		//setTimeout(function(){debugger;},7000);
		
		browser.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		browser.findElement(By.id("destination")).sendKeys("Bangalore");

		//setTimeout(function(){debugger;},7000);
		
		browser.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		browser.findElement(By.id("datepicker1")).click();
		
		browser.findElement(By.linkText("1")).click();
		
		browser.findElement(By.linkText("Search")).click();
		
		WebElement firstresult = browser.findElement(By.xpath("//h2[contains(@class,'ng-binding')]"));
				
		System.out.println(firstresult.getText());
		
		browser.findElement(By.xpath("(//input[contains(@id,'Bustypes')])[4]")).click();
		
		WebElement noOfSeats = browser.findElement(By.xpath("//p[contains(@class,'noseats AvailSts ng-binding')]"));
		
		System.out.println(noOfSeats.getText());
		
		browser.findElement(By.xpath("//a[contains(@class,'btn-seatselect book1')]")).click();
		
		browser.findElement(By.xpath("(//a[contains(@class,'tooltip tooltipstered')])[3]")).click();
		
		WebElement seatNos = browser.findElement(By.id("seatnos"));
		
		System.out.println(seatNos.getText());
		
		WebElement fare = browser.findElement(By.id("ticketfare"));
		
		System.out.println(fare.getText());
		
		WebElement boarding = browser.findElement(By.className("dropdown_custom"));
		
		Select bp = new Select(boarding);
		
		bp.selectByIndex(5);
		
		WebElement dropping = browser.findElement(By.id("droppingpoint_id"));
		
		Select dp = new Select(dropping);
		
		dp.selectByIndex(6);
		
		String title= browser.getTitle();
		
		System.out.println(title);
		
		browser.close();


	}

}
