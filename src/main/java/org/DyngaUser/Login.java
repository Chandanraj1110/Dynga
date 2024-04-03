package org.DyngaUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        // Open a webpage
        driver.get("https://qa.dynga.io");

Thread.sleep(3000);

        //Login page
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("chandan.qa@antiersolutions.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin@123");

        Thread.sleep(3000);


       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);



        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/form/div/div[4]/button")).click();

        Thread.sleep(3000);





        //Fiat deposit


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://qa.dynga.io/auth/cryptowallet");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div[2]/div[2]/div/div/div[2]/button[1]")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("1000000");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div/div[2]/form/button")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[3]/input")).sendKeys("652626652625");

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/button")).click();


        //Fiat withdrawal

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div[2]/div[2]/div/div/div[2]/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"0\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("10000");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/div/div/div[2]/form/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button")).click();
        driver.findElement(By.cssSelector("button[aria-label='Close']")).click();


    }
}