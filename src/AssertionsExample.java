import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.northernlightsaid.org");
    }
    @Test
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/a[2]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
    }
    @Test
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Northern Lights Aid (NLA)",title,"Title is not matched");
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }




}
