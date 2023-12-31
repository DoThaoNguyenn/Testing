package DataObjects;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    //Locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By lblErrorLoginMessage = By.xpath("//p[contains(@class, 'message error LoginForm')]");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//a[@href='/Page/BookTicketPage.cshtml']");


    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }
    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getlblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getlblErrorLoginMessage(){
        return Constant.WEBDRIVER.findElement(lblErrorLoginMessage);
    }
    protected WebElement tabBookTicket(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }

    //Methods
    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }
    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }
    public RegisterPage gotoRegisterPage(){
        this.getabRegister().click();
        return new RegisterPage();
    }
    public BookTicketPage gotoBookTicketPage(){
        this.tabBookTicket().click();
        return new BookTicketPage();
    }
    public String getErrorLoginMessage() {
        return this.getlblErrorLoginMessage().getText();
    }

}
