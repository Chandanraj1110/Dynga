package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class KYC_Level_1 {
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


        //KYC level 1

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://qa.dynga.io/auth/settings/setting-account");
        WebElement upload=driver.findElement(By.cssSelector("#root > section > div.main_handle_right > div.main_handle_right_content > section > div > div > div > div.settings_sec_inner_data > div > form > div:nth-child(1) > div:nth-child(1) > div.settings_sec_inner_data_upload > div > div.upload_box_right > div > input[type=file]"));
        upload.sendKeys("D:\\FullSizeRender.jpg");

        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[1]/div/div[2]/div/div[1]/div/label")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[2]/div/div[2]/div/div/div[1]/div/input")).sendKeys("17/07/1996");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[1]/div/ul/li[6]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[3]/div[1]/div[2]/div/input")).sendKeys("HGGGF5777dc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[3]/div[2]/div[2]/div/input")).sendKeys("1052A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[3]/div[3]/div[2]/div/input")).sendKeys("Mohali");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[3]/div[4]/div[2]/div/input")).sendKeys("140307");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[2]/div[3]/div[5]/div[2]/div/input")).sendKeys("Punjab");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"Country\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text() = \"Myanmar\"]")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/section/div[2]/div[2]/section/div/div/div/div[2]/div/form/div[3]/div/button")).click();
       Thread.sleep(6000);
       driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-1\"]/div[2]/div/div/input")).sendKeys("5653058865656");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-1\"]/div[2]/button")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[1]")).sendKeys("1");
       Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[2]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[3]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[4]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[5]")).sendKeys("1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/input[6]")).sendKeys("1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/button")).click();






    }
}
