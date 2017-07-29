package selenium;

import org.openqa.selenium.WebDriver;

public class Browser extends BrowserFactory {
    @Override
    public WebDriver getDriver(String browser_name) {
        return super.getDriver(browser_name);
    }
}
