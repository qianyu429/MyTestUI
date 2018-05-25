package MyTestUI.action;

import MyTestUI.tools.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by mac on 2017/9/24.
 */
public class QueryMyAsset {



    private WebDriver driver;
    //构造函数
    public QueryMyAsset(WebDriver driver){this.driver =driver;}
    //进入我的资产页面

    public   void queryMyAsset() {
        Log.info("点击进入我的资产页面");

        driver.findElement(By.xpath("//*[@id=\"router-monitor\"]/div/div/div[1]/div[2]/div/ul/li[6]/a/span")).click();

        Assert.assertTrue(driver.getPageSource().contains("//*[@id=\"router-monitor\"]/div/div/div[2]/div/div/div[3]/div/div[2]/div[2]/div/span"));

        Log.info("总资产显示");


    }


}
