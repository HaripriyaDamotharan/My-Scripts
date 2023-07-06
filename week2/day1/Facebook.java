package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hari");
		driver.findElement(By.name("lastname")).sendKeys("Priya");
		driver.findElement(By.name("reg_email__")).sendKeys("haripriya.mba27@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Hari@1327");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select bday = new Select(day);
		bday.selectByValue("27");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select bmonth = new Select(month);
		bmonth.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select byear = new Select(year);
		byear.selectByValue("1997");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();
		// driver.findElement(By.name("websubmit")).click();
	}

}
