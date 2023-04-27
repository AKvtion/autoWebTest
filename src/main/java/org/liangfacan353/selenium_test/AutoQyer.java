package org.liangfacan353.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoQyer {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "E:\\sfautoWebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 设置浏览器最大化
        driver.manage().window().maximize();
        driver.get("https://www.qyer.com/");
        driver.findElement((By.linkText("锦囊"))).click();
        TimeUnit.SECONDS.sleep(2L);
        driver.findElement((By.linkText("社区"))).click();
        TimeUnit.SECONDS.sleep(2L);
        driver.findElement((By.linkText("行程助手"))).click();
        TimeUnit.SECONDS.sleep(2L);
        driver.findElement((By.partialLinkText("商城"))).click();
        TimeUnit.SECONDS.sleep(2L);
        driver.findElement((By.partialLinkText("酒店·民宿"))).click();
        TimeUnit.SECONDS.sleep(2L);
        driver.findElement((By.partialLinkText("特价酒店"))).click();
        TimeUnit.SECONDS.sleep(2L);

        driver.findElement(By.xpath("//input[@placeholder='搜城市/机场/地标/酒店']")).sendKeys(Keys.CONTROL+"a"+ Keys.BACK_SPACE, "广州");

        driver.findElement(By.className("_1NvUtOVR8BL55WjVD2JkAi")).click();
        System.out.println(driver.getTitle());
    }
}
