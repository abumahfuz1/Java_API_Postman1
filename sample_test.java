package org.example;

        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;



        import org.openqa.selenium.safari.SafariDriver;
//        import org.openqa.selenium.time;
        import static java.lang.Thread.sleep;

public class sample_test {
    //
    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub

 //       System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver_mac_arm64/chromedriver");
        System.setProperty("webdriver.firefox.FirefoxDriver", "/usr/local/bin/geckodriver");
  //      System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
       WebDriver driver = new FirefoxDriver();
 //       WebDriver driver = new SafariDriver();
        sleep(10000);
//       WebDriver driver = new ChromeDriver();
        //driver.get("https://staff.apps-staging.va.gov/vsecs/");
        driver.get("https://google.com");
        sleep(10000);
//        driver.get("www.just9minutes.com");
        System.out.println(driver.getTitle()); // validate if your page Tile is correct



//
//            driver.findElement(By.id("username")).sendKeys("editorbanglaamar@gmail.com"); // This line is to enter UserId
//            driver.findElement(By.name("pw")).sendKeys("ayed1234"); // this is to find  password
//            driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// used xpath for Login button
//        //driver.findElement(By.name("Login")).click(); // Login code without xpath



        driver.get("https://demoqa.com/alerts");
        driver.get("https://just9minutes.com");

        sleep(10000);

        driver.manage().window().minimize();
        driver.manage().window().maximize();
        sleep(10000);


        // This step will result in an alert on screen
        driver.findElement(By.id("alertButton")).click();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
    }


}





