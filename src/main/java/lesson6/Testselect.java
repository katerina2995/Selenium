package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Testselect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\Selenium\\src\\main\\resources\\select.html");

//        WebElement selectElement = webDriver.findElement(By.cssSelector("body > form > select > option:nth-child(4)"));
        WebElement selectElement = webDriver.findElement(By.cssSelector("body > form > select:nth-child(3)"));
//        System.out.println(selectElement.getText());
        Select select = new Select(selectElement);
        List<WebElement> options = select.getOptions();

        String[] countries = {"Ukraine", "China", "Italy", "USA"};
        if(options.size() ==countries.length) {
            for (int i = 0; i < options.size(); i++) {
                WebElement webElement = options.get(i);
                if (options.get(i).getText().equals(countries[i])){
                    System.out.println("Exp " + options.get(i).getText() + " actual " + countries[i]);
                }
            }
        }else {
            System.out.println("Exp size = " + options.size() + " actual size = " + countries.length);
        }
        System.out.println("Selected elements");
        select.selectByIndex(1);
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement selectedEl : allSelectedOptions) {
            System.out.println(selectedEl.getText());

        }
        webDriver.quit();
        System.out.println("OK");
    }
}
