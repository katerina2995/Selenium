package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Selenium\\src\\main\\resources\\windows.html");
        WebElement iframe = null;
                try {
                    iframe = webDriver.findElement(By.cssSelector("#iframe > iframe"));
                }catch (NotFoundException e){
                    System.out.println("Элемент не найден");
                }
        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement select = frame.findElement(By.cssSelector("#selectable > li:nth-child(1)"));
        select.click();
        Thread.sleep(2000);
        System.out.println("End test");
    }
}
