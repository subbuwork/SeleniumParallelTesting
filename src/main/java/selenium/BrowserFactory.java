package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public  class BrowserFactory  extends BrowserBase{

    private WebDriver webDriver = null;

    @Override
    public WebDriver getDriver(String browser_name) {
        if (browser_name.equalsIgnoreCase("gc")){
            System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Selenium\\drivers\\chromedriver.exe");
            webDriver = new ChromeDriver();
        }else if (browser_name.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","E:\\Softwares\\Selenium\\drivers\\IEDriverServer.exe");
             webDriver = new InternetExplorerDriver();
        }else if (browser_name.equalsIgnoreCase("ff")){
            System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Selenium\\drivers\\geckodriver.exe");
             webDriver = new FirefoxDriver();
        }else if (browser_name.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","E:\\Softwares\\Selenium\\drivers\\MicrosoftWebDriver.exe");
             webDriver = new EdgeDriver();
        }else if ((browser_name.equalsIgnoreCase("sf"))){
            System.setProperty("webdriver.safari.driver","E:\\Softwares\\Selenium\\drivers\\MicrosoftWebDriver.exe");
             webDriver = new SafariDriver();
        }else if (browser_name.equalsIgnoreCase("op")){
            System.setProperty("webdriver.opera.driver","E:\\Softwares\\Selenium\\drivers\\operadriver.exe");
             webDriver = new OperaDriver();
        }else{
            System.out.println("Please pass valid browser name....");
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
