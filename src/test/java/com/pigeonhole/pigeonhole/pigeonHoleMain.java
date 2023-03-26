package com.pigeonhole.pigeonhole;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pigeonHoleMain {
    public static void main(String[] args) throws InterruptedException {
        String browserName = "chrome"; // or "firefox"

        pigeonHoleClass pWeb = new pigeonHoleClass(browserName);
//        WebDriver driver = new ChromeDriver(options);
//        pigeonHoleClass pWeb = new pigeonHoleClass(driver);

        // 1. Go to https://pigeonhole.at (Make sure the page is loaded)
        pWeb.goToHomePage();

        // 2. Type in event passcode and click on the submit button (Attendee code field should appear)
        pWeb.enterPasscode("PIGEONQATEST");

        // 3.  Type in the attendee code and click on the submit button (The page should navigate to an agenda arrow button page)
        pWeb.enterAttendeeCode("0752I6SHZN");

        // 4. Enter Q&A (The page should navigate into the Q&A button. session.)
        pWeb.enterQA();

        // 5. Type in the event passcode and click on the `Ask` button. (A popup modal should appear, and you should see your question posted in the list)
        pWeb.askQuestion("PIGEONQATEST");

        // 6. Click on the `Add a comment` button under your question (The page should navigate to the comments page)
        pWeb.clickToComment();

        // 7. Type in the event passcode and click on the comment button (The popup should appear and close. Your comment appears in the list)
        pWeb.addComment("PIGEONQATEST");

        // 8. Upvote on the comment you have just posted (The comment upvote count should increase by 1)
        pWeb.clickUpvote();

        // Done TestCase
        pWeb.quitDriver();
    }
}
