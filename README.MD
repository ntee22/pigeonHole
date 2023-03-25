Pigeonhole Event Automation
This project uses Selenium and Java to automate the following steps for a Pigeonhole event:

Go to https://pigeonhole.at and wait for the page to load.
Enter the event passcode and click on the arrow button to reveal the Attendee code field.
Enter the Attendee code and click on the arrow button to navigate to the agenda page.
Enter the Q&A session named Sample Q&A by clicking on Enter this Q&A.
Enter a question in the input box and click on the Ask button to submit the question.
Click on the Add a comment button under your question to navigate to the comments page.
Enter a comment in the input textfield and click on the comment button to submit the comment.
Click on the upvote button for the comment and verify that the upvote count has increased by 1.
Requirements
Java 8 or higher
Maven
ChromeDriver
Getting Started
Clone this repository to your local machine.
Open the project in your preferred IDE.
Modify the PigeonholeEventAutomation.java file to include the event passcode, attendee code, question, and comment that you want to automate.
Run the PigeonholeEventAutomation.java file to execute the automation.
Code Explanation
The PigeonholeEventAutomation.java file contains a Java class PigeonholeEventAutomation that automates the steps described above using the Page Object Model (POM) pattern.

The class includes the following methods:

initializeDriver(): Creates a new ChromeDriver instance and sets the driver options.
navigateToPigeonhole(): Navigates to the https://pigeonhole.at website and waits for the page to load.
enterEventPasscode(): Enters the event passcode and clicks on the arrow button to reveal the Attendee code field.
enterAttendeeCode(): Enters the attendee code and clicks on the arrow button to navigate to the agenda page.
enterQASession(): Enters the Q&A session named Sample Q&A by clicking on Enter this Q&A.
askQuestion(): Enters a question in the input box and clicks on the Ask button to submit the question.
enterCommentPage(): Clicks on the Add a comment button under your question to navigate to the comments page.
addComment(): Enters a comment in the input textfield and clicks on the comment button to submit the comment.
upvoteComment(): Clicks on the upvote button for the comment and verifies that the upvote count has increased by 1.
closeDriver(): Closes the ChromeDriver instance.
The class also includes a constructor that initializes the ChromeDriver instance and sets up the page objects using the PageFactory class.

The PigeonholePage class defines the page objects for the Pigeonhole website, including the event passcode field, attendee code field, Q&A session button, question input box, comment input box, and upvote button.

Credits
This project was created by Nhut Kelvin and is licensed under the MIT License.
