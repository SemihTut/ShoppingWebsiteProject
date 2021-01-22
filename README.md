# ShoppingWebsiteProject


**TOOLS AND EXPLANATIONS**

The project has been prepared based on Cucumber BDD style. Maven build management tool is used in this project by Java (JDK8+) language. 
To reduce code duplication and to improve test maintenance,the project is created by using the Page Object Design Pattern so the data were collected under the different Java classes. It is like a class that mirrors the behavior and objects (Web elements) of a webpage from the application. 
Dependencies have been prepared under the pom.xml file. Webdriver Manager dependency is used for this project. 
In the project the data is stored in config.properties and to read that .properties file there is a class called ConfigurationReader. 
Driver based on Singleton Design Pattern and to make it more efficient for parallel testing, InheritableThreadLocal class is used. Instead of singleton pattern specification we can now have seperate objects for each thread.
There are also useful classes/methods inside Utilities package such as PasswordGenerator, BrowserUtils, EmailGenerator and so on.

**Technology Stack**

• Java

• Selenium WebDriver

• Maven

• Cucucmber

• JUnit

**Prerequisites**

• Windows

• Java 1.8 - Java Dev Kit

• Maven - Dependency Manager

• IntelliJ IDEA – IDE

**HOW TO RUN TESTS**
```
-> Under the runners package "CukesRunner" right click and run CukesRunner. 

-> mvn verify --> in the IDE console or navigate project path in command line and run.
```
**HOW TO CREATE TEST REPORTS**

1-) When you run tests with the "mvn verify" command from the console, you can see Cucumber Html Report under the target file.
```
-> target -> cucumber-html-reports > overview-steps.html (open with chrome option)
```
2-) Second type of report, the project is run from Runner class, a Cucumber Report link is created in the IDE console automatically.
```
Sample link -> View your Cucumber Report at: (Works 24 hours later than it will delete automatically)
```
http://localhost:63342/AlphaSenseProject/target/cucumber-html-reports/overview-features.html

3-) The Driver, pom.xml and console are ready for Parallel testing. Type mvn verify -Dbrowser-chrome from the console and the relevant browser will open automatically. 

4-) To run a special tag, you only need to change tags (tags = "@test1") section in the Runner, only that tag will work specifically. It also works exclusively in the console with mvn verify -Dcucumber.options = "- tags @test2". 


SemihTut

QA Automation Engineer 

https://www.linkedin.com/in/semihtut/
www.semihtut.com



