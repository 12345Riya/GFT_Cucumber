package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo1 {
	WebDriver driver=null;
	
	@Given("^the login page is opened$")
	
	public void the_login_page_is_opened() throws Throwable {
		String chromePath = "C:\\sel\\jars\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	 
	}

	@When("^the user enters lalitha as username$")
	public void the_user_enters_lalitha_as_username() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
	 
	}

	@When("^user enters password(\\d+) as password$")
	public void user_enters_password_as_password(int arg1) throws Throwable {
		driver.findElement(By.id("password")).sendKeys("password123");
		 
	   
	}

	@Then("^user will finds a testmeapp homepage$")
	public void user_will_finds_a_testmeapp_homepage() throws Throwable {
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	  
	}


}
