#### What is Software Testing


Software Testing is a process where the software is evaluated to determine that it meets the user needs (**validation**) and that the process to build the software was followed correctly (**verification**).  Put another way, it ensures that "you built the right thing" (validation) and ensures that "you built it right" (verification).  

 Testing also makes sure that the product has appropriate quality for the specific product being built based on some criteria whether established local to the team, and/or product criteria, and/or organization criteria, and/or industry standards such as International Organization for Standardization (ISO) standards (an independent, non-governmental international organization).

 Some standards and models to help with product quality include:

·         IEEE Std 1012-2012 IEEE Standard for System and Software Verification and Validation

·         SEI Capability Maturity Model (CMM)

·         ISO SPICE

·         ISO 12207

·         European Cooperation for Space Standardization (ECSS)

The criteria being used will differ between organizations and between products. For example, a safety-critical system (e.g. flight system) where a failure may cause injury or death of the user will have different standards/criteria for testing and quality than a single user application which can be restarted and keeps working (e.g. word processing program).

There are a number of testing activities that are performed throughout the development life cycle to include inspection and analysis of the user requirements;  test planning to include test system requirements and setup, test tasks, schedules, test scope, and division of works across teams; test case design and implementation;  test case inspection and analysis; and test execution and documentation.

---

#### Why is Testing Important

While no amount of testing eliminates all errors in the code, testing is critical to make sure that the software has appropriate quality and works correctly. Insufficient testing and the resulting errors and failures of the product, can have significant impacts on the business.

For example, when the product is unstable and breaks easily or frequently, new potential buyers may decide to wait for the next release of the product or look for a different product all together. In either case the business will suffer significant financial losses as well as a loss in their company’s reputation, which in turn may impact the sale of other products.

When the product causes an injury or loss of life of a user, the impacts are even greater because the company then may be sued for negligence, resulting in more financial and reputation loss.

In addition, the errors and failures that the users experience are reported to the company’s service department, resulting in loss of time and money in order to fix the issues and distribute the fixes to the public.

In fact, NIST report Tassey (2002) concluded that inadequate software testing costs the US alone between $22 and $59 billion annually and that better approaches could cut this amount in half. The later in the development cycle an error is found, the more expensive it is to fix, as discussed in the next section.

---

#### Cost of Late Testing

It is a well-known fact that defects are more expensive to fix in the later stages of development and once the product is already in the field. Sometimes the defect is not fixed at all because of the costs involved. The defect may be documented with a workaround or a customer may have to wait for the next release of the system.

Even without knowing all the statistics and costs involved, one can see that finding defects earlier in the development cycle will be more cost effective. For example, when a defect is found during the user requirements analysis, all it takes to fix it is to update the requirements document. However, if that same defect is missed until the whole product is developed, fixing it may require a change in the design, a rewrite of significant amount of code, customer re-approvals, and re-testing of the product once the fixes are complete.  The more complex and more expensive is the product, the greater is the cost of finding defects late.

How expensive is finding the defects late in the development cycle will differ from product to product and company to company. For example, IBM mainframe z/OS system defect that was found by a customer in the field was estimated to cost at minimum 10K per defect. And we are not talking about a complicated defect, any defect even a one line change in the code would cost that much to fix.

Stecklein, J. et al. (2004) conducted a study for NASA type of products (e.g. spacecraft or satellite) and found that if finding an error in requirements phase costs 1 unit then it increases so significantly that the same defect if undetected until operations phase can cost to fix anywhere from 29 units to more than 1,500 units. So if a unit costs $1000 then at requirements phase a defect would cost a $1,000 to fix while in the operations it can cost from $29,000 to $150,000 to fix.

So what is the bottom line message? Early testing can save significant money for the company!

---

#### Examples of Costly and Sometimes Deadly Software Failures

There are a number of famous system failures with tragic consequences that have been analyzed and studied in detail. Over time they have become the symbol for why proper software testing is so important and how little errors can have unexpected and tragic cost. They have also been extensively analyzed and many quality and testing standards and operating processes were developed to prevent future failures of this type. So let’s look at some of these failures:

Radiotherapy system Therac-25 – radiation therapy machine used for treating cancer.  It used a new approach and it was supposed to be totally safe where a patient could not get too much radiation. As it turned out however, there were six accidental releases of radiation (1985-1987) killing three patients. So what went wrong? Hardware safe-guards were removed in this improved model and the software safeguards did not always work because of a race condition in the code. Good code determines what sequence of events should happen for the proper outcome but when you have a race condition defect, the timing and the sequence is not controlled where which outcome happens will depend on which thread (piece of code) executes first.  The actual code error was small. There was a counter in a routine which would often overflow [overflow is when a program attempts to put a value into a variable that is too large for the variable to hold] and if the machine’s operator inputted something when this happened, the software safeguard would fail. As a result the patient would get 100 times greater dosage of radiation then he should.

Patriot Missile – surface-to-air missile which was used to intercept Iraqi Scud missiles but failed to do so February 25, 1991 in Dhahran, Saudi Arabia resulting in 28 soldiers being killed. The direct reason for the failure was a system error where system’s internal clock was off by one-third of a second. This in turn affected how the system calculated distance (off by 600 meters) and so it lost track of the Scud that it initially correctly detected. So what was the error in the code? A timestamp that was to keep track of the time was not using a correct conversion to floating point number.

Ariane 5 rocket – the rocket was supposed to deliver four satellite systems to conduct research into the Earth’s magnetosphere on June 4, 1996 but it failed to achieve orbit and self-destructed, resulting in a financial loss of more than $370 million. The software defect was diagnosed to a problem in reused code where different flight path of Ariane 5, with much greater acceleration than before, caused data to be converted from 64-bit floating number to 16-bit signed integer causing an overflow and hardware exception. This particular variable did not have the checks for errors and so it was not protected.

Mars Climate Orbiter – a robotic space probe owned by NASA that was to study Mars and its climate and atmosphere. However, on September 23, 1999 it flew too close to mars and disintegrated. The orbiter cost $193 million. The direct cause of why the probe flew too close to Mars was due to two different modules in the software using different units for trajectory calculations. One unit used pounds-seconds and the other newton-seconds.  

In all of these examples, there were a number of factors that ultimately resulted in the tragedy. Having an error in the code is not the real problem as no software is 100% defect free. However, the software needs safeguards and checks to detect errors and handle them correctly. And for that you need good and thoughtful system design and adequate testing especially when previous versions of code are reused and changed. In all of these cases, software testing was lacking.

---

#### Suggested Readings

Jenkins, N. (2017). Software Testing Primer v2

#### Additional Online Resources

To learn more about ISO and their standards: http://www.iso.org/iso/home.html

#### References

Stecklein, J. et al. (2004). “Error Cost Escalation Through the Project Life Cycle”, NASA Johnson Space Center, retrieved from http://go.nasa.gov/2c2mgsH

NIST report, (2002). “The Economic Impacts of Inadequate Infrastructure for Software Testing”, retrieved from https://www.nist.gov/document-17633

---

#### What is a Test Case

A test case is a set of conditions and criteria that specify how a tester will determine if the system does what it is expected to do. While the specifics of a test case will differ based on the level and scope of the testing activity (to be covered in more detail next week) there are some common components that each test will have.

A single test case will test a single behavior of a system while a suite of test cases together will test a test scenario and/or higher scope functionality of a component or multiple components. For example, I might have the following: 

Test Scenario: Verify the ATM system withdrawal functionality (checking account) 

Test Case 1: Enter 0 for the amount to withdraw

Test Case 2: Enter amount greater than what is currently in the account

Test Case 3: Enter amount that is less than what is currently in the account with enough; left to pay ATM withdrawal fee

Test Case 4: Enter amount that is less than what is currently in the account but not enough left to pay ATM withdrawal fee

Test Case 5: Enter amount that is exactly what is currently in the account

As you case see by this example, the scenario is defining a particular end-to-end functionality of the system (what should be tested) while test cases test a specific behavior related to that functionality (how it should be tested). Together the test cases should test all aspects of that functionality to make sure it works under all conditions that can happen.

The tests are usually defined in a document called Test Plan which spells out all the details of the testing to be done, schedules and milestones, responsibilities, testing systems and installation and setup, and the list of test cases to be executed.

Test cases can be manual where a tester follows conditions and steps by hand or automated where a test is written as a program to run against the system. Usually both types of tests exist and are done for a particular system. Regardless if manual or automated however, tests are usually first defined in a document and often have to be approved by developers and/or testers. Automated tests may have all the documentation in the code implementing the test case and in the comments. 

---

#### Format and Fields for a Test Case

There is no single format used by everyone for test cases. A lot depends on the level of the test (e.g. functional test versus usability test), the type of product/system being tested, and the team and/or organization’s standard practices.  Some typical formats and storage of test cases include: spreadsheet, document table, database, and code/test repository records.

There is however, common information that all tests will have as they are defined and if the document serves as the test execution record, then also the fields for keeping the results. The fields are as follows: 

**Unique Test Case name and/or ID**: Each test case needs an identifier to refer back to it in a report or defect and if automated to map it to the implementation code. Some tests will have both an id and a meaningful name which is derived from the requirement or the functionality being tested.

**Test Scenario and test summary or description**: This description should specify what behavior/functionality will be tested by this test case. It should be specific but brief.

**Pre-requisites or setup**: What needs to be setup first, such as previous input or commands to the system to execute this test case.

**Test data or inputs**: Data to be used for this test case such as values of what is typed in or what is loaded from a file.

**Execution Steps**: The steps that have to be done against the system to test the behavior for this test case. The steps should be detailed, accurate, and correct. Another tester reading the test case should be able to follow the steps without needing to analyze requirements or design documents.

**Expected behavior**: This is the description of what is expected to happen and the final result of following the above steps.

**Assumptions**: Any assumptions that are made about the system or the test case. For example, data dependency or other test case dependency.

**Actual results**: Description of what actually happened when the test case was run and what were the outcomes relative to what was expected.

**Status**: What is the current status of the test case such as passed, failed, or not tested.

---

#### Characteristics of a Good Test Case

So how can you develop good test cases? There are a number of guidelines or best practices in writing efficient test cases. If you practice these characteristics, you will be able to write good and efficient test cases.

#### 1. Only test one thing in a test case
Your test case should not be complicated and it should only test a single condition or value. It should be as “atomic” as possible and it should not overlap other test cases either. In this way when a test case fails, it will be easier to track what exactly failed, what was the actual result, and it will give an accurate view of how many have been found.

#### 2. Test case should have an exact and accurate purpose
So not only should it test just a single thing but that single thing should be specific and clearly stated. There should be no confusion what the test is supposed to be checking and what the expected behavior and result should be. The test case should be accurate on what it tests and it should test what it is intended to test.

#### 3. Test case should be written in a clear and easy to understand language
This applies to both the test definition in the documentation and in the actual code. Just like the test definition should be clear, the code that implements it should be straight forward and clear. Any developer or tester should be able to understand exactly what the test case is trying to do by reading it once.

#### 4. Test Case Should be Relatively Small
If your test case is following the rule for only testing a single thing, it should not be large. If you find yourself writing a long test case, then chances are you are trying to test too much. In that case you need to break it down into multiple test cases. Long test cases get too complicated and that in turn leads to mistakes in the definition, implementation or execution.

#### 5. Test case should be independent
You should be able to execute the test cases in any order and independently of other test cases. This makes the test case simpler as it is self-sufficient and there is no reason to track or worry about any other test cases. It also allows the tester or developer to use the test case for retesting as needed and to test a subset of tests while waiting for some component to be completed or fixed.

#### 6. Test case should not have unnecessary steps or words
This rule goes along with the test case being clear and short. The test case should be precise and economical and only have what it needs to have to describe what it is testing and how it should be tested. It should not be cluttered with any unnecessary and confusing verbiage.

#### 7. Test case should be traceable to requirements or design
The test case needs to test some behavior or characteristic that the code is supposed to have. A tester does not make up how the code should act. So that means that there is an explicit requirement from the user or product owner, explicit organization requirement (e.g. serviceability for every product), or implicit requirement derived from some explicit requirement that the test case can be traced to.

#### 8. Test case should be repeatable
This rule goes along with being independent. The test cases should be able to be re-run anytime and in any order. This allows for regression testing, re-runs for fixes, and continuous integration where tests are run every time changed code is integrated into the product.

##### 9. Test case should use consistent terminology and identification of functionality
This rule goes along with clear definition. When naming or identifying a feature, functionality, or widget, there should be the same and consistent terminology within the test case and across test cases. So for example, if test cases are describing the tests for login page for a college class, they should not have “user”, “person”, and “student” to refer to the same identity.  One of these should be picked and used consistently across.

---


