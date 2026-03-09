package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Bai3 {
//    @Test
//    void testGoogle(){
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://WWW.google.com");
//
//        WebElement searchBox=driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium WebDriver");
//        searchBox.submit();
//    }
//
//    @Test
//    void testRegister() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        try {
//            driver.get("https://nettruyenviet1.com/Secure/Register.aspx");
//
//            driver.findElement(By.id("name")).sendKeys("Vutung");
//            driver.findElement(By.id("email")).sendKeys("vutungtb200101@gmail.com");
//            driver.findElement(By.id("password")).sendKeys("123456");
//            driver.findElement(By.id("cf_password")).sendKeys("123456");
//
//            driver.findElement(
//                    By.xpath("//input[@type='submit' and @value='Đăng ký']")
//            ).click();
//
//
//            assertTrue(
//                    wait.until(ExpectedConditions.urlContains("nettruyenviet1.com"))
//            );
//
//
//
//        } finally {
//            driver.quit();
//        }
//    }
//
//
//    @Test
//    void testLogin() {
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        try {
//            driver.get("https://nettruyenviet1.com/Secure/Login.aspx");
//
//            driver.findElement(By.id("email"))
//                    .sendKeys("vutungtb2008@gmail.com");
//            driver.findElement(By.id("password"))
//                    .sendKeys("123456");
//
//            driver.findElement(
//                    By.xpath("//input[@type='submit' and @value='Đăng nhập']")
//            ).click();
//
//            assertTrue(
//                    wait.until(ExpectedConditions.urlContains("nettruyenviet1.com"))
//            );
//
//        } finally {
//            driver.quit();
//        }
//    }
}
