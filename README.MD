## Pigeonhole Event Automation

This project uses Selenium and Java to automate the following steps for a Pigeonhole event:
1. Go to https://pigeonhole.at (Make sure the page is loaded)
2. Under `Enter Event Passcode` field, type in event passcode and click on the Attendee code field should appear arrow button (Attendee code field should appear)
3. Under `Enter Attendee Code` field, type in the attendee code and click on the (The page should navigate to an agenda arrow button page.)
4. Enter the Q&A session named `Sample Q&A` by clicking on `Enter this Q&A` (The page should navigate into the Q&A button. session.)
5. In the input box, type in the event passcode and click on the `Ask` button. (A popup modal should appear and you should see your question posted in the list)
6. Under your question, click on the `Add a comment` button (The page should navigate to the comments page)
7. In the input textfield, type in the event passcode and click on the comment button (The popup should appear and close. Your comment appears in the list)
8. Upvote on the comment you have just posted (The comment upvote count should increase by 1)

# **Requirements**
* Java 8 or higher
* Maven
* ChromeDriver (or Firefox Driver)

# **Getting Started**
1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Download Chrome or Firefox Driver and edit file path in webDriverFactory.java
4. Modify the PigeonholeEventAutomation.java file to include the event passcode, attendee code, question, and comment that you want to automate.
5. Run the pigeonHoleMain.java file to execute the automation.

# **Code Explanation**
The PigeonholeEventAutomation.java file contains a Java class PigeonholeEventAutomation that automates the steps described above using the Page Object Model (POM) pattern.
The class includes the following methods:
* initializeDriver(): Creates a new ChromeDriver instance and sets the driver options.
* navigateToPigeonhole(): Navigates to the https://pigeonhole.at website and waits for the page to load.
* enterEventPasscode(): Enters the event passcode and clicks on the arrow button to reveal the Attendee code field.
* enterAttendeeCode(): Enters the attendee code and clicks on the arrow button to navigate to the agenda page.
* enterQASession(): Enters the Q&A session named Sample Q&A by clicking on Enter this Q&A.
* askQuestion(): Enters a question in the input box and clicks on the Ask button to submit the question.
* enterCommentPage(): Clicks on the Add a comment button under your question to navigate to the comments page.
* addComment(): Enters a comment in the input textfield and clicks on the comment button to submit the comment.
* upvoteComment(): Clicks on the upvote button for the comment and verifies that the upvote count has increased by 1.
* closeDriver(): Closes the ChromeDriver instance.
The class also includes a constructor that initializes the ChromeDriver instance and sets up the page objects using the PageFactory class.
The PigeonholePage class defines the page objects for the Pigeonhole website, including the event passcode field, attendee code field, Q&A session button, question input box, comment input box, and upvote button.

# **Credits**
This project was created by Nhut Kelvin and is licensed under the MIT License.
