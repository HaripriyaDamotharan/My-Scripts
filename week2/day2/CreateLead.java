package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select employee = new Select(source);
		employee.selectByValue("LEAD_EMPLOYEE");
		WebElement camp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ecom = new Select(camp);
		ecom.selectByValue("9001");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select corp = new Select(ownership);
		corp.selectByIndex(5);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select india = new Select(country);
		india.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
