package org.DyngaUser;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Bank_Account {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();


        // Open a webpage
        driver.get("https://qa.dynga.io");
        //Login page
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("rajchandan1110@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin@123");


        Thread.sleep(3000);

        //Recaptcha

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/form/div/div[4]/button")).click();

        Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://qa.dynga.io/auth/settings/settings-bank");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[1]/a[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/section/div/div/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[1]/div[1]/div/div/input")).sendKeys("Punjab national bank");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div/div/input")).sendKeys("458200010003");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[1]/div[2]/div[2]/div/div/input")).sendKeys("PNB");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text() = \"Select Account Type\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text() = \"Saving\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div[2]")).click();



    }
}
