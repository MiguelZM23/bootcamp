// Generated by Selenium IDE
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
public class ComprobacionteclasseleniumTest {
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
  public void comprobacionteclasselenium() {
    driver.get("http://127.0.0.1:5500/frontend/ejercicios/calculadora.html");
    driver.manage().window().setSize(new Dimension(917, 693));
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("1"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("2"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("3"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(1) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("4"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("5"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("6"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(1) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("7"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("8"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("9"));
    driver.findElement(By.id("limpiar")).click();
    driver.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(1) > .imprimir")).click();
    assertThat(driver.findElement(By.id("pantalla")).getText(), is("0"));
  }
}
