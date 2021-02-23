package lessons9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.security.Key;
import java.util.List;

public class ActionsTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String str = "C:\\Users\\Student\\IdeaProjects\\Selenium\\src\\main\\resources\\actions.html";

        webDriver.get(str);
        Actions actions = new Actions(webDriver);
        try {
            List<WebElement> li = webDriver.findElements(By.tagName("li"));
            actions.click(li.get(1))
                    .keyDown(Keys.CONTROL)
                    .moveToElement(li.get(6))
                    .pause(2000)
                    .click()
                    .perform();

        } catch (Exception e) {
            e.printStackTrace();
        }
webDriver.quit();
    }
}
