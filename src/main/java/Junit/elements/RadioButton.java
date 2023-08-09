package Junit.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement radiobutton = driver.findElement(By.id("yesRadio"));
        boolean selectState = radiobutton.isSelected();
        if (selectState == false){
            radiobutton.click();
        }
        Thread.sleep(3000);
    }
}
