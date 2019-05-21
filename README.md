# Coinchanger
A solution to the coinchanger kata, where a change amount is entered, and it returns a list of the least amount of coins that add up to that amount. 

Example:

-Input: 18

-Output: [10, 5, 1, 1, 1]


# Setup Steps for Creating a New Project Using Java/Gradle/Junit/Intellij
First install [Gradle](https://gradle.org/install/) for building the project

Then install [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
  1. Create new project directory
  2. cd into project directory and run:
      ```
      $ gradle init
      ```
  3. Open project, and enter the following into build.gradle:
      ```
      apply plugin: 'java'
        repositories {
            mavenCentral()
        }
        dependencies {
            testCompile 'junit:junit:4.12'
        }
        test {
            useJUnit()
            maxHeapSize = '1G'
        }
      ```
      
   4. Create project directory for source code and tests (src folder lives in root directory):
      
      ```
        └── src
            ├── main
            │   └── java
            │       ├── MyClass.java
            └── test
                └── java
                    └── MyClassTest.java
        ```
5. Setup SDK: open `MyClass.java` and follow prompt to select preferred SDK
6. Add junit external libray:
    ```
    └── File
        └──Project Structure 
            └── Libraries
                └── click '+' button
                    └── From maven
                        └── enter junit:junit:4.12 and click 'ok'
                            └── click 'ok' to add to modules
    ```
  7. Start testing!