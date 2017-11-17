import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson2_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();
        Thread.sleep(1000);
        WebElement user = driver.findElement(By.id("employee_infos"));
        user.click();
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
        driver.quit();

    }

    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}