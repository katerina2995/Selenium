package lesson7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Selenium\\src\\main\\resources\\windows.html");
        WebElement button = null;
        try {
            button = webDriver.findElement(By.cssSelector("#alert > button"));
            button.click();
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();

            Alert alert = targetLocator.alert();
            String expectedText = "It is simple alert";
            String actualText = alert.getText();
            alert.accept();
            if(expectedText.equals(actualText)) {
                System.out.println("Текст совпадает = " + actualText);
            }

            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException e) {
            System.out.println("Элемент  не найден");
        }
        webDriver.quit();
    }
}
