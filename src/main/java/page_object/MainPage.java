package page_object;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
  // Url сервиса для заказа самокатов
  private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

  // Верхняя кнопка "Заказать"
  private static final By ORDER_BUTTON_TOP = By.xpath("(.//button[@class='Button_Button__ra12g'])[1]");

  // Верхняя кнопка "Заказать"
  private static final By ORDER_BUTTON_BOTTOM = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

  // Блок "Вопросы о важном"
  // Вопросы
  private static final By QUESTION_TEXT_ONE = By.xpath(".//div[@id='accordion__heading-0']");
  private static final By QUESTION_TEXT_TWO = By.xpath(".//div[@id='accordion__heading-1']");
  private static final By QUESTION_TEXT_THREE = By.xpath(".//div[@id='accordion__heading-2']");
  private static final By QUESTION_TEXT_FOUR = By.xpath(".//div[@id='accordion__heading-3']");
  private static final By QUESTION_TEXT_FIVE = By.xpath(".//div[@id='accordion__heading-4']");
  private static final By QUESTION_TEXT_SIX = By.xpath(".//div[@id='accordion__heading-5']");
  private static final By QUESTION_TEXT_SEVEN = By.xpath(".//div[@id='accordion__heading-6']");
  private static final By QUESTION_TEXT_EIGHT = By.xpath(".//div[@id='accordion__heading-7']");

  // Ответы
  private static final By RESPONSE_WRAPPER_ONE = By.xpath(".//div[@id='accordion__heading-0']/..");
  private static final By RESPONSE_WRAPPER_TWO = By.xpath(".//div[@id='accordion__heading-1']/..");
  private static final By RESPONSE_WRAPPER_THREE = By.xpath(".//div[@id='accordion__heading-2']/..");
  private static final By RESPONSE_WRAPPER_FOUR = By.xpath(".//div[@id='accordion__heading-3']/..");
  private static final By RESPONSE_WRAPPER_FIVE = By.xpath(".//div[@id='accordion__heading-4']/..");
  private static final By RESPONSE_WRAPPER_SIX = By.xpath(".//div[@id='accordion__heading-5']/..");
  private static final By RESPONSE_WRAPPER_SEVEN = By.xpath(".//div[@id='accordion__heading-6']/..");
  private static final By RESPONSE_WRAPPER_EIGHT = By.xpath(".//div[@id='accordion__heading-7']/..");

  private static final By RESPONSE_TEXT_ONE = By.xpath(".//div[@id='accordion__panel-0']/p");
  private static final By RESPONSE_TEXT_TWO = By.xpath(".//div[@id='accordion__panel-1']/p");
  private static final By RESPONSE_TEXT_THREE = By.xpath(".//div[@id='accordion__panel-2']/p");
  private static final By RESPONSE_TEXT_FOUR = By.xpath(".//div[@id='accordion__panel-3']/p");
  private static final By RESPONSE_TEXT_FIVE = By.xpath(".//div[@id='accordion__panel-4']/p");
  private static final By RESPONSE_TEXT_SIX = By.xpath(".//div[@id='accordion__panel-5']/p");
  private static final By RESPONSE_TEXT_SEVEN = By.xpath(".//div[@id='accordion__panel-6']/p");
  private static final By RESPONSE_TEXT_EIGHT = By.xpath(".//div[@id='accordion__panel-7']/p");

  private WebDriver driver;

  public MainPage(WebDriver driver) {
    this.driver = driver;
  }

  public MainPage open() {
    driver.get(PAGE_URL);
    return this;
  }

  public MainPage clickOrderStatusButtonTop() {
    driver.findElement(ORDER_BUTTON_TOP).click();
    return this;
  }

  public MainPage clickOrderStatusButtonBottom() {
    WebElement element = driver.findElement(ORDER_BUTTON_BOTTOM);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(ORDER_BUTTON_BOTTOM).click();
    return this;
  }

  public String checkQuestionOne() {
    return driver.findElement(QUESTION_TEXT_ONE).getText();
  }

  public String checkQuestionTwo() {
    return driver.findElement(QUESTION_TEXT_TWO).getText();
  }

  public String checkQuestionThree() {
    return driver.findElement(QUESTION_TEXT_THREE).getText();
  }

  public String checkQuestionFour() {
    return driver.findElement(QUESTION_TEXT_FOUR).getText();
  }

  public String checkQuestionFive() {
    return driver.findElement(QUESTION_TEXT_FIVE).getText();
  }

  public String checkQuestionSix() {
    return driver.findElement(QUESTION_TEXT_SIX).getText();
  }

  public String checkQuestionSeven() {
    return driver.findElement(QUESTION_TEXT_SEVEN).getText();
  }

  public String checkQuestionEight() {
    return driver.findElement(QUESTION_TEXT_EIGHT).getText();
  }

  public String checkResponseOne() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_ONE);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_ONE).click();
    return driver.findElement(RESPONSE_TEXT_ONE).getText();
  }

  public String checkResponseTwo() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_TWO);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_TWO).click();
    return driver.findElement(RESPONSE_TEXT_TWO).getText();
  }

  public String checkResponseThree() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_THREE);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_THREE).click();
    return driver.findElement(RESPONSE_TEXT_THREE).getText();
  }

  public String checkResponseFour() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_FOUR);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_FOUR).click();
    return driver.findElement(RESPONSE_TEXT_FOUR).getText();
  }

  public String checkResponseFive() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_FIVE);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_FIVE).click();
    return driver.findElement(RESPONSE_TEXT_FIVE).getText();
  }

  public String checkResponseSix() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_SIX);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_SIX).click();
    return driver.findElement(RESPONSE_TEXT_SIX).getText();
  }

  public String checkResponseSeven() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_SEVEN);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_SEVEN).click();
    return driver.findElement(RESPONSE_TEXT_SEVEN).getText();
  }

  public String checkResponseEight() {
    WebElement element = driver.findElement(RESPONSE_WRAPPER_EIGHT);
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    driver.findElement(RESPONSE_WRAPPER_EIGHT).click();
    return driver.findElement(RESPONSE_TEXT_EIGHT).getText();
  }

}
