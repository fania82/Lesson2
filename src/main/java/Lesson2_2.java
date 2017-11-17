import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson2_2  {

        public static void main (String[] args) throws InterruptedException {
            WebDriver driver = initChromeDriver();
            driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("webinar.test@gmail.com");
            WebElement password = driver.findElement(By.id("passwd"));
            password.sendKeys("Xcg7299bnSmMuRLp9ITw");
            WebElement button = driver.findElement(By.name("submitLogin"));
            button.click();
            Thread.sleep(1000);


            WebElement dashboard_link = driver.findElement(By.id("tab-AdminDashboard"));
            dashboard_link.click();
            WebElement dashboard_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + dashboard_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement dashboard_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + dashboard_tittle_after.getText());
                if(driver.findElement(By.className("page-title")).isDisplayed() )
                    System.out.println("Result is equal");
                else
                    System.out.println("Result is not equal");

            WebElement order_link = driver.findElement(By.id("subtab-AdminParentOrders"));
            order_link.click();
            WebElement order_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + order_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement order_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + order_tittle_after.getText());
                if(driver.findElement(By.className("page-title")).isDisplayed() )
                    System.out.println("Result is equal");
                else
                    System.out.println("Result is not equal");

            WebElement catalog_link = driver.findElement(By.id("subtab-AdminCatalog"));
            catalog_link.click();
            WebElement catalog_tittle_before = driver.findElement(By.tagName("h2"));
            System.out.println("section before refreshing is " + catalog_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement catalog_tittle_after = driver.findElement(By.tagName("h2"));
            System.out.println("section after refreshing is " + catalog_tittle_after.getText());
                if(driver.findElement(By.tagName("h2")).isDisplayed() )
                    System.out.println("Result is equal");
                else
                    System.out.println("Result is not equal");

            WebElement client_link = driver.findElement(By.linkText("Клиенты"));
            client_link.click();
            WebElement client_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + client_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement client_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + client_tittle_after.getText());
                if(driver.findElement(By.className("page-title")).isDisplayed() )
                    System.out.println("Result is equal");
                else
                    System.out.println("Result is not equal");

            WebElement support_link = driver.findElement(By.linkText("Служба поддержки"));
            support_link.click();
            WebElement support_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + support_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement support_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + support_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement stat_link = driver.findElement(By.id("subtab-AdminStats"));
            stat_link.click();
            WebElement stat_tittle_before = driver.findElement(By.tagName("h2"));
            System.out.println("section before refreshing is " + stat_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement stat_tittle_after = driver.findElement(By.tagName("h2"));
            System.out.println("section after refreshing is " + stat_tittle_after.getText());
            if(driver.findElement(By.tagName("h2")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement modules_link = driver.findElement(By.id("subtab-AdminParentModulesSf"));
            modules_link.click();
            WebElement modules_tittle_before = driver.findElement(By.tagName("h2"));
            System.out.println("section before refreshing is " + modules_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement modules_tittle_after = driver.findElement(By.tagName("h2"));
            System.out.println("section after refreshing is " + modules_tittle_after.getText());
            if(driver.findElement(By.tagName("h2")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement design_link = driver.findElement(By.linkText("Design"));
            design_link.click();
            WebElement design_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + design_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement design_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + design_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement shiping_link = driver.findElement(By.id("subtab-AdminParentShipping"));
            shiping_link.click();
            WebElement shiping_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + shiping_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement shiping_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + shiping_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement payment_link = driver.findElement(By.id("subtab-AdminParentPayment"));
            payment_link.click();
            WebElement payment_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + payment_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement payment_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + payment_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement international_link = driver.findElement(By.id("subtab-AdminInternational"));
            international_link.click();
            WebElement international_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + international_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement international_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + international_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement parameters_link = driver.findElement(By.id("subtab-ShopParameters"));
            parameters_link.click();
            WebElement parameters_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + parameters_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement parameters_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + parameters_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            WebElement advparameters_link = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
            advparameters_link.click();
            WebElement advparameters_tittle_before = driver.findElement(By.className("page-title"));
            System.out.println("section before refreshing is " + advparameters_tittle_before.getText());
            Thread.sleep(1000);
            driver.navigate().refresh();
            WebElement advparameters_tittle_after = driver.findElement(By.className("page-title"));
            System.out.println("section after refreshing is " + advparameters_tittle_after.getText());
            if(driver.findElement(By.className("page-title")).isDisplayed() )
                System.out.println("Result is equal");
            else
                System.out.println("Result is not equal");

            driver.quit();
        }




    private static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }

}
