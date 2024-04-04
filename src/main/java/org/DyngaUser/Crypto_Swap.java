package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crypto_Swap {
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

        // Swap ETH-USDT

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://qa.dynga.io/auth/convert");

        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[text() = \"BTC\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"ETH\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("circle")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"pay\"]")).sendKeys(" .01");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div/form/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button")).click();


        //Swap USDT-ETH

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"BTC\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"ETH\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"pay\"]")).sendKeys("30");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button")).click();

        Thread.sleep(10000);
        driver.quit();




    }
}
