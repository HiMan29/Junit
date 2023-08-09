package Junit.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//li[2]//span[1]//button[1]//*[name()='svg']")).click();

        driver.findElement(By.xpath("//label[@for='tree-node-workspace']")).click();

       Thread.sleep(3000);
        driver.close();

    }
}
