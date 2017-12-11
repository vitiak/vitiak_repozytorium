package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://vitiak.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();

    }

    @After
    public void cleanUpAfterTest() {
//        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
//        assertTrue(checkTaskExistsInTrello(taskName));
        deleteTask(taskName);
    }

    private void deleteTask(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());
        String XPATH = "/html/body/main/section[2]/div/form[1]/div/fieldset[1]/button[4]";

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach( theForm -> {
                    WebElement buttonDeleteTask = theForm.findElement(By.xpath(XPATH));
                    buttonDeleteTask.click();
                });
        Thread.sleep(8000);

    }


    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/Button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(8000);
        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement((By.xpath(".//button[contains(@class, \"card-creation\")]")));
                    buttonCreateCard.click();
                });
        Thread.sleep(8000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        boolean result = false;
        final String TRELLO_URL = "https://trello.com/login";
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("kwaswi@wp.pl");
        driverTrello.findElement(By.id("password")).sendKeys("test1kvas");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(9000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-title\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Board\"]")).size()>0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(9000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size()>0;

        driverTrello.close();
        return result;
    }
}
