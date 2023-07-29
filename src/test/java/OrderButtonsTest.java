import org.junit.Assert;
import org.junit.Test;
import page_object.MainPage;
import page_object.OrderPage;

public class OrderButtonsTest extends BaseTest {

    @Test
    public void checkOrderButtonTop() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.open();
        mainPage.clickOrderStatusButtonTop();
        Assert.assertTrue(orderPage.isOrderDataHeaderVisible());
    }

    @Test
    public void checkOrderButtonBottom() {
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        mainPage.open();
        mainPage.clickOrderStatusButtonBottom();
        Assert.assertTrue(orderPage.isOrderDataHeaderVisible());
    }
}
