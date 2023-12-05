# SeleniumWithCucumber

This is a framework using Selenium + Java + Maven + JUnit + Cucumber, following the POM and PageFactory design patterns.

I applied BDD using Cucumber and the Gherkin syntax to make scenarios easy to understand for the entire team. This feature is about a simple login functionality and contains one valid case with valid credentials, as well as three invalid cases with three sets of invalid credentials using a datatable. All the cases have their own assertions.

After running all the cases, the program will generate an HTML report like this:

![image](https://github.com/EmmaRodR/Selenium-Cucumber/assets/109427887/b2207f95-172f-4594-b832-0b7e0a9b8f1b)




----------------------------------
Content of the repository:

src/test/java/features/test.feature - This file contains the feature scenarios with their  
                                      correspondent steps and definitions using Gherkin with a 
                                      more readeable sintax for all members of IT team.

src/test/java/pages/ - This folder contain the pages with the elements and methods of the page using POM and Page Factory design patters.

src/test/runner/ - This folder contains the runner file that execute all the features and his steps saved in the test.feature file. 
                   Also contains other options to set like the creation of reports.

src/test/java/seleniumgluecode/ - This folder contains the Hooks file that initialize any instance of the web driver in each test. 
                                  Also contains the Test  file that contains the methods that are linked to each feature steps in the test.feature file.

