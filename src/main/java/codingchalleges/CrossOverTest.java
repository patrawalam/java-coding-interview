package codingchalleges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CrossOverTest {

	public static void main(String[] args) {
		
		String url = "https://codeshare.io/";
		String fullName = "Murtaza P";
		String emailAddress = "abc@gmail.com";
		String password = "Abcd1234";
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		
		WebElement signUpPage = driver.findElement(By.xpath("//h1[contains(text(),'Sign up to save code')]"));
		wait.until(ExpectedConditions.visibilityOf(signUpPage));
		
		WebElement txtName = driver.findElement(By.name("name"));
		WebElement txtEmail = driver.findElement(By.name("email"));
		WebElement txtPwd = driver.findElement(By.name("password"));
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		txtName.clear();
		txtName.sendKeys(fullName);
		
		txtEmail.clear();
		txtEmail.sendKeys(emailAddress);
		
		txtPwd.clear();
		txtPwd.sendKeys(password);
		
		btnSubmit.click();
		
		WebElement userCred = driver.findElement(By.xpath("//img[contains(@src,'gravatar')]/parent::a"));
		wait.until(ExpectedConditions.visibilityOf(userCred));
		
		String actualResult = userCred.getText();
		System.out.println(actualResult);
		
		Assert.assertEquals(actualResult, fullName);
		
		
		
		
		

	}

}
