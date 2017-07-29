package selenium;

import org.openqa.selenium.WebDriver;

public abstract  class BrowserBase extends Object{
    public abstract WebDriver getDriver(String browser_name);
}
