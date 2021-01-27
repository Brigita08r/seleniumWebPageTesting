import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\GitHub\\seleniumWebPageTesting\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.phptravels.net/home");

        //MainPage mainPage = new MainPage(driver);
        //mainPage.clickLogIn();

        driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/register'][1]")).click();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerWithValidCredits("Tom", "Thomson", "48797757", "email@email.com,",
                "password", "password");

        driver.quit();
    }
}