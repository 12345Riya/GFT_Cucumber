package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo2 {
	WebDriver driver=null;

	
	@Given("^user login page is opened$")
	public void user_login_page_is_opened() throws Throwable {
String chromePath = "C:\\sel\\jars\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("the title of the page is"+driver.getTitle());
		
	    
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" as password$")
	public void user_enters_and_as_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		
		
	}
	   
	

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	  
	}

	@Then("^will finds a testmeapp homepage$")
	public void will_finds_a_testmeapp_homepage() throws Throwable {
	
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	  
	  


}
	}
