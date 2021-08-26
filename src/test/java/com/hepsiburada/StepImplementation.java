package com.hepsiburada;


import Methods.Methods;
import com.thoughtworks.gauge.Step;
import driver.DriverExec;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepImplementation {

    private WebDriver driver;
    private Methods methods;

    public StepImplementation() {
        methods = new Methods();
        this.driver= DriverExec.driver;
    }
    @Step("<key> elementinin üstüne gelinir")
    public void mouseOverForLogin(String key){
        methods.mouseOver(By.id(key));
    }
    @Step("<key> saniye beklenir")
    public void wait(int key) throws InterruptedException {
        Thread.sleep(key*1000);
    }
    @Step("<key> elementine tıkla")
    public void clickToElement(String key){
        methods.click(By.cssSelector(key));
    }
    @Step("<key> elementine <text> değerini yaz")
    public void SendKeysToBox(String key,String text){
        methods.find(By.id(key)).sendKeys(text);
    }
    @Step("<loginControlText> bilgisi <expectedUser> ile karşılaştırılır")
    public void loginControl(String loginControlText, String expectedUser ){
        Assert.assertEquals(methods.getElementText(By.cssSelector(loginControlText)),expectedUser);
    }
    @Step("<key> objesine tıklanır")
    public void clickElement(String key){
        methods.click(By.id(key));
    }
    @Step("<key> elementine <text> değeri yazıldı")
    public void SendKeysBox(String key,String text){
        methods.find(By.cssSelector(key)).sendKeys(text);
    }


}
