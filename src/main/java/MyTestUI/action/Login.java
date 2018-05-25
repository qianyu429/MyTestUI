package MyTestUI.action;

import MyTestUI.tools.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import MyTestUI.tools.Constant;

/**
 * Created by mac on 2017/9/24.
 */
public class Login {


    private WebDriver driver;

    public Login(WebDriver driver){this.driver =driver;}

    public  void  login(){
        String UserName ="18516569029";
        String Password ="a84100532";

        driver.get(Constant.TEST_URL);
        Log.info(Constant.TEST_URL);
        //进入登录页面
        driver.findElement(By.xpath("//*[@id=\"router-monitor\"]/div/div/div[1]/div[1]/div/div[2]/span/span[1]/a/span")).click();
        //输入用户名
        driver.findElement(By.xpath("//*[@id=\"router-monitor\"]/div/div/div[2]/div/div/div[3]/div[2]/input")).sendKeys(UserName);
        //输入密码
        driver.findElement(By.xpath("//*[@id=\"router-monitor\"]/div/div/div[2]/div/div/div[3]/div[3]/div/input")).sendKeys(Password);
        //点击提交按钮
        driver.findElement(By.xpath("//*[@id=\"router-monitor\"]/div/div/div[2]/div/div/div[3]/a")).click();
    }

}
