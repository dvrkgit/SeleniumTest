import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
