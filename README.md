# SampleFlightBooking

This is a sample automation project for fight searching for three different destinations and then validating the search result with search conditions.

<b>Tech Stack -</b>
1. Java
2. JavaScript
3. CSS
4. HTML
5. Selenium Webdriver for Automation
6. TestNg & Extent Framework for Report Generation



<b>PreRequisites to SetUp This Project -</b>

1. Download the JDK file from the Oracle official website - https://www.oracle.com/ae/java/technologies/downloads/
2. You will have to login into the oracle website and then download the JDK based on your system requirement.
3. Set the Java Path for this JDK downloaded.
4. Download the Selenium clients and Webdriver bindings in the language Java from the website - [selenium.dev](https://www.selenium.dev/downloads/)https://www.selenium.dev/downloads/
5. Scroll down the same page and download the chromedriver from the platforms supported by Selenium.
6. Chromedriver should be of 114 version and also you need to downgrade your chrome version to 114. The chromedriver and chrome version should be compatible to run the automation script.
7. Once done, download the eclipse editor and configure it in your system.


<b>Steps to Run this project -</b>

1. Open eclipse and install testNg framework from the eclipse marketplace.
2. Download this project and open the folder in Eclipse editor.
3. Navigate to the testng.xml file.
4. Give the class names from any of those mentioned inside the "src/test/java/qa.tests".
5. Right click on the testng.xml file and run the test case as "TestNG Suite".
6. The browser will open and start running the testcases.


<b>Sharing my approach to build this Project -</b>
1. I basically tried to go through the requirement for the project.
2. Defined the scope by eliminating the scenarios that is not mentioned in the requirement.
3. Designed three test cases for three different destinations.
4. Added project dependencies to the POM file.
5. Generated the BaseTest class which basically contains the after and before test and methods for each of the test case run.
6. Added the browser configurations in before test methods and report generation in after methods using Extent framework.
7. Created different folders for logs and capturing screenshots and generating reports.
8. Created different page elements for all the user actions.
9. Created different page object page for adding all the locators.
10. Created test classes for calling those methods to make the collective action for one test scenario.
11. Added the testnG.xml to the folder to mention the test classes to run.

<b>Chanllenges</b>
It is a this small project build from scratch using Selenium with Java. Most challenging part was to develop the project structure so that it is easy to understand and to also make sure it follows the right coding protocols. 

<b>Pending</b>
More assertions can be added for the search validations.

<b>Screenshot</b>

<img width="1709" alt="Screenshot 2024-03-19 at 4 11 11 PM" src="https://github.com/effusiveanam/SampleFlightBooking/assets/19259939/6efc19f1-b761-4187-8d39-f5b1326435b3">
