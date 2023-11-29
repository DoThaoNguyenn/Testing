package TestCases;

import Common.Constant;
import Common.Utilities;
import DataObjects.BookTicketPage;
import DataObjects.HomePage;
import DataObjects.LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath() +
                "\\Executables\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();

    }
    @AfterMethod

    public void afterMethod() {

        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }

    @Test
    public void TC1() {
        // Step 1: Open the home page
        HomePage homePage = new HomePage();
        homePage.open();

        // Step 2: Navigate to the login page
        LoginPage loginPage = homePage.gotoLoginPage();

        // Step 3: Attempt to login with a valid username and password
        String validUsername = "dtn1@gmail.com";
        String validPassword = "123456789";
        String expectedWelcomeMessage = "Welcome to Safe Railway"; //"Welcome " + validUsername;

        // Logging in and getting the actual welcome message
        String actualWelcomeMessage = loginPage.login(validUsername, validPassword).getWelcomeMessage();
        System.out.println("Actual Welcome Message: " + actualWelcomeMessage);
//         Step 4: Verify that the welcome message is displayed
//        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Welcome message is not displayed");
    }

    @Test
    public void TC2() {
        // Step 1: Open the home page
        HomePage homePage = new HomePage();
        homePage.open();

        // Step 2: Navigate to the login page
        LoginPage loginPage = homePage.gotoLoginPage();

        // Step 3: Attempt to login with a valid username and password
        String validUsername = "";
        String validPassword = "123456789";
//        String expectedWelcomeMessage = "Welcome to Safe Railway"; //"Welcome " + validUsername;

        // Logging in and getting the actual welcome message
        String actualErrorLoginMessage = loginPage.login(validUsername, validPassword).getErrorLoginMessage();
        System.out.println("Actual Welcome Message: " + actualErrorLoginMessage);
//         Step 4: Verify that the welcome message is displayed
//        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Welcome message is not displayed");
    }

    @Test
    public void TC3() {
        // Step 1: Open the home page
        HomePage homePage = new HomePage();
        homePage.open();

        // Step 2: Navigate to the login page
        LoginPage loginPage = homePage.gotoLoginPage();

        // Step 3: Attempt to login with a valid username and password
        String validUsername = "dtn1@gmail.com";
        String validPassword = "987654321";
//        String expectedWelcomeMessage = "Welcome to Safe Railway"; //"Welcome " + validUsername;

        // Logging in and getting the actual welcome message
        String actualErrorLoginMessage = loginPage.login(validUsername, validPassword).getErrorLoginMessage();
        System.out.println("Actual Welcome Message: " + actualErrorLoginMessage);
//         Step 4: Verify that the welcome message is displayed
//        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Welcome message is not displayed");
    }
    @Test
    public void TC4() {
        // Step 1: Open the home page
        HomePage homePage = new HomePage();
        homePage.open();
        // Step 2: Navigate to the login page
        BookTicketPage bookTicketPage = homePage.gotoBookTicketPage();
    }
    @Test
    public void TC5() {
        // Step 1: Open the home page or any page from where login is initiated
        HomePage homePage = new HomePage();
        homePage.open();

        // Step 2: Navigate to the login page
        LoginPage loginPage = homePage.gotoLoginPage();

        // Step 3: Attempt to log in with the wrong password multiple times
        String username = "dtn1@gmail.com";
        String wrongPassword = "";

        for (int i = 0; i < 5; i++) {
            loginPage.login(username, wrongPassword);
        }
        // Logging in and getting the actual welcome message
        String actualErrorLoginMessage = loginPage.login(username, wrongPassword).getErrorLoginMessage();
        System.out.println("Actual Welcome Message: " + actualErrorLoginMessage);
    }
}
