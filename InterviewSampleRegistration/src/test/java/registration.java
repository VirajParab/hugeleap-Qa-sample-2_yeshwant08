import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class registration {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void registration() throws InterruptedException {
        driver.get("https://0ffc-49-15-232-239.ngrok-free.app/");
        sleep(2000);
        WebElement visitSite = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/section[1]/div/footer/button"));
        visitSite.click();
        sleep(5000);
        WebElement registration = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/a[4]"));

        sleep(5000);
        registration.click();
        sleep(5000);
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"textInput\"]"));

        userName.sendKeys("Yeshwant");
        sleep(1000);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
        email.sendKeys("virrarj@gmail.com");
        sleep(1000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
        password.sendKeys("Deleteme%17");
        sleep(1000);
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/button"));

        submitButton.click();

    }
   @AfterClass
    public void tearDown(){
        driver.quit();
   }



}
