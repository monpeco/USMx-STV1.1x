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

