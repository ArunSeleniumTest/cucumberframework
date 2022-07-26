package appdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	 public  ChromeDriver driver;
	
	@Given("with browser launching with url {string}")
	public void with_browser_launching_with_url(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	     Thread.sleep(5000);
	    driver.get(string);
	    System.out.println("Launched the url");
	    
	        
	}

	@When("user login with the username {string} and password {string}")
	public void user_login_with_the_username_and_password(String string, String string2) throws InterruptedException {
		//button[@name='login']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(string2);
	    System.out.println("Entered user id and password");
	}

	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 System.out.println("clicked login button");
	}

	@Then("verify the failure message {string}")
	public void account_should_be_opened_with_response_code(String string) throws InterruptedException {
		Thread.sleep(5000);
		String mytext = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[1]/parent::div")).getText();
		System.out.println(mytext);
		System.out.println(string);
		if(mytext.contains(string)) {
			System.out.println("The case is passed with the response code");
		}else {
			System.out.println("The 4th case is failed");
		}
	}
	
	@Then("click on the forgot password options")
	public void click_on_the_forgot_password_options() {
	   driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[2]")).click();
	}


}
