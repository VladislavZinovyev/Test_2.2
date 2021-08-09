package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    // Локатор поля ввода логина
    @FindBy(xpath = "//input[@name='sign']")
    private WebElement loginField;

    // Локатор кнопки "Войти"
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    // Локатор поля ввода пароля
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwdField;

    // Метод ввода логина
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    // метод ввода пароля
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    // метод нажатия кнопки
    public void clickLoginBtn() {
        loginBtn.click(); }
}
