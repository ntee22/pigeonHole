package com.pigeonhole.pigeonhole;

import com.codeborne.selenide.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class pigeonHoleClass {
    private WebDriver driver;

    public pigeonHoleClass(String browserName){
        this.driver = webDriverFactory.create(browserName);
    }

    public void goToHomePage(){
        driver.get("https://pigeonhole.at");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Pigeonhole"));
    }

    public void enterPasscode(String passCode) throws InterruptedException {
        WebElement eventPasscodeField = driver.findElement(By.xpath("//*[@id=\"passcodeInput\"]"));
        eventPasscodeField.sendKeys(passCode);
        eventPasscodeField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        // Wait for the attendeeCodeField to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement attendeeCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attendee-code-input\"]")));

        // Check that the attendee code input field is displayed
        if (attendeeCodeField.isDisplayed()) {
            System.out.println("Attendee Code Field is displayed");
        }else {
            System.out.println("Attendee Code Field is not displayed");
        }
    }

    public void enterAttendeeCode(String attendeeCode) throws InterruptedException {
        WebElement attendeeCodeField = driver.findElement(By.xpath("//*[@id=\"attendee-code-input\"]"));
        attendeeCodeField.sendKeys(attendeeCode);
        attendeeCodeField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Pigeonlab"));
    }

    public void enterQA (){
        WebElement qaSessionButton = driver.findElement(By.xpath("//div/nav/div[2]/div[1]/section/div/div[5]/a"));
        qaSessionButton.click();
        //*[@id="tabpanel-"]/div[2]/div/nav/div[2]/div[1]/section/div/div[5]/a/span[1]
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Q&A"));
    }

    public void askQuestion(String question) throws InterruptedException {
        WebElement askQuestionField = driver.findElement(By.xpath("//div[2]/div[2]/div/div[2]/div[1]/textarea"));
        askQuestionField.sendKeys(question);
        Thread.sleep(2000);
        WebElement askQuestionButton = driver.findElement(By.xpath("//div[2]/div[2]/div[2]/button/div"));
        askQuestionButton.click();
        Thread.sleep(2000);
        // Get text of question asked
        WebElement questionAsked = driver.findElement(By.xpath("//div[3]/div[1]/div/div[2]/div[1]/div[2]"));
        String questionAskedText = questionAsked.getText();
        // Check if the comment is displayed at the top of the list
        if (questionAskedText.equals(question)) {
            System.out.println("Question is asked");
        } else {
            System.out.println("Question is not asked");
        }
//        WebElement questionAsked = driver.findElement((By.xpath("//*[@id=\"question-19588481\"]")));
//        String questionAskedSent = questionAsked.getText();
//        Assert.assertEquals(questionAsked, questionAskedSent);
    }

    public void clickToComment() throws InterruptedException {
        WebElement clickCommentButton = driver.findElement(By.xpath("//div[3]/div[1]/div/div[2]/div[2]/a[2]/span[2]/span[2]"));
        clickCommentButton.click();
        Thread.sleep(3000);
    }

    public void addComment(String comment) throws InterruptedException {
        WebElement addCommentField = driver.findElement(By.xpath("//div/div[1]/div[1]/textarea"));
        addCommentField.sendKeys(comment);
        Thread.sleep(2000);
        WebElement commentButton = driver.findElement(By.xpath("//div/div[1]/div[2]/div[2]/div[2]/button"));
        commentButton.click();
        Thread.sleep(2000);
        // Get text that commented
        WebElement commented = driver.findElement(By.xpath("//div/div[2]/div/div/div/div[2]/p"));
        String textCommented = commented.getText();
        // Check if the comment is displayed at the top of the list
        if (textCommented.equals(comment)) {
            System.out.println("Comment is displayed");
        } else {
            System.out.println("Comment is not displayed");
        }
    }

    public void clickUpvote() throws InterruptedException {
        // Find upvote button
        WebElement upvoteButton = driver.findElement(By.xpath("//div[1]/div[3]/button[1]/span[1]"));

        //  Get the initial upvote count
        WebElement upvoteCount = driver.findElement(By.xpath("//div/div[2]/div/div/div[1]/div[3]/button[1]"));
        int initBeforeUpvoteCount = Integer.parseInt(upvoteCount.getText());

        // Click button upvote
        upvoteButton.click();
        Thread.sleep(3000);
        // Get the initial after click upvote
        WebElement afterUpvoteCount = driver.findElement(By.xpath("//div/div[2]/div/div/div[1]/div[3]/button[1]"));
        int initAfterUpvoteCount = Integer.parseInt(afterUpvoteCount.getText());

        // Verify upvote count increased 1
        if (initAfterUpvoteCount == initBeforeUpvoteCount + 1) {
            System.out.println("Upvote is increase");
        } else {
            System.out.println("Upvote is not increase");
        }
    }

    public void quitDriver(){
        driver.quit();
    }
    }

