package PageModels;

import driver.Driver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<MobileElement> findElements(By by) {
        return driver.findElements(by);
    }

    public WebElement controlVisibleElement(By by) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception ex) {
            return null;
        }
    }

    public String getText(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    protected void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void checkList(By by, int index){
        List<MobileElement> list = findElements(by);
        clickElement(list.get(index));
    }
}