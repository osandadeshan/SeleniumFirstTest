import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

/**
 * Created by Osanda on 6/9/2017.
 */
public class RetrieveAllLinks {

    WebDriver driver;

    @Before
    public void navigateToGoogle() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        String BASE_URL = "https://www.google.com/#q=automation";

        //Navigate to the URL
        driver.get(BASE_URL);
    }

    @Test
    public void getAllLinks() {

        //Get all links of the Web Elements
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //Print all links text
        for(WebElement link: allLinks){
            System.out.println(link.getText());
        }

        //Print the count of links
        System.out.println("Links count is: " + allLinks.size());
    }

    @After
    public void tearDown(){
        driver.close();
    }
}