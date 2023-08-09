package Junit.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/elements");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Himanshu Oriya");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("him@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("rajkot");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("London");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);

        System.out.println( driver.findElement(By.xpath("//p[@id='name']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@id='email']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@id='currentAddress']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText());

        driver.close();

    }


}
