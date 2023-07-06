package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[4]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("TestLeaf");
		driver.findElement(By.name("officeSiteName")).sendKeys("Test leaf .com");
		driver.findElement(By.id("annualRevenue")).sendKeys("300000");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select cs = new Select(industry);
		cs.selectByVisibleText("Computer Software");
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select scorp = new Select(owner);
		scorp.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select employee = new Select(source);
		employee.selectByValue("LEAD_EMPLOYEE");
		WebElement camp = driver.findElement(By.id("marketingCampaignId"));
		Select ecom = new Select(camp);
		ecom.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select texas = new Select(state);
		texas.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
