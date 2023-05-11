package Fellp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IntegraçãoChrome {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public  WebDriver webDriver(){

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        this.webDriver = new ChromeDriver(options);
        try {

            this.webDriver.get("https://web.whatsapp.com/");
            while (this.webDriver.findElements(By.id("side")).size() < 1 ){
                System.out.println("Connecting... Please wait");
            }
        }catch (Exception e){

            System.err.println(e);
        }
        return this.webDriver;
    }

}
