import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By myAccountButton = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']/a");

    public LoginPage clickLogIn() {
        driver.findElement(myAccountButton).click();
        driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/login']")).click();
        return new LoginPage(driver);
    }
}