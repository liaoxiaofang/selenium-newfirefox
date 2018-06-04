package firefoxnew;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by nanjia on 2018/3/29.
 *
 */
public class baidu {
    @Test
    public void testBaidu() {
        //高版本的火狐（47+）需要指定指驱，geckodriver-v0.19.0-win64对应selenium-java-v3.5.3
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //初始化一个火狐浏览器实例，实例名称叫driver
        WebDriver driver = new FirefoxDriver();
        //最大化窗口
        driver.manage().window().maximize();
        // get()打开一个站点
        driver.get("http://www.baidu.com/");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： " + driver.getTitle());
        //定位输入框元素
        WebElement txtbox = driver.findElement(By.name("wd"));
        //输入selenium
        txtbox.sendKeys("selenium");
        //定位百度一下按钮元素
        WebElement btn = driver.findElement(By.id("su"));
        //点击
        btn.click();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //
        System.out.println("打开成功");
        //关闭并退出浏览器
        driver.quit();
    }
}
