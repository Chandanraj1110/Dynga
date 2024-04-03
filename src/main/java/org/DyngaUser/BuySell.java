package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class BuySell {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();


        // Open a webpage
        driver.get("https://qa.dynga.io");
        //Login page
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("chandan.qa@antiersolutions.com");
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

        // Buy Crypto (BTC)

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://qa.dynga.io/auth/buysell");

        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div[2]/div[1]/div/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"fiat\"]")).sendKeys("100000");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div[2]/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();


        //Sell Crypto (BTC)

        Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/ul/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div[2]/div[1]/div/div[2]/button[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"fiat\"]")).sendKeys("10000");
driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div[2]/form/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();
Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();


        //Buy ETH

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/ul/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div[2]/div[3]/div/div[2]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fiat\"]")).sendKeys("10000");
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div[2]/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();

        //Sell ETH

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/ul/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div[2]/div[3]/div/div[2]/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fiat\"]")).sendKeys("15000");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div[2]/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();



    }
}
