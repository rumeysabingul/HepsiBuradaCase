package driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverExec {

    public static WebDriver driver;
    private String baseUrl = "https://www.hepsiburada.com/";
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeScenario
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        capabilities = DesiredCapabilities.chrome();
        options.addArguments("--kiosk");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-fullscreen");
        System.setProperty("webdriver.chrome.driver","web_driver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
    }

    @AfterScenario
    public void tearDown()  {
        driver.quit();
    }
}
