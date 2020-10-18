# infotrack-qa-challenge
InfoTract QA Code Challenge
This project solves the QA challenge for google account login 

### Frameworks and patterns used
 * Selenium Java webdriver
 * Cucumber BDD
 * Page objects pattern for creating java page classes corresponding to website page
 * maven as compile, packaging and build tool
 * Reporting via maven surefire plugin
 
### OS and IDE used
This project has been built and tested on Mac OS Catalina and IntelliJ Idea IDE
 
### Project Dependencies 
 * Java 8
 * Maven 3.6.3
 * Selenium 3.141.59
 * Cucumber 1.2.5
 * maven surefire plugin 2.22.2
 * webdrivermanager - 4.1.0 (https://github.com/bonigarcia/webdrivermanager)

### Cloning the project 
```markdown
git clone https://github.com/poojadixit1908/
```

### Compiling and running the project

#### Web automation 
```markdown
mvn clean install -Denv=prod -Dbrowser=chrome
```
### System parameters
 * `env` - can be specified in the maven commandline as -Denv=prod
 * `browser` - supports chrome and firefox browsers and can be specified with maven command line as __-Dbrowser=chrome__ or __-Dbrowser=firefox__
 
##Note
This project automates important scenarios (with more ROI) from the below
list of comprehensive test cases mentioned in the `TestScenarios.txt` file



