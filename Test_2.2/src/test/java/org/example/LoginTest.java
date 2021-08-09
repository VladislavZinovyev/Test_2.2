package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class LoginTest {

    public static LoginPage loginPage;
    public static Addtofavorites addtofavorites;
    public static WebDriver driver;



    @BeforeClass
    public static void setup () {

        System.setProperty("webdriver.chrome.driver", "C:\\usr\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        addtofavorites = new Addtofavorites(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        //значение login/pass берутся из файла настроек

        //вводим логин
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("pass"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        // добавление в избранное
        addtofavorites.AddFavorites();
    }




    @AfterClass
    public static void tearDown() {
        // закрыть браузер
        driver.quit();
    }



}