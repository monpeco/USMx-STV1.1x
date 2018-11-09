#### Weekly Learning Objectives and Goals

1. Automate test cases using JUnit

#### Why Automate Test Cases?

When you automate test cases it means that you have code whether a script or some code using a framework 
(e.g. JUnit) which allows you to run the test cases against the code/system you want to test. In the long 
run it reduced cost because you write the test cases once and can rerun them multiple times. Depending on 
the tests, the test may also run much quicker than if the testing was conducted manually.

You want to automate everything that has to be re-tested many times and especially those tests that are 
very repetitive. For example, you may have a test that runs the same scenario except for one input value. 
Doing this repetitive task manually would be very cumbersome and costly but if you can automate the test 
case where it tests in a loop for every possible input you want to use, it saves a lot of time and effort.

Some development and testing environments rely heavily on automation. Such as for example, agile and scrum 
environments where code is added to the product under development a few times a day and all developers and 
testers need to use the newest code to get the last functionality updates and/or to pick up fixes. The 
updated code is called a driver. 

This approach allows for concurrent development and continuous integration. This way there is less down time 
waiting for a fix. In order for tens or hundreds of developers to be able to update the code so often and 
use it confidently however, the driver has to be stable. And in order for it to be stable, there needs to be 
testing done where the old code is checked that it has not been broken and the new code needs basic testing 
that the functionality works. To do this test manually would take too long and would not allow for multiple 
drivers a day. But if the tests are automated, every time a new driver is built, it automatically runs all 
the automated tests and if there are failures, the driver gets flagged as unusable. All this happens 
automatically so that no one picks up the “broken” driver. Typically someone gets an email and drives the 
investigation of what new code broke something and who needs to fix it. Once that fix is integrated into the 
code, a new driver is built once again re-running all the automated test cases. If all tests pass, the 
driver is automatically made available to all developers and testers. 

Another example of an environment where automation is used heavily is the test-driven development (TDD). In 
this approach to development, the tests are defined and written first using an automation framework and as 
code is developed, the developer runs his code against the test cases. The idea is that the code only needs 
to have what it takes to pass the tests which are defined from requirements specification. 

If a test case fails, the developer needs to look at his/her code to determine if his code breaks a 
requirement or if a test case was defined or implemented incorrectly.  The developer re-runs the test cases 
as he completes some functional piece and so can fix it right away if there is a problem. As opposed to 
writing all his code and then having testing on it where a defect may be discovered, which would require a 
significant re-write of the code. In addition, the test cases can be written in parallel with the 
development because as developer concentrates on some functionality, the tester can already start writing 
test cases for the next functionality. The developer then picks up the new test cases and runs them as he 
integrates the next part of the product. Again though, in order to allow this re-running of tests there 
have to be automated tests.

---

#### Cost Involved with Automation

There are some obvious and less obvious costs involved with automation of test cases. The first obvious 
cost is writing the code (maybe even a framework) to implement the test cases. Depending on the type of 
testing that is being automated it may be quick or take a relatively long time. 

For example, unit tests are usually quick and fairly easy to automate because the tests are only testing 
a single unit of code and can be written as the code is being developed. However function tests are a lot 
more involved because they are testing a path/scenario for the whole product. In order to run a function 
test case, you must have the whole product working, although it does not have to have all the functionality 
yet.

As a result, unit tests are very often automated but many of the function tests are not. In fact, it is 
not unusual for the testing team to conduct a manual or partially manual function test and only when that 
is done to start working on the automation of tests that can be used as the fixes are integrated and new 
functionality added. The reason is that they can complete the manual tests faster than writing the 
automation.

Something to remember when discussing costs, is that automated test cases are code too which means that 
they need to be defined, implemented, reviewed, and tested just like product code. That process takes 
some time and then the tests need to be stored in a testing repository that allow a good version control 
and access for the testers. That again has costs involved.

What is less obvious and often forgotten in the test budgets are the costs associated with updating the 
test cases, as fixes are integrated and new or changed functionality is added. Ideally you would not want 
to constantly have to change the test cases because once again that cost may negate the benefit of 
automation.


---

#### What to Automate

Not everything can be automated. Some products or programming languages do not have a framework for automation and so writing the framework first may be too costly. Some systems or features of a system may change so often that, as mentioned in previous section, the cost of updating the tests would negate the cost of having automation in the first place.

And in some cases, especially when testing a web interface, one has to deal with network and internet speed where the test would have to built-in delays not to fail unnecessarily, in which case the automated tests may actually take longer than doing the tests manually.

So how do you determine if you should automate something? There are certain tasks, tests, and situation where automation is the most beneficial. These include:

·         Unit test cases which are easily coded and easily executed within a testing framework

·         Repetitive tests that need to be conducted often such as for every new driver build (used as regression testing)

·         Tests which are tedious and/or prone to human error such as checking numbers or other detailed data (e.g. decimal point to 10 digits)

·         Tests that have to be run many times but with different data or on different hardware/software

·         Tests that cannot be done manually such as simulating 100 concurrent users on the system or input of 500 pieces of data

·         Tests that would take a lot of time and effort to do manually but can be automated and re-run easier

---

#### JUnit

JUnit as the name implies is automation testing framework for unit test and for Java programming language. However, the framework can also be used for function tests where the testing is driven through the main method.  JUnit requires that you have the JDK installed on your computer and while it can be downloaded and run directly using Java from command line, it is also included in many common Integrated Development Environment (IDE) products such as Eclipse and NetBeans.

When you want to test a particular method in your Java code, you would create a Java class usually named TestX or XTest where X is the name of the class you are testing. Then you would have a number of test methods to check specific behaviors of the method given different inputs.

So let’s say we have a class called Example and it has a method with a single parameter where if the value passed is 0 it returns a String “invalid” and otherwise it returns “valid”. The Java code would be:


```java
public String checkValidity(int num)
{
    if (num == 0)
        return "invalid";
    else
        return "valid";
}

```

So our first automated test method may want to check that when checkValidity method gets a 0 it does in fact return the string “invalid”.  So we need to create an instance of the class Example, invoke its method checkValidity, and then compare if what the method returned is “invalid” as we expect. The code would look like this:


```java
import static org.junit.Assert.*;
import org.junit.Test;

public class TestExample {
    @Test
    public void testCheckValidityInvalid() {
        Example ex = new Example();    // creates an instance of class Example
        String result = ex.checkValidity(0);    // calls checkValidity with value 0
                                                // and saves returned value in String result
        assertEquals("invalid", result);    // checks that result has the value "invalid"
    }
}
```

Notice that to check that the values are the same, we use the JUnit’s assertEquals method and that is why we need the two imports on top. The assertEquals method compares the two values in its parameters and if they are the same, the test case passes. If they are different, the test case fails. 

I would also get a message of why the test case failed. So if for example the return value in checkValidity was “not valid” and it was supposed to be “invalid”.

So assertEquals tells me what was expected versus what is there based on the parameters we passed in our test case.

The JUnit comes with many different assertions that can be used. All of the assertion methods evaluate to either true or false based on what the assert is supposed to do and what parameter values are passed. When the assertion evaluates to true, the test case passes and when it evaluates to false, it fails. The failures are recorded. These assert methods allow for testing assumptions that are made by the test case on how the code is supposed to behave and to generate a report of passes and failures.  In addition to assertEquals, other commonly used asserts include:

* assertNotNull - Asserts that an object isn't null
* assertNull - Asserts that an object is null
* assertSame - Asserts that two objects refer to the same object
* assertNotSame - Asserts that two objects do not refer to the same object
* assertTrue - Asserts that a condition is true
* assertFalse - Asserts that a condition is false

Assert methods usually allow a message as the first parameter that is recorded when the test fails and it allows the tester to provide more information about the failure. For example:

assertSame("The variables should point to the same object", ex, ex2);  

would have assertion error:   

“The variables should point to the same object expected same:<Example@1010be6> was not:<Example@5f4c2e>”

The list of assertions along with the descriptions can be found at:

http://junit.sourceforge.net/javadoc/org/junit/Assert.html

The naming convention for test methods is to start with “test” and then have meaningful descriptive words to indicate what the test is testing. Notice how my test above is called “testCheckValidityInvalid”. So you know it is a test case “test”, it is testing method “checkValidity”, and it is testing for the value “invalid”.  In addition to the meaningful name you should also have good comments describing what the test is checking and comments in the test method on what some of the key statements are doing. This way when you or someone else looks at the test case later, there is no confusion what the test is doing and why.

The last thing to remember is that your test cases especially for unit test should be straight forward, well-documented, and only test a single input or condition and so only have a single assert per test method. If you have multiple asserts and the first one fails, the test fails and the remaining asserts are not executed. As a result you may have a misleading view of how many defects there actually are in the source code.

Note: Check out the Tutorial code examples and videos that walk you through writing the tests.



---

#### Other Testing Frameworks


In this week we are concentrating on automating JUnit tests but JUnit is not the only framework for testing automation. There are many different testing frameworks and unit testing frameworks in particular for different languages. For example:

·         Python – PYUnit is based on Java’s JUnit framework so it has the similar look and feel to it

·         C# - NUnit is open source framework for all .NET languages. Originally it was ported from JUnit but was then re-written

·         JavaScript – QUnit is a stand-alone framework that can test any JavaScript code

·         Perl  - PerlUnitis open source framework but it has not been updated for a long time

