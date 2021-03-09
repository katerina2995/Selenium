package Exam;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = null;
        try {
            webDriver = new ChromeDriver();
            webDriver.get("http://shop.demoqa.com/shop/");
            webDriver.manage().window().fullscreen();
            WebElement sortMenu = webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-container-catalog > div > form > select"));
            sortMenu.click();
            WebElement sort = webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-container-catalog > div > form > select > option:nth-child(2)"));
            sort.click();

            WebElement shoes = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[11]/div/span[1]"));
            shoes.click();

            WebElement element4 = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[5]/div/h3"));
            element4.click();

            WebElement element5 = webDriver.findElement(By.xpath("//*[@id=\"product-1287\"]/div[1]/div[2]/h1"));
            System.out.println(element5.getText());
            String str = "ROSE GOLD SIMPLE STRAP PLATFORM SANDALS";
            if (element5.getText().equals(str)) {
                System.out.println("Pass");
            } else {
                System.out.println("error");
            }
            webDriver.navigate().back();
            WebElement search = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a"));
            search.click();
            Thread.sleep(2000);
            search.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/form/input[1]")).sendKeys("Sun Glasses");
            webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/button")).submit();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


            WebElement sunglasses = webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[4]/div"));
            sunglasses.click();
            WebElement price = webDriver.findElement(By.cssSelector("#product-1323 > div.single-product-content > div.summary.entry-summary > p > ins > span > bdi"));
            System.out.println(price.getText());


        } catch (NoSuchElementException e) {
            e.getMessage();
        } finally {
            assert webDriver != null;
            webDriver.quit();
        }
    }
}

