package Junit.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("him");
        driver.findElement(By.id("lastName")).sendKeys("hohksaf");
        driver.findElement(By.id("userEmail")).sendKeys("him@gmail.com");
        driver.findElement(By.id("age")).sendKeys("89");
        driver.findElement(By.id("salary")).sendKeys("13344");
        driver.findElement(By.id("department")).sendKeys("hsfghjhgh");
        driver.findElement(By.id("submit'")).click();

    }
}
