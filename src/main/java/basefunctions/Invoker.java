package basefunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoker {
    private static WebDriver driver;
    private static Invoker instance= new Invoker();

    private Invoker(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }

    public static Invoker getInstance(){
        if (instance==null){
            instance= new Invoker();
            return instance;
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
