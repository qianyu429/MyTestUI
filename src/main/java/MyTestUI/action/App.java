package MyTestUI.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();
        Login login = new Login(driver);
        login.login();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        QueryMyAsset qa =new QueryMyAsset(driver);
        qa.queryMyAsset();
    }
}
