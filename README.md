#Project3Comp373: Bridge and Observer Pattern Implementations

##Project Summary
The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently". The bridge pattern uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes. 

In our example we have created an interface for the shirt colors, and an abstract class for the size of the shirt. This allows the shirts to be different colors and sizes.


The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. 

In this scenario, we are maintaining a list of subscribers and notifying them when a youtuber they are subscribed to uploads a new video. We implemented one well known youtuber example called "Bestdressed", and one anonymous youtuber example. For the anonymous youtuber example, a subscriber will be notified that someone in their subscriptions uploaded a new video.

##How to Run
To run this project, please use Eclipse and add the project to a new workspace. Please add JRE 1.8 and JUnit 4 to your Java Build Path and configure the Java Compiler to match to ensure that everything runs properly.

To run either pattern, please right click on the pattern you would like to run, and then select "Run as Java Application"

For any questions, please reach out to the project's collaborators. 




##Tests

All testing was done using JUnit 4. The tests are separated by pattern, meaning that both the bridge and observer patterns have their own tests in their respective locations under similar file names, TestAll.java. 

The tests for the bridge pattern assert to see if the new object created is an instance of the interface that it was supposed to utilize, to ensure that you are able to create an instance of every single combination of TShirts available in this program. 

The tests created for the observer pattern assert to see if they are able to subscribe to a youtuber. If they are able to subscribe to a youtuber, they will automatically be able to be notified of their video upload. Testing to see if a subscriber can register to be notified of anonymous uploads was done as well.

To run TestAll.java for either pattern, please right click on TestAll as select "Run As..." and then select "JUnit Test".



If you have any questions about running any of the tests, please reach out to the project's collaborators. 


##UML diagram 
![UML DIAGRAM](https://github.com/alexandratcrane/Project3Comp373/blob/master/373Project3UML.pdf)
