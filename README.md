# seleniumWebPageTesting

How to set up environment if you are testing wih Selenium on your PC for the first time:

1. **Make sure you have installed maven and jdk on your PC. Can be checked via cmd. Type mvn -version and java -version:**

![cmd](https://user-images.githubusercontent.com/55987521/105578866-d88eb300-5d8b-11eb-8aca-891eb9a58aee.PNG)

2. **Navigate to Environmental Variables and set in System variables -> Path.** 
Add locations to bin folders of jdk and maven:

![pathToBins](https://user-images.githubusercontent.com/55987521/105597363-9f127380-5d9c-11eb-8714-2160f266a828.PNG)

3. **Also, add there JAVA_HOME and M2_HOME:**

![homePaths](https://user-images.githubusercontent.com/55987521/105598291-e0a31e80-5d9c-11eb-82d6-f300e92ed3e6.PNG)

4. **Download driver on which you want to run your tests. For ex. geckodriver (for firefox) or chromedriver (for chrome).**
[Downloads](https://www.selenium.dev/downloads/)

# Creating project in IntelliJ

5. **Now when creating new project in intelliJ, select Maven, enter name, location and press Finish.**


Navigate to pom.xml and add dependencies for 'selenium-java'. Dependencies can be checked on [here](https://mvnrepository.com/artifact/org.seleniumhq.selenium)

6. **In src -> main -> java -> add new class. There set property for WebDriver:**


System.setProperty("webdriver.chrome.driver","C:\\your location for driver\\chromedriver.exe");

7. **Initialize WebDriver:**


WebDriver driver = new ChromeDriver();


<p align="center">
And you can start writing your tests. Good luck! :relaxed:
