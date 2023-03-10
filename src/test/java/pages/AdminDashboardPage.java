package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboardPage {
    public AdminDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Customer']")
    public WebElement customerBtn;

    @FindBy(xpath = "//a[text()='All Customer']")
    public WebElement allCustomerBtn;

    @FindBy(xpath = "//div[@id='all_customer']")
    public WebElement allCustomerList;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement sortingBtn;

    @FindBy(xpath = "(//span[@class='dtr-data'])[1]")
    public WebElement isActiveRadioBtn;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement successToastMessage;

    @FindBy(xpath = "//a[text()='Active Customer']")
    public WebElement activeCustomerLink;

    @FindBy(xpath = "//div[@id='active_customer']")
    public WebElement activeCustomerList;
}
