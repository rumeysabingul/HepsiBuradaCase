package Methods;

import driver.DriverExec;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Methods {
    private WebDriver driver;

    public Methods(){
        this.driver= DriverExec.driver;

    }

    public WebElement find(By by){
        return driver.findElement(by);
    }

    public List<WebElement> findAll(By by){
        return driver.findElements(by);
    }

    public void click(By by){
    WebElement element =driver.findElement(by);
    element.click();
    }

    public void type(By by, String text){
    WebElement element =driver.findElement(by);
    element.sendKeys(text);
    }

    public String getElementText(By by){
        return find(by).getText();
    }


    public void pageScrollDown(int pixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixel+")");
    }

    public void mouseOver(By by){
        Actions actions = new Actions(driver);
        WebElement element = find(by);
       actions.moveToElement(element).perform();
    }

    public Boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }

    public void selectWithVisibleText(By by,String option){
     Select select = new Select(find(by));
     select.selectByVisibleText(option);

    }

    public String getSelectedValueOnDropdown(By by){
        Select select = new Select(find(by));
        return select.getFirstSelectedOption().getText();
    }
}
