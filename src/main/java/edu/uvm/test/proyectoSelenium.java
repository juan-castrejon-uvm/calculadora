package edu.uvm.test;

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
public class ColooooTest {
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
  public void coloooo() {
    driver.get("https://bstackdemo.com/");
    driver.manage().window().setSize(new Dimension(945, 1012));
    driver.findElement(By.cssSelector("#\\32 > .shelf-item__buy-btn")).click();
    driver.findElement(By.cssSelector("#\\31 > .shelf-item__buy-btn")).click();
    driver.findElement(By.cssSelector("#\\34 > .shelf-item__buy-btn")).click();
    driver.findElement(By.id("5")).click();
    driver.findElement(By.cssSelector(".float-cart__close-btn")).click();
    driver.findElement(By.cssSelector("#\\33 > .shelf-item__buy-btn")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".shelf-item:nth-child(4) .change-product-button:nth-child(2)")).click();
  }
}
