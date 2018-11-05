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

