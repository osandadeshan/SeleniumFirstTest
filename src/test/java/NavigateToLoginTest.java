import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Osanda on 6/8/2017.
 */
public class NavigateToLoginTest {

    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Osanda\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        String BASE_URL = "http://newtours.demoaut.com";
        String EXPECTED_TITLE = "Welcome: Mercury Tours";
        String ACTUAL_TITLE = "";

        // Launch Chrome and direct it to the Base URL
        driver.get(BASE_URL);

        // Get the actual value of the title
        ACTUAL_TITLE = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (ACTUAL_TITLE.contentEquals(EXPECTED_TITLE)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //Close Chrome
        driver.close();

        // Exit the program explicitly
        System.exit(0);
    }

}
