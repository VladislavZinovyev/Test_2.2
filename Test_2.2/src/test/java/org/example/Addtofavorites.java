package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class Addtofavorites {

    public WebDriver driver;
    public Addtofavorites(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    // Локатор определения кнопки добавления в избранное
    @FindBy(xpath = "//div[@class = 'css-1sv27i9 ecjvn7j0']")
    private WebElement Favorites;

    // метод для нажатия кнопки дабавления в избранное
    public void AddFavorites() {
        Favorites.click(); }
}
