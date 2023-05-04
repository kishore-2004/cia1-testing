package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cia1_qno1 {
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ22G36/ref=sr_1_1_sspa?keywords=iphone+14+pro+max&qid=1683193344&sprefix=ip%2Caps%2C269&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String etitle = "Apple iPhone 14 Pro Max (128 GB) - Space Black : Amazon.in: Electronics";
        System.out.println(title);
        if(title.equals(etitle)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        System.out.println("DELETED");
        Thread.sleep(2000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(removeText.equals(extext)) {
        	System.out.println("Product is removed");
        }
        Thread.sleep(1000);
        driver.get("https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ22G36/ref=sr_1_1_sspa?keywords=iphone+14+pro+max&qid=1683193344&sprefix=ip%2Caps%2C269&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        Thread.sleep(3000);
//        String sign = driver.getTitle()
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("kishorekishore1241@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();       
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Kishore@2004");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

        
    }
}