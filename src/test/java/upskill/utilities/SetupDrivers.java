package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

    public static WebDriver driver; // initializing driver<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static void setupDriver() {
     
        WebDriverManager.chromedriver().setup(); // getting the chrome driver from cloud

        ChromeOptions options = new ChromeOptions(); // initializing chrome options
        options.addArguments("--start-maximized"); // add argument to maximize browser
        options.addArguments("--disable-notifications"); // add argument to disable notifications
        // options.addArguments("--headless"); // headless execution
        driver = new ChromeDriver(options); // initializing chrome driver<<<<<<<<<<<<<<<<<<<<<<<
        driver.get("https://www.ebay.com/"); // loading the page
    }

    public static WebDriver getDriver() {
        return driver; // return driver to call
    }

    public static void tearDownDriver() {
        driver.close(); // Close the current session(session involve your browser,Authentication tokens),closing current driver
        driver.quit(); // Close all the session and authentication, closing all driver
    }
}
/*
 * WebDriver Initialization:

>>>>>>>>>>>>>>>I initialize a static WebDriver instance "driver" in the SetupDrivers class, ensuring it’s accessible throughout the project.

ChromeOptions Configuration:

>>>>>>>>>>>>>>>Using ChromeOptions I customize the ChromeDriver's behavior using addArguments():
--start-maximized: Maximizes the browser window for optimal visibility.
--disable-notifications: Disables browser notifications, crucial for uninterrupted automated tests.

Driver Setup:
>>>>>>>>>>>>>>The ChromeDriver is instantiated with these configured ChromeOptions, ensuring consistent behavior across test runs.

Navigating to a Website:
>>>>>>>>>>>>>>>After setup, I use driver.get("https://www.ebay.com/") to navigate to the eBay website, setting the stage for automated testing.

Graceful Termination:
>>>>>>>>>>>>>>>To clean up after tests, tearDownDriver() is employed, which includes:
driver.close(): Closes the current browser window and its session.
driver.quit(): Terminates all browser sessions, releasing resources and ensuring a clean shutdown.
*/
