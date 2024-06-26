import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpeningBrowser {

    public static void main(String[] args) {

        openBrowser("chrome");

        openBrowser("firefox");

        openBrowser("edge");
    }

    public static void openBrowser(String browser) {

        WebDriver driver = null;

        switch (browser) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\Chrome\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.firefox.driver", "C:\\Webdriver\\Firefox\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.driver", "C:\\Webdriver\\Edge\\msedgedriver.exe");
                driver = new EdgeDriver();
            }
        }

        driver.get("http://www.google.com/");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

}
