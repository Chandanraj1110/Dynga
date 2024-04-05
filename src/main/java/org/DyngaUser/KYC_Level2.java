package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class KYC_Level2 {


    public static void main(String[] args) throws InterruptedException {




        WebDriver driver=new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        // Open a webpage
        driver.get("https://qa.dynga.io");

        Thread.sleep(3000);

        //Login page
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("rajchandan1110@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin@123");

        Thread.sleep(3000);


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);



        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/form/div/div[4]/button")).click();

        Thread.sleep(3000);


        //KYC level 2

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://qa.dynga.io/auth/settings/setting-account");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[1]/a[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-2\"]")).click();
        Thread.sleep(3000);

        //For selecting the dropdown

        driver.findElement(By.xpath("//*[text() = \"Select Document Type\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"Passport\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-2\"]/section/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("454554dcddc5");
        Thread.sleep(3000);


        //Upload documents
       WebElement upload=driver.findElement(By.cssSelector("#uncontrolled-tab-example-tabpane-2 > section > div > div > form > div:nth-child(2) > div:nth-child(1) > div > div > div > input[type=file]"));

        Thread.sleep(3000);
        upload.sendKeys("D:\\FullSizeRender.jpg");

        Thread.sleep(3000);
        upload = driver.findElement(By.cssSelector("#uncontrolled-tab-example-tabpane-2 > section > div > div > form > div:nth-child(2) > div:nth-child(2) > div > div > div > input[type=file]"));
        upload.sendKeys("D:\\FullSizeRender.jpg");
        Thread.sleep(3000);
        upload=driver.findElement(By.cssSelector("#uncontrolled-tab-example-tabpane-2 > section > div > div > form > div:nth-child(2) > div:nth-child(3) > div > div > div > input[type=file]"));
        upload.sendKeys("D:\\FullSizeRender.jpg");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-2\"]/section/div/div/form/div[2]/div[4]/button")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();

        Thread.sleep(6000);
        driver.quit();

        }
    }

