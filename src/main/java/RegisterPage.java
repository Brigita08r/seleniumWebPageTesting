import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameField = By.xpath("//input[@name='firstname']");
    private By lastNameField = By.xpath("//input[@name='lastname']");
    private By mobileNumberField = By.xpath("//input[@name='phone']");
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By passwordConfirmationField = By.xpath("//input[@name='confirmpassword']");
    private By singUpButton = By.xpath("//button[@type='submit']");

    public RegisterPage typeFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public RegisterPage typeLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegisterPage typeMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
        return this;
    }

    public RegisterPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegisterPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public RegisterPage confirmPassword(String password) {
        driver.findElement(passwordConfirmationField).sendKeys(password);
        return this;
    }

    public RegisterPage registerWithValidCredits(String firstName, String lastName, String mobileNumber,
                                                 String email, String password, String confirmPassword) {
        this.typeFirstName(firstName);
        this.typeLastName(lastName);
        this.typeMobileNumber(mobileNumber);
        this.typeEmail(email);
        this.typePassword(password);
        this.confirmPassword(confirmPassword);
        driver.findElement(singUpButton).click();
        return new RegisterPage(driver);
    }
    
}