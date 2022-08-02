package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
		
	WebDriver driver;
	
	@Given("^Opne chrome browser and enter LTM server url$")
	public void Opne_chrome_browser() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Mydata\\Selenium\\chromedriver.exe");  
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions handlingSSL = new ChromeOptions();
		 //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		 handlingSSL.setAcceptInsecureCerts(true);
		 driver=new ChromeDriver(handlingSSL);
		driver.manage().window().maximize();
		driver.get("https://203.123.47.116/Login.aspx");		
	}

	@When("^User enter valid UserName and Passowrd$")
	public void User_enter_valid_UserName_and_Passowrd() throws Throwable {
	   
		driver.findElement(By.id("UserName")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("covid#123");
		
		
	}

	@Then("^User should be able to login successfully.$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		
	}

	

}
