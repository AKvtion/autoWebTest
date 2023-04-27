package org.liangfacan353.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelloSelenium2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\sfautoWebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        // 搜索框输入Selenium
        driver.findElement(By.id("kw")).sendKeys("Selenium");
        // 通过name进行定位，百度搜索框input的id为wd
        //driver.findElement(By.name("wd"));
        // 设置浏览器的窗口大小为500*300,
        //driver.manage().window().setSize(new Dimension(500,300));
        // 设置浏览器显示位置
        //driver.manage().window().setPosition(new Point(200,300));
        // 刷新页面
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        // 模拟提交
        //driver.findElement(By.id("kw")).submit();
        // 延迟3s
        TimeUnit.SECONDS.sleep(6L);
            //driver.close();
        // 通过class name进行定位，百度搜索框input的class name为s_ipt
//        driver.findElement(By.className("s_ipt"));
//        // 通过tag name进行定位，百度搜索框input的tag name为input
//        driver.findElement(By.tagName("input"));

    }
}
