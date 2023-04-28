package SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobileView {


    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(565, 768));
    }
}