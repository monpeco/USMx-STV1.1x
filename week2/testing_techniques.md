#### Welcome to Week 2

https://youtu.be/456pKIN-HTc

#### Weekly Learning Objectives and Goals

1. Create different types of test cases


---

#### Introduction

There are many different levels and types of tests as well as different techniques for each. They all have different goals, criteria, and scope and we will discuss a number of them in this lecture. As you remember from previous lecture, testing is done to find errors (defects) and to check that the system meets user’s requirements and that it works as designed.  However, testing activities start long before any code may be written.

Here is an outline of Software Development Life Cycle (SDLC) and ideally what testing activities should be worked on in that stage:


##### Requirements analysis and specification

·         Review requirements for correctness, completeness, and testability.

·         Start test plans to include: testing criteria, what software and hardware is needed, outline testing strategy, and create test scenarios.

##### System and software design
·         Verify that design meets requirements

·         Develop coverage criteria (e.g. code coverage and data coverage)

·         Develop acceptance test plan

·         Design usability test

##### Implementation
·         Create and execute unit test cases

·         Create automatic test cases (e.g. Junit) and test data

·         Review/Inspect source code

##### Integration
·         Once unit test is complete and code reaches acceptable stability, multi-component testing can start

·         Different types of testing can be performed at this point to include function, stress, scalability, and performance

·         Create and add to automated tests

·         Update regression tests

##### System deployment
·         Perform System Test – test real-life user scenarios, validate requirements (functional and non-functional)

·         Perform User Acceptance Test – once system test is complete, test to ensure that customer criteria/needs are met (often customers agree to be involved in this exercise – Alpha and Beta testing)

·         Perform Usability Test – test user interface and again often customers are involved to help in testing

##### Operation and maintenance
·         Manage and handle user problems and new requirements

·         Execute regression testing for any code and system changes

---

#### White-box vs black-box testing

One way of looking at any system is as a box which has inputs (what goes into the box) and outputs (what comes out of the box). A “white-box” or “clear-box” mean that one can see the internals of the system, or in other words, see inside the box. A “black-box” means that one cannot see the internals of the system or inside the box.

So a test or a testing activity that is considered “white-box” is one where the tester has access to the code and uses that knowledge to write tests or conduct the testing activity. For example, a code inspection where developers analyze the code by hand and look for errors would be considered a “white-box” activity.  They have access to the code and they are looking at it line by line to make sure that it is written correctly.

Another example of “white-box” test is unit test where developers write test cases, often automated, to verify each unit of code such as a function, method, or class. The test cases are geared toward the actual code and to make sure that each unit works as it is supposed to meets the design.

A test or a testing activity that is considered “black-box” on the other hand, only checks that given some input, there is correct output. An example of such a test is User Acceptance Testing where the person doing the testing has no access to the code, is not concerned how the system was implemented, but rather is testing that the system meets the user requirements and works as expected for the typical input that the system needs to work with.


---

#### Look at Example

Let’s use a simple program as an example in this section.  Let’s assume that we are building a small program that employees at a company can use to determine how much their insurance will cost.  Here are the requirements for the application.

Requirement #1 An employee must have health insurance to get vision or dental insurance.

Requirement #2 There are two types of health insurance: HMO costs $100 a month; PPO costs $150 a month.

Requirement #3 Vision costs $25 a month

Requirement #4 Dental costs $20 a month

The user interface might look like this. The user selects a health insurance plan and might check boxes to get vision or dental insurance.  Then the user clicks the Calculate button.  The calculated cost appears in the text field beside the label “Total Cost”.

A Black-Box test suite might look something like this.  For simplicity only Execution Steps and Expected Behavior is shown.

| Execution Steps | Expected Behavior |
|-----------------|-------------------|
| HMO, check Vision, click Calculate | $125 is the output |
| PPO, check Dental, click Calculate | $170 is the output |

I might really like this test suite.  I test HMO and PPO.  I test Vision and non-Vision.  I test Dental and non-Dental.  It is perfect, right? 

But there are a few of ways that the calculation can be coded.  Here is one of them.  Line numbers have been added to the far left to make it easy to reference sections of the code. 

Code Example 1

```java
 2    {
 3        float tempCalculation;     // create a variable to hold total
 4        
 5        if (health.equals("HMO"))  // if HMO is select
 6            tempCalculation = 100.0f;   // start with $100 insurance total
 7        else                       // if it isn't HMO, it must be PPO
 8           tempCalculation = 150.0f;   // start with $150 insurance total
 9        
10        if (vision == true)        // if vision is selected
11           tempCalculation = tempCalculation + 25.0f;  // add $25 to total
12        
13        if (dental == true)        // if dental is selected
14            tempCalculation = tempCalculation + 20.0f;  // add $20 to total
15        
16        return tempCalculation;   // return variable that holds the total
17    }
```

Code Example 2

```java
 1   public float calculateInsurance(String health, boolean vision, boolean dental)
 2    {
 3        float tempCalculation;     // create a variable to hold total
 4        
 5        if (health.equals("HMO"))  // if HMO is select
 6        {
 7            tempCalculation = 100.0f;   // start with $100 insurance total
 8            if (vision == true)        // if vision is selected
 9                tempCalculation = tempCalculation + 25.0f;  // add $25 to total
10        
11            if (dental == true)        // if dental is selected
12                tempCalculation = tempCalculation + 20.0f;  // add $20 to total
13        }
14        else                       // if it isn't HMO, it must be PPO
15        {
16            tempCalculation = 150.0f;   // start with $150 insurance total
17            if (vision == true)        // if vision is selected
18                tempCalculation = tempCalculation + 25.0f;  // add $25 to total
19        
20            if (dental == true)        // if dental is selected
21                tempCalculation = tempCalculation + 20.0f;  // add $20 to total
22        }
23
24        return tempCalculation;   // return variable that holds the total
25    }
```

---

#### Coverage testing

Test coverage is a measurement of how much testing was done on some coverage criteria. For example, if our coverage criterion is to execute every statement in the code (100% statement code coverage) then we can measure what percentage of statements a specific set of tests exercises when executed.  What the coverage goal will be for a particular product is typically established during the design stage.

Having coverage criteria allows the tester to use a systematic approach to creation of tests where there are less redundant tests and broader range of tests. That in turn helps in improving the quality of testing and ultimately the quality of the product. When the coverage measurement is low, the tester can add test case sand find areas that have not been tested yet. Once the level and type of coverage is determined testers normally look for the smallest set of test cases to achieve the desired coverage. 

There are a number of typical coverage criteria that are commonly used such as: 1) Code Coverage, 2) Data Coverage, and 3) Model Based Coverages.  These are described in more detail in the next units.


---

#### Coverage Testing - Code Coverage

Typically a product should have tests to achieve 100% code coverage especially when the product is written using languages that have code coverage tools and frameworks for automation.  

Different criteria that can be used:

·         Statement coverage– testing statement (line) of executable code

·         Path coverage – testing paths in code

·         Branch coverage – testing logical branches in code (all possible False & True combinations for the whole condition)

So 100% complete code coverage test set may achieve 100% of all of the above or some percentage of each. What is important to understand is that having 100% statement coverage does not mean that one has 100% branch statement or path coverage. Typically 100% code coverage will at minimum try to achieve 100% statement coverage where every line of code is executed.

Now think back to our Insurance Cost Calculator example.  If the developers coded the application using Code Example 2, how much statement coverage do I have?  Lines 12 and 18 are never executed by the test suite.  There could be defects in there!



---

#### Coverage Testing - Data Coverage

Unlike code coverage where the code structures are analyzed such as statements, branches, and paths, in data coverage the person writing tests analyzes the data used in the program. In general that means testing representative samples of good and bad data (user input and what program may generate) to make sure that the code handles the data correctly.

You cannot reach 100% data coverage because that would mean having tests for every possible input value. For example, for an integer you would need a test for every value between lowest possible integer and highest possible integer (-2,147,483,648 to 2,147,483,647). That is impossible, too costly, and not necessary for efficient test. But it also means that judgement calls have to be made what data to test with and that means that some important tests can be missed. However, there are typical minimum criteria what to test for that include:

- Test boundary condition – maximum value, minimum value, 0, positive value, and negative value as applies for that data type
- Test typical data values – most common data based on domain and customer scenarios (often get from customer)
- Test pre- and post- conditions – looking at code check assumptions made such as some data being greater than 0 (division by zero)
- Test bad data:
o   Illegal data values
o   No data
o   Too little or too much data
o   Uninitialized variables

---

#### Coverage Testing - Model Based Coverages

Model-Driven Test Design (MDTD) uses a model of the system to derive test cases using different coverage techniques. This approach lets a single test designer do the math to generate the test cases while traditional testers and programmers can do the typical test activities such as:

Find values
Automate the tests
Run the tests
Evaluate the tests
In MDT you define a model of the software and then find ways to cover it (test coverage) considering test requirements (RT) and test criterion (TC). Test Requirements define the specific things that must be satisfied or covered during the testing and test criterion is a collection of rules and a process that define test requirements. There are four basic ways to model a system: graphs, logical expressions, input domain characteristic, and syntactic structure.

##### Covering graphs:

Graphs can come from many sources such as control flow graphs, design structure, finite state machine (FSMs) and statecharts, and use cases. Using graphs you can represent the system structurally, its data flow (variable definition and use), and its control flow (if-statement, case statement, while loop, etc.). In fact, in order to test code coverage using path coverage, graphs are often used to determine the test coverage.

Tests usually are intended to “cover” the graph in some way so for example one may:

Cover all reachable nodes or paths
Cover all edge-pair
Cover all definition and use pairs
Covering Logic Expressions

Logic expressions show up in many situations and in fact, covering logic expressions is required by the US Federal Aviation Administration for safety critical software. Just like graphs, logical expressions can come from many sources to include decisions in programs, FSMs and statecharts, and requirements. Tests are intended to choose some subset of the total number of truth assignments to the expressions and cover predicates and clauses which evaluate to true or false. Testing all combinations (truth table for expression) is not possible for large and complicated expressions so different coverage criteria are used to test adequately but efficiently.

So for example, we may want to reach 100% clause coverage in the code. That means we would test each clause in the condition for True and False combination. So for example if we had the following condition   if (b < 5 || b > 10)  we would want to have one test when the first clause (b < 5) is True and then another test where it is False and then the same for clause (b > 10).

So let’s look at some test data for this example. To make the first clause True we could run the test where b=4. Then for the second clause True we could have b=11. So that is simple. But now for the false evaluation it is more interesting. If we make b any number between 5 and 10 inclusively such as b=6 then my first clause is false and my second clause is false as well. In fact, there is no data that can be used for b where one clause is false and the other is true. So I only need three test cases to meet the clause coverage for this particular condition. What that means is that when selecting data for the tests to reach certain criteria, you do not just blindly select data for each T/F combination for the clause. If you do, you may end up with many redundant tests that add nothing to the coverage or testing effort. And that is a waste of time in developing these redundant tests and running them and so ultimately it increasing the cost unnecessarily.

##### Covering Input Domains

The input domain to a program contains all the possible inputs to that program. For even small programs, the input domain is so large that it might as well be infinite. This is the same thing as trying to reach 100% data coverage. So testing is fundamentally about choosing finite sets of values from the input domain.

Input parameters define the scope of the input domain and they include parameters to a method, data read from a file, global variables, and user level inputs. Domain for each input parameter is partitioned into regions and at least one value is chosen from each region.

There are two approaches to Input Domain Modeling: Interface-based approach and Functionality-based approach. In interface-based approach you can develop characteristics directly from individual input parameters. This makes it simple to apply and can be partially automated in some situations. In functionality-based approach you develop characteristics from a behavioral view of the program under test. So that makes it harder to develop and requires more design effort. However, it may result in better tests or fewer tests that are as effective.

Using the Syntax to Generate Tests

Lots of software artifacts follow strict syntax rules and the syntax is often expressed as a grammar in a language such as BNF. Syntactic descriptions can come from many sources to include:

##### Programs
Integration elements
Design documents
Input descriptions
Then tests are created with two general goals: to cover the syntax in some way and to violate the syntax (invalid tests).

---

#### Unit Test (UT)

Unit testing is done during the implementation (ie coding) phase either at the same time the code is developed or if using test-driven development (TDD) before the implementation starts. In either case tests are defined and written to test the smallest unit of code usually a function, method or class. Each unit is tested independently and the tests together form a suite of tests that can be used for regression testing as the code is changed or added to.

Typically UT is done by the developer writing the code but in agile development approach, developer/tester may work in pairs. The goal of unit test is to find code errors (defects) and to make sure that the units meet requirements and designs. Since the tester has access to the code and in fact is defining tests based on how the code is written, UT is white-box testing technique.

The testing criteria used for unit test are usually to reach 100% code coverage and reasonable data coverage. Depending on the size of the software you may not be able to test everything but typically if done concurrently while implementing and if automating the test cases, it is often done.

Unit tests are typically very small and independent and they run quickly and assert the behavior of a particular functionality or an object. They also help in designing and refactoring complex code as they force programmers to break down the logic of their application in to manageable chunks (units).

So what would be a unit type of test? For example you could have a method that sums two numbers together and it might be tested by checking that when first number holding value 1 is added to second number holding value 2 returns the addition result of 3. While this might sound like a trivial test, unit tests are useful for debugging code and especially for complex code that changes frequently. A developer may make a change that they think does not affect the output of a method, but a well written unit test will prove that in fact the change they made has not broken anything.

Imagine having 10 classes with on average 20 methods in each. Each method may have branches with different code executing depending on the input provided. Now imagine you had to make a change in the code across 3 classes that impact a number of other classes that call the methods you have changed. So how can you be reasonably sure that what you have changed does not break other code? You make a reasonable analysis of the code and its design before you make changes. However, the more code you have to look at, the greater the chances that you may miss something. That is where good automated unit test cases really help. Once you make your changes, you run all the unit tests for that whole component where you made the change. If something fails you will know you have an issue with your change. If nothing fails you may still have an error but if your unit test suite is thorough, you can have a much higher confidence level that your change did not break anything and especially something obvious. There is nothing worse than fixing a relatively small error and introducing another error.

Let’s look at an example of defining unit test cases for statement code coverage. Below we have a method written in Java code called computeSalesTotal that takes two parameters: the total sales of a purchase and a sales tax rate. The method takes two parameters of type integer and if the value of the parameter is less than 0, it is supposed to throw an exception. Otherwise it should print a value of the parameter. The numbers on the left are not part of the code but line numbers to help discuss the coverage.

```java
1  public void computeSalesTotal(float totalSales, float salesTaxRate)
2  { 
3        if (salesTaxRate < 0.0)
4        {
5             System.out.println("Invalid sales tax rate");
6        } else {
7             System.out.println("Total including sale tax is " + totalSale * (1.0 + salesTaxRate)); 
8       }
```

The method has 8 lines of code but there are only 3 executable statements in this code on lines 3, 5, and 7. Those are the lines we need to concentrate on to reach 100% statement coverage. So how many tests do you think you need? The answer is 2. You need a test where the sales tax rate is invalid and then a test where the sales tax is valid (0 or positive value).

The tests may be defined as follows:

> Test Case 1
Test case name:  testSalesTotalPositiveArg
Method being tested:   computeSalesTotal(float totalSales, float salesTaxRate)
Short Description:  Test that when salesTaxRate has positive value, it prints that total value to the console
Input Data to constructor and/or method you are testing:  totalSales = 89.0, salesTaxRate = 0.06
Expected Results:  "Total including sale tax is 94.34" is printed to the console

> Test Case 2
Test case name:  testSalesTotalNegativeArg
Method being tested:   computeSalesTotal(float totalSales, float salesTaxRate)
Short Description:  Test that when salesTaxRate has negative value
Input Data to constructor and/or method you are testing:  totalSales = 10.0, salesTaxRate = -0.2
Expected Results:  Prints message “Invalid sales tax rate”

 So our first test case calls the computeSalesTotal passing it 89.0 and 0.06 as parameters.  So the local variables totalSales gets the value of 89 and salesTaxRate gets the value of 0.06 through parameters in line number 1.  Then it executes line number 3 where the condition (salesTaxRate < 0.0) is evaluated to false. So it skips line numbers 4 and 5 and executes the print statement on line number 7 and the method ends. So this test case tests line numbers 3 and 7.

Our second test case calls the computeSalesTotal passing it 10 for totalSales and -0.2 for salesTaxRate as parameters.  So the local variables totalSales gets the value of 10  and salesTaxRate gets the value of -0.2 in line number 1. Then it executes line number 3 where the condition (salesTaxRate < 0.0) is evaluated to true. So it executes the print statement in line number 5 and skips the rest of the lines. This test case tests line numbers 3 and 5.

Thus together, our two test cases achieve 100% code coverage for this method and test lines numbers 3, 5, and 7.

---

#### Functional (Component) Test

Unlike unit test where you are testing small pieces of code (methods or functions) individually, for function test you want to test the whole program. You conduct function test by running the program and providing it different inputs to test different functionality and scenarios and to check that the outputs match the user requirements and the system design.

Some of the test may be similar as far as the functionality as the unit test but you are driving the test through the whole program path and not directly through the method/function as you did in unit test. Therefore function test is usually a black-box test where you are only concerned with inputs and outputs and not how the functionality was implemented internally.

Function tests can also be automated and in fact should be automated as much as possible but the frameworks are much more complex than what is used in unit test.  So what should you test in Function Test? When you define function tests, you need to test all inputs to the programs and all the features and functionality. For example if I was testing Microsoft Word application, I would need to design function tests for:

* Opening a blank file, all types of files that are allowed, and types that are not allowed
* Test every pull down menu and every option in that menu
* Test every option of every feature
* Test saving the file and all options of it
* Test having multiple files open
* Test exiting with unsaved changed and saved changes
* Test help options

And this is just a start. Obviously Word has tons of features.
Let’s look at another example of defining function test cases. Most of you are familiar with Microsoft Calculator application, which is a much smaller application than Microsoft Word. So it’s not so much to test right? Well let’s see…

This image is the basic Microsoft Calculator application.

First you would need to test every menu option:

·         At least one test case per every option in View

·         At least one test case per every option in Edit

·         At least one test case per every option in Help

Then you would want to test all operations:

·         Addition

·         Subtraction

·         Division

·         Multiplication

·         Percentage

·         Fraction

·         All the M functions

·         Etc.

Then you would want to create more complicated test cases by using multiple operations together for different features. Most likely you would get a list of complicated formulas and make sure that the calculator gives the correct answer. And lastly you would test all the boundary and limits of what the calculator is supposed to handle such as highest number than can be typed in or calculated. Not so simple application after all!

Your actual function test case may look something like this:

> Test Case: AddFunction-R1.3
V
> Requirements:   R1.3 Add two positive numbers
> 
> Prerequisites:  None
> 
> Steps: 
> 
> Start calculator program
> Check that display has 0
> Click button with number 1 and check that displays shows 1
> Click button with add sign and check that displays shows above 1 the current operation “1 +”
> Click button with number 2 and check that displays now shows 2
> Click button with equals sign and check that the display now shows 3
> Input:  1 + 2
> 
> Expected output: display show the result of addition as 3
> 
> Assumptions: None

---

#### Concluding Remarks

We have covered a lot of material this week.  As you can see there are many different of types of testing and test cases.  So, the question naturally arises, what types of testing and test case should be used?  Are some better than others? Luckily for us a lot of research has gone into answering these questions. Research shows that in most cases using a variety of test types with the testing resources that you have produces the best results. 

Next week we are going to look at how you can develop a unit test and automate the execution of it.  So, once you develop a test suite you can execute is as many times as you want to without retyping all of the values in.



