import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    private By logInButton = By.xpath("//a[@href='https://www.phptravels.net/login']");
}