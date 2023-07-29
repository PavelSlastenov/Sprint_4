import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page_object.MainPage;

@RunWith(Parameterized.class)
public class FAQResponseSectionMainPageTest extends BaseTest{

  private final String responseOne;
  private final String responseTwo;
  private final String responseThree;
  private final String responseFour;
  private final String responseFive;
  private final String responseSix;
  private final String responseSeven;
  private final String responseEight;

  public FAQResponseSectionMainPageTest(String responseOne, String responseTwo, String responseThree, String responseFour, String responseFive,
                                        String responseSix, String responseSeven, String responseEight) {
    this.responseOne = responseOne;
    this.responseTwo = responseTwo;
    this.responseThree = responseThree;
    this.responseFour = responseFour;
    this.responseFive = responseFive;
    this.responseSix = responseSix;
    this.responseSeven = responseSeven;
    this.responseEight = responseEight;
  }

  @Parameterized.Parameters
  public static Object[][] getOrderData() {
    return new Object[][] {
            {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                    "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                    "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                    "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                    "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                    "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                    "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                    "Да, обязательно. Всем самокатов! И Москве, и Московской области."
            },
    };
  }

  @Test
  public void checkResponseOne() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseOne, mainPage.checkResponseOne());
  }

  @Test
  public void checkResponseTwo() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseTwo, mainPage.checkResponseTwo());
  }

  @Test
  public void checkResponseThree() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseThree, mainPage.checkResponseThree());
  }

  @Test
  public void checkResponseFour() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseFour, mainPage.checkResponseFour());
  }

  @Test
  public void checkResponseFive() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseFive, mainPage.checkResponseFive());
  }

  @Test
  public void checkResponseSix() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseSix, mainPage.checkResponseSix());
  }

  @Test
  public void checkResponseSeven() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseSeven, mainPage.checkResponseSeven());
  }

  @Test
  public void checkResponseEight() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(responseEight, mainPage.checkResponseEight());
  }
}
