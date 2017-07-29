package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumParllelTesting {


    WebDriver webDriver;
    Browser driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser){
        driver = new Browser();
        webDriver = driver.getDriver(browser);
    }

    @AfterClass
    public void teardown(){
        webDriver.quit();
    }

    @Test
    public void test_parallel(){
        webDriver.get("http://www.store.demoqa.com");
    }


}
