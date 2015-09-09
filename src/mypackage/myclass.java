import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class myclass {
public static void main(String[] args)  {
                //Declaration and instantiation of variables
                WebDriver driver = new FirefoxDriver();
                String baseUrl = "http://www.salesforce.com";
                            
                
                driver.manage().window().maximize();
                //String expectedTitle = "Welcome: Mercury Tours";
                //String actualTitle = "";
               
                //launch Firefox  and directit to the base URL
                driver.get(baseUrl);
                driver.findElement(By.id("button-login")).click();
               
                
                WebDriverWait wait = new WebDriverWait(driver, 10);
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
                
                
                driver.findElement(By.id("username")).sendKeys("funky.boy23@gmail.com");
               
                driver.findElement(By.id("password")).sendKeys("calypso7");
               
                driver.findElement(By.id("username")).submit();
                //Login Complete
               
                //Select IT Prof
                
                System.out.println("Login Complete");
                
                //WebDriverWait wait2 = new WebDriverWait(driver, 30);
                System.out.println("Waiting1");
                
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                
                System.out.println("Waiting2");
                
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                
                System.out.println("Waiting3");
                
                driver.findElement(By.className("walkthrough-role-avatar walkthrough-role-owner")).click();
                //driver.findElement(By.className("walkthrough-role-avatar walkthrough-role-it")).click();
                
                //WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("it-choice")));
                /*By css = By.cssSelector("#Information Technology div.walkthrough-role-choice>h1>a");
                WebElement element3 = driver.findElement(css );
                String text = element3.getText();
                System.out.println(text);*/
                
                /*WebDriverWait wait2 = new WebDriverWait(driver, 30);
                System.out.println("Waiting");
                
               WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("it-choice")));
                
                List<WebElement> texts = driver.findElements(By.cssSelector("div:contains('Information Technology')"));*/
                
                System.out.println("Test Complete");
                
                //driver.findElement(By.className("walkthrough-role-avatar walkthrough-role-it")).click();
                
                
                
                //Click on Accounts tab
                //driver.findElement(By.linkText("Accounts Tab")).click();
               
               
                //get the actualvalue of the title
                //actualTitle = driver.getTitle();
                //System.out.println(driver.getTitle());
               
                /*
                * compare the actual title of the page witht the expected one and print
    * the result as "Passed" or "Failed"
                */
                //if (actualTitle.contentEquals(expectedTitle)) {
                                //System.out.println("Test Passed");
                //} else {
                                //System.out.println("Test Failed");
                }
               
               
}
