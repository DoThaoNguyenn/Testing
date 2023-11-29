package DataObjects;
import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class BookTicketPage extends GeneralPage{
    //Locators
    private String menuTabString = "//div[@id='menu']//span[text()'%s' and @id ='%s']";

    //Elements
    public boolean isMenuTabDisplay(String menuItem, String id) {
        By nemuItemBy = By.xpath(menuTabString.format(menuItem, id)); return Constant.WEBDRIVER.findElement (nemuItemBy).isDisplayed();

    }

//    http://railwayb2.somee.com/Page/SuccessPage.cshtml?id=8107

//table[@class='MyTable']//tr[td[input[contains(@onclick, '8107')]]]/td[3]

//table[@class='MyTable']//input[contains(@onclick, '8107')]/ancestor::tr


    //Methods
}
