package org.liangfacan353.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class qyer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\sfautoWebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // 设置浏览器最大化
        driver.manage().window().maximize();
        driver.get("https://www.qyer.com/");
        driver.findElement((By.linkText("锦囊"))).click();
        driver.findElement((By.linkText("社区"))).click();
        driver.findElement((By.linkText("行程助手"))).click();
        driver.findElement((By.linkText("商城"))).click();
        driver.findElement((By.linkText("酒店·民宿"))).click();
        driver.findElement((By.linkText("特价酒店"))).click();
        driver.findElement(By.tagName("input")).sendKeys("广州");
        driver.findElement(By.className("_1NvUtOVR8BL55WjVD2JkAi")).click();
        System.out.println(driver.getTitle());

        // 刷新页面
        //driver.navigate().refresh();
        // 搜索框输入Selenium
        //driver.findElement(By.id("kw")).sendKeys("Selenium");
        // 通过name进行定位，百度搜索框input的id为wd
        //driver.findElement(By.name("wd"));
        // 设置浏览器的窗口大小为500*300,
        //driver.manage().window().setSize(new Dimension(500,300));
        // 设置浏览器显示位置
        //driver.manage().window().setPosition(new Point(200,300));

        // 模拟提交
        //driver.findElement(By.id("kw")).submit();
        // 延迟3s
        //TimeUnit.SECONDS.sleep(6L);
            //driver.close();
        // 通过class name进行定位，百度搜索框input的class name为s_ipt
//        driver.findElement(By.className("s_ipt"));
//        // 通过tag name进行定位，百度搜索框input的tag name为input
//        driver.findElement(By.tagName("input"));

    }
}
