// Generated by Selenium IDE
package pkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class T2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void t2() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1054, 800));
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).sendKeys("books");
    {
      WebElement element = driver.findElement(By.cssSelector(".g:nth-child(4) .LC20lb"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#rso > .MjjYud:nth-child(1) .LC20lb")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,398.3999938964844)");
    js.executeScript("window.scrollTo(0,1351.199951171875)");
    driver.findElement(By.cssSelector("#anonCarousel2 #acsProductBlockV2-0 img")).click();
  }
}