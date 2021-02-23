package lessons9;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class TestApplication {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver1\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.selenium.dev/");
        webDriver.manage().window().maximize();
        String title = webDriver.getTitle();
        System.out.println("Start test");

        PrintStream file = new PrintStream("report.html");
        file.println("<html><head><title>Selenium test log</title></head><body>");
        file.println("<h1>Tests</h1>");
        file.println("<h2>Tests #1</h2>");

        if(title.equals("SeleniumHQ Browser Automation")){
            file.println("<p style = 'color:green;'>Test ok</p>");
            File img = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            InputStream inputStream = new FileInputStream(img);
            OutputStream outputStream = new FileOutputStream("img\\screen.png");
            byte[]buffer = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
            inputStream.close();
            outputStream.close();
            file.println("<a href = 'img/screen.png' target = '_blank'><img width='200' src = 'img/screen.png'/></a>");



        }if (true){
            file.println("<p style = 'color:red;'>Test error</p>");
        }
        file.println("</body></html>");
        file.close();














        webDriver.quit();
        System.out.println("End test");
    }
}
