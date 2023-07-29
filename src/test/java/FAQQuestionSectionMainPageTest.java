import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page_object.MainPage;

@RunWith(Parameterized.class)
public class FAQQuestionSectionMainPageTest extends BaseTest{

  private final String questionOne;
  private final String questionTwo;
  private final String questionThree;
  private final String questionFour;
  private final String questionFive;
  private final String questionSix;
  private final String questionSeven;
  private final String questionEight;

  public FAQQuestionSectionMainPageTest(String questionOne, String questionTwo, String questionThree, String questionFour, String questionFive,
                                        String questionSix, String questionSeven, String questionEight) {
    this.questionOne = questionOne;
    this.questionTwo = questionTwo;
    this.questionThree = questionThree;
    this.questionFour = questionFour;
    this.questionFive = questionFive;
    this.questionSix = questionSix;
    this.questionSeven = questionSeven;
    this.questionEight = questionEight;
  }

  @Parameterized.Parameters
  public static Object[][] getOrderData() {
    return new Object[][] {
            {"Сколько это стоит? И как оплатить?",
            "Хочу сразу несколько самокатов! Так можно?",
            "Как рассчитывается время аренды?",
            "Можно ли заказать самокат прямо на сегодня?",
            "Можно ли продлить заказ или вернуть самокат раньше?",
            "Вы привозите зарядку вместе с самокатом?",
            "Можно ли отменить заказ?",
            "Я жизу за МКАДом, привезёте?"},
    };
  }

  @Test
  public void checkQuestionOne() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionOne, mainPage.checkQuestionOne());
  }

  @Test
  public void checkQuestionTwo() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionTwo, mainPage.checkQuestionTwo());
  }

  @Test
  public void checkQuestionThree() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionThree, mainPage.checkQuestionThree());
  }

  @Test
  public void checkQuestionFour() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionFour, mainPage.checkQuestionFour());
  }

  @Test
  public void checkQuestionFive() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionFive, mainPage.checkQuestionFive());
  }

  @Test
  public void checkQuestionSix() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionSix, mainPage.checkQuestionSix());
  }

  @Test
  public void checkQuestionSeven() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionSeven, mainPage.checkQuestionSeven());
  }

  @Test
  public void checkQuestionEight() {
    MainPage mainPage = new MainPage(driver);
    mainPage.open();
    Assert.assertEquals(questionEight, mainPage.checkQuestionEight());
  }
}
