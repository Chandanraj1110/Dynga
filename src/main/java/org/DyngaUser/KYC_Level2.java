package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class KYC_Level2 {
    public static void main(String[] args) throws InterruptedException {




        WebDriver driver=new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open a webpage
        driver.get("https://qa.dynga.io");
        //Login page
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("chandan.qa@antiersolutions.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/form/div/div[3]")).click();

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


        WebElement add = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-2\"]/section/div/div/form/div[2]/div[1]/div/div/div"));
        add.sendKeys("D:\\20_Original.jpg");





    }
    }

