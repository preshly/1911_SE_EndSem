package third_question;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Registration {

		private static Logger logger = Logger.getLogger(Registration.class.getName());
		
		private static void waitTime() {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				logger.log(Level.INFO,"Exception occurred" );
			}
		}

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", 
					"D:\\1911_Sem_4\\SE LAB\\1_selenium_drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("file:///D:/1911_Sem_4/SE%20LAB/zz_login_page/registration.html");
			
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Oliver Giroud");
			Registration.waitTime();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("og@gmail.com");
			Registration.waitTime();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("thisisusername");
			Registration.waitTime();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mypassword");
			
			Registration.waitTime();
			
			driver.findElement(By.xpath("/html/body/form/button")).click();
			
			Registration.waitTime();
			
			String expected = "Registration successfull";
			String result = driver.findElement(By.xpath("/html/body/p[2]")).getText();
			
			Registration.waitTime();
			
			
			logger.log(Level.INFO,"\n Result == Expexted: {0} \n" , expected.equals(result));
			
			driver.close();

	}

}
