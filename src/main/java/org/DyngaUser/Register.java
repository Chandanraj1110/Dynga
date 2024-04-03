package org.DyngaUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Register {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Maximize the window
       driver.manage().window().maximize();
        driver.get("https://qa.dynga.io/register");
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Chandan");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kumar");
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("rajchandan1110@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//*[@id=\"agreement\"]")).click();


        Thread.sleep(3000);


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(12000);


        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div/form/div/div[9]/button")).click();

        Thread.sleep(12000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/button")).click();


       /* driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ARZ0qKKYcu_fFKEaWW5VW0gZKfV-lni0eV5Gg1SrpwzSTKLOH_PB9XQgy4b0NENNv2dgzje_lCAmyA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S620791311%3A1711456262849671&theme=mn&ddm=0");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rajchandan1110@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("C@Kumar43#");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("ifmail");
        String strCode =
                driver.findElement(By.xpath("//body/main[1]")).getText();
        driver.close();
        System.out.println(strCode);
        Set<String> allWindowHandles =
                driver.getWindowHandles();
        for (String ignored : allWindowHandles) {
            driver.switchTo().window((String) ((Set<?>) allWindowHandles).iterator().next());
        }

        String sa =
                strCode.substring(117, 122);
        System.out.println(sa);
        Thread.sleep(2000);*/

    }
}
