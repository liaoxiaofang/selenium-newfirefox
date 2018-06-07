package firefoxnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nanjia on 2018/6/7.
 */
public class BaiduSeleniumGrid {
    @Test
    public void testChrome() throws MalformedURLException, InterruptedException {
        DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://39.108.6.47:5555/wd/hub"), chromeDC);
        driver.get("http://www.baidu.com");
        Thread.sleep(5000);
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： " + driver.getTitle());
        driver.quit();
    }

}
