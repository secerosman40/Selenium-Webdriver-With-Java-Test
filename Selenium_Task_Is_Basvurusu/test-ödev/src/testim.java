



import java.io.*;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testim {
WebDriver driver=new FirefoxDriver();

public void anasayfa(){
//Belirlenen sayfa acılması t
try {
      driver.get("http://www.amazon.com");
      System.out.println("amazon.com a giris yapildi");
    } catch (Exception e) {
        System.out.println("siteye giris gerceklesmedi");
    }
//reg-nav-link
}
public void kayıt() throws InterruptedException{
//
try {
       driver.findElement(By.id("nav-link-accountList"))
.click();
       System.out.println("Logine giris yapildi");
    } catch (Exception e) {
        System.out.println("Logine giris geceklesmedi");
    }

    try {
        driver.findElement(By.id("ap_email"))
.sendKeys("marali_12_14@hotmail.com");
Thread.sleep(5000);
//Enter password
driver.findElement(By.id("ap_password"))
.sendKeys("1a2s3d4f5g6h7j");
Thread.sleep(5000);
driver.findElement(By.cssSelector("#signInSubmit"))
.click();
        System.out.println("giris gerceklesti");
    } catch (Exception e) {
        System.out.println("giris gerceklesmedi");
    }


}
public void arama() throws InterruptedException{
    try {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
// Click on the search button
driver.findElement(By.xpath("//input[@value='Go']")).click();

        System.out.println("Arama butonuna Samsung yazip giris gerceklesti");
    } catch (Exception e) {
        System.out.println("Arama gerceklesmedi");
    }
    try {
        //samsun aramam sonucunda 2 sayfayı secmek için kullanılacak
driver.findElement(By.xpath("//*[@id=\"pagn\"]/span[3]/a")).click();
        Thread.sleep(5000);
        System.out.println("samsun aramam sonucunda 2 sayfayı secildi");



    } catch (Exception e) {
        System.out.println("islem gerceklesmedi");
    }

    try {
        ////samsun arama sonucunda  2 sayfadaki  3  eleman seçilecek
driver.findElement(By.xpath("(//*[@id=\"resultsCol\"]//a[contains(@class,'access-detail-page')])[3]")).click();
driver.findElement(By.id("add-to-wishlist-button-submit")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='View Your List']")).click();
        System.out.println("samsun arama sonucunda  2 sayfadaki  3  eleman secildi");
    } catch (Exception e) {
        System.out.println("islem gerceklesmedi");
    }


    try {
        //wish list  sececek  sabri listesini sececek
driver.findElement(By.xpath("//*[@id=\"wl-list-link-KJ5Y3PQUB2D9\"]/div")).click();
Thread.sleep(5000);
        System.out.println("wish list  sececek  osman listesini sececek");
    } catch (Exception e) {
        System.out.println("ıslem gerceklesmedi");
    }
    try {
        //Listeden silme işlemini gercekleştirecek
driver.findElement(By.cssSelector("#a-autoid-5 > span > input")).click();

        System.out.println("silme islemi gerceklesti");
    } catch (Exception e) {
        System.out.println("silme islemi gerceklesmedi");
    }

    try {
        // bağlantı kapatılacak
driver.close();
        System.out.println("bağlantı kapatılacak");
    } catch (Exception e) {
        System.out.println("baglantı kapatma islemi gerceklesmedi");
    }


}


public static void main(String[] args) throws IOException, InterruptedException {

testim a=new testim();
a.anasayfa();
a.kayıt();
a.arama();
}
}


































