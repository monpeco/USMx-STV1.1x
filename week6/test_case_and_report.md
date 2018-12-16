#### Weekly Learning Objectives and Goals

1. Be able to create a test case
2. Be able to create a test suite
3. Be able to create a test report

---

#### Testing the Design

We have spent a lot of time talking about testing code and the total software system, however as you should remember from previous weeks, testing starts long before any code is written. In fact, before you test code, you first need to test the design.

Requirements, documentation and technical specifications can be tested in their own right. The purpose of evaluating a specification is threefold:

• To make sure they are accurate, clear and internally consistent (verification)

• Making sure they are consistent with all previous and subsequent documents

• To evaluate how well they reflect reality and match end-user expects (validation)

If the requirements are poorly defined then you cannot rely on them for testing and must seek other sources of truth. In a specification or statement of requirements there should be a clear distinction between general discussion and the requirement itself. Each requirement should contain a statement which indicates what the software “should” or “must” do – this is called an assertion.

Each assertion in a specification should be reviewed against a list of desirable attributes:

* **Specific** – it is critical to eliminate as much uncertainty as possible, as early as possible. Words like "probably", "maybe" or "might" indicate indecision on the part of the author and hence ambiguity. Requirements including these words should be either eliminated or re-written.

* **Measurable** – a requirement which uses comparative words like “better” or “faster” must specify a quantitative improvement with a specific value (100% faster or 20% more accurate).

* **Testable** – from the stated requirement it must be clear how it can be proved true of false. A requirement that is unprovable is irrelevant to testing.

* **Consistent**- if one requirement contradicts another, the contradiction must be resolved. Often splitting a requirement into component parts helps uncover inconsistent assumptions in each, which can then be clarified.

* **Clear** - requirements should be simple, clear and concise. Requirements composed of longwinded sentences or of sentences with multiple clauses imply multiple possible outcomes and so lack clarity. You should split them up into single statements.

* **Exclusive** – specs should not only state what will be done, but explicitly what will not be done. Leaving something unspecified leads to assumptions.

Further, it is important to differentiate requirements from design documents. Requirements should not talk about “how” to do something and design specs should not talk about “why” to do things.

---

#### Functional vs Non-Functional test cases

We have been discussing many different tests and different test techniques but most had one thing in common - they all concentrated on the functional requirements of the system or in other words its function and behavior. The one exception was the usability testing.

So let’s talk a little about a different test emphasis which is equally important – non-functional requirements. Non-functional requirement is not concerned with the functionality of the system but rather the operation and serviceable.  So the common non-functional requirements include systems usability, performance, scalability, security, serviceability, logging, reliability, and so forth.

Non-functional requirements normally apply to the whole system and have to be tested as such. That is why they are usually executed once the code is integrated and have been function tested. An example of non-functional testing is performance testing discussed below.

---

#### Performance Testing

One important aspect of modern software systems is its performance in multi-user or multi-tier environments. To test the performance of the software you need to simulate its production environment and simulate the traffic that it will receive when it is in use – this can be difficult.

The most obvious way of accurately simulating the deployment environment is to simply use the live environment to test the system. This can be costly and potentially risky but it provides the best possible confidence in the system. It may be impossible in situations where the deployment system is constantly in use or is mission critical to other business applications. In this case a production-like system must be used and performance in production extrapolated from this.

Also common is the use of capture-and-playback tools (automated testing). A capture tool is used to record the actions of a typical user performing a typical task on the system. A playback tool is then used to reproduce the action of that user multiple times simultaneously. The multi-user playback provides an accurate simulation of the stress the real-world system will be placed under.

The use of capture and playback tools must be used with caution, however. Simply repeating the exact same series of actions on the system may not constitute a proper test. Significant amounts of randomization and variation should be introduced to correctly simulate real-world use. You also need to understand the technical architecture of the system. If you don't stress the weak points, the bottlenecks in performance, then your tests will prove nothing. You need to design targeted tests which find the performance issues.

And having a baseline is important. Without knowledge of the 'pre-change' performance of the software it is impossible to assess the impact of any changes. “The system can only handle 100 transactions an hour!” comes the cry; but if it only handles 50 transactions an hour at the moment, is this actually an issue?

Performance testing is a tricky, technical business. The issues that cause performance bottlenecks are often obscure and buried in the code of a database or network. Digging them out requires concerted effort and targeted, disciplined analysis of the software.

##### Types of Performance Testing

* **Load testing** is the simplest form of performance testing. A load test is usually conducted to understand the behavior of the system under a specified load. This load can be the expected concurrent number of users on the application performing a specific number of transactions within the set duration. This test will return the response times of all the important business transactions. The database, application server, etc. are also monitored during the test to assist in identifying bottlenecks in the application architecture.

* **Stress testing** is normally used to understand the upper limits of capacity within the system. This kind of test is done to determine the system's robustness in terms of extreme load and helps application administrators to determine if the system will perform sufficiently if the current load goes well above the expected maximum.

* **Soak testing**, also known as endurance testing, is usually done to determine if the system can sustain the continuous expected load. During soak tests, memory utilization is monitored to detect potential leaks. Also important, but often overlooked is performance degradation, i.e. to ensure that the throughput and/or response times after some long period of sustained activity are as good as or better than at the beginning of the test.

* **Spike testing** is done by suddenly increasing or decreasing the load by a very large number of users, and observing the behavior of the system. The goal is to determine whether performance will suffer, the system will fail, or it will be able to handle dramatic changes in load.

---

#### The Purpose of Test Planning

As an organized activity, testing should be planned, to a reasonable extent. But test planning represents a special challenge. The aim of testing is to find bugs in the product and so the aim of planning is to plan how to find the bugs in the product. The paradox is of course, that if we knew where the bugs were then we could fix them without having to test for them. Testing is the art of uncovering the unknown and therefore can be difficult to plan.

The usual, naïve retort is that you should simply test “all” of the product. Even the simplest program however will defy all efforts to achieve 100% coverage (as we discussed previously). Even the term coverage itself is misleading since this represents a plethora of possibilities. Do you mean code coverage, branch coverage, or input/output coverage? AS you learned, each one is different and each one has different implications for the development and testing effort. The ultimate truth is that complete coverage, of any sort, is simply not possible (nor desirable).

So how do you plan your testing? At the start of testing there will be a (relatively) large number of issues and these can be uncovered with little effort. As testing progress more and more effort is required to uncover subsequent issues. The law of diminishing returns applies and at some point the investment to uncover that last 1% of issues is outweighed by the high cost of finding them. The cost of letting the customer or client find them will actually be less than the cost of finding them in testing.

The purpose of test planning therefore is to put together a plan which will deliver the right tests, in the right order, to discover as many of the issues with the software as time, budget and your risk appetite allows.

---

#### Test Identification

The next step is to identify tests which 'exercise' each of the elements in your system. This isn't a one-to-one relationship. Many tests might be required to validate a single element of your system and a single test may validate more than one point on one axis. For example, a single test could simultaneously validate functionality, code structure, a UI element and error handling. So the first step is in deciding 'what' you will test.

---

#### Test Selection

Given that we acknowledge we can't achieve 100% coverage, we must now take a critical eye to our list of test cases. We must decide which ones are more important, which ones will exercise the areas of risk and which ones will discover the most bugs. But how? Bugs tend to cluster around one or more areas within the system. These define the areas of risk in the product. Perhaps this section of the code was completed in hurry or perhaps this section of the 'input data space' was particularly difficult to deal with. Whatever the reason, these areas are inherently more risky, more likely to fail than others.

You must try to achieve a balance. Your aim should be to provide a broad coverage for the majority of your areas and deep coverage for the most risky areas discovered. Broad coverage implies that an element in the system is evaluated in an elementary fashion while deep coverage implies a number of repetitive, overlapping test cases which exercise every variation in the element under test. The aim of broad coverage is to identify risky areas and focus the deeper coverage of those areas to eliminate the bulk of issues. It is a tricky balancing act between trying to cover everything and focusing your efforts on the areas that require most attention.

---

#### Test Scripting

There are several schools of thought to test scripting. In risk adverse industries such as defense and finance there is a tendency to emphasize scripting tests before they are executed. These industries are more concerned with the potential loss from a software defect than the potential gain from introducing a new piece of software. As a consequence there is a heavy emphasis on verifiable test preparation (although observance of this verification might only be lip-service!).

And in some industries, external compliance issues (legal compliance or contractual obligation for example) mean that a script-heavy approach is mandated.

On the other hand, in consumer software development, a looser approach is normally taken. Since speed-to-market is more important than the risk of a single defect, there is considerable latitude in the test approach. Specific test cases may not be documented or loosely documented and testers will be given a great deal of freedom in how they perform their testing.

The ultimate extension of this is unscripted or exploratory testing. In this form of testing, there is a considerable amount of preparation done but test cases are not pre-scripted. The tester uses their experience and a structured method to 'explore' the software and uncover defects. They are free to pursue areas which they think are more risky than others.

Scripting, it is argued, is a waste of time. Often the amount of time spent on scripting can actually exceed the amount of time in execution. If you have an experienced tester with the right set of tools and the right mindset, it is more effective and more cost to turn them loose to find some bugs right away. This concept is almost heresy in some camps. There is also an important legal aspect to consider as Cem Kaner points out in his book “Testing Computer Software”. If you are responsible for releasing a piece of software that causes financial loss you could be liable for damages. Further, if you cannot prove that you have conducted due diligence through adequate testing you may be guilty of professional negligence. One of the goals of test preparation therefore is to provide an audit trail which shows the efforts you have made to verify the correct behavior of the software. Whether or not you script every case is immaterial. What matters is how you can demonstrate that you prepared your testing in a methodical and professional manner.

---

#### Test Cases

Let’s assume you have to document your tests; a test case documents a test, intended to prove a requirement or feature. The relationship is not always one-to-one, sometimes many test case are required to prove one requirement. Sometimes the same test case must be extrapolated over many screens or many workflows to completely verify a requirement (there should usually be at least one test case per requirement however).

Some methodologies (like Rational Unified Process - RUP) specify there should be two test cases per requirement – a positive test case and a negative test case. A positive test case is intended to prove that the function-under-test behaves as required with correct input and a negative test is intended to prove that the function-under-test does not provoke an error with incorrect input (or responds gracefully to that error).

This is where the debate about what to script, and what not to, heats up. If you were to script separately for every possible negative case, you would be scripting till the cows come home. Consider a 'date-of-birth' field in a software application. It should only accept 'correctly formatted' dates. But what is a correct format? It is probably possible to generalize this from the requirements and come up with a single test case which specifies all the acceptable date formats. But what about the negative case? Can you possible extrapolate all the possible inputs and specify how the system should react? Possibly, but it would take you forever. To generalize it you could simply say that the system should produce an error with 'unacceptable input'

One approach is to view a positive test case as implying a negative case. If your positive case also documents how the software is expected to handle exceptions then it covers both the positive cases and the negative cases. If your testers are well trained and have brains they will attempt all the possible input values in an attempt to provoke an exception.

---

#### Test Suite

A test suite is a collection of test cases grouped together to test some specific functionality or aspect of a system or in other words some specific behavior of the software. The test suite should have some documentation and naming convention to indicate what it is testing and how to execute the tests (e.g. testing system setup instructions).  There will often be multiple test suites, each with a different set of goals to test the same software product.

Test suites can include automated test cases, manual test cases, or combination of both.  Tests can be defined into test suites up front or can be grouped into test suite afterwards. For example, one can define and/or automate function tests for complete functionality testing and then select a number of these test cases to go into a regression test suite.

A tester may add additional test cases into a test suite as the testing progresses or as the product evolves whether through modifications to the existing code or new code being added.

In addition, there can be separate test suites created for specific non-functional requirements or considerations such as stress test suite, scalability test suite, or logging test suite, to name a few.

---

#### Tracking Progress

Depending on your test approach, tracking your progress will either be difficult or easy. If you use a script-heavy approach, tracking progress is easy. All you need to do is compare the number of scripts you have left to execute with the time available and you have a measure of your progress. If you don't script, then tracking progress is more difficult. You can only measure the amount of time you have left and use that as a guide to progress.

If you use advanced metrics you can compare the number of defects you've found with the number of defects you expect to find. This is an excellent way of tracking progress and works irrespective of your scripting approach.

But tracking progress without adjusting your plan is wasting information. Suppose you script for 100 test cases, each taking one day to execute. The project manager has given you 100 days to execute your cases. You are 50 days into the project and are on schedule, having executed 50% of your test cases. But you've found no defects. The hopeless optimist will say, “Well! Maybe there aren't any!” and stick to their plan. The experienced tester will say something unprintable and change their plan. The chance of being 50% of the way through test execution and not finding defects is extremely slim. It either means there is a problem with your test cases or there is a problem with the way in which they are being executed. Either way, you're looking in the wrong place.

Regardless of how you prepare for testing you should have some kind of plan. If that plan is broken down into different chunks you can then examine the plan and determine what is going wrong. Maybe development hasn’t delivered the bulk of the functional changes yet? Maybe the test cases are out of date or aren't specific enough? Maybe you've underestimated the size of the test effort? Whatever the problem, you need to jump on it quick. 

---

#### Test Report

At the end of a testing cycle (e.g. function test, system test, and integration test) there is usually a document that summarizes the completed test effort. Sometimes it may be added to the test plan itself. This report may be reviewed by development, testers, and management to determine that the test have in fact completed all the tasks that were schedules and that it reached the agreed on exit criteria.

The report is also often used as documentation of what was done that can be used for analysis, to improve future testing, or to analyze how something was missed if it is discovered later. Therefore it usually includes what was tested, how long it took, what defects were done, etc.  Management often takes the summary and the numbers to present to the project manager or his/her manager for status report. Therefore the data is often presented in some easily to view form such as spreadsheet or graph or both where the numbers of importance stand out. The numbers of particular interest are planned number of weeks or months for testing versus actual weeks/months; planned or defined number of test cases versus actual defined; number of test cases executed; and number of defects found.

Therefore typical format for this report includes:

*  scope of testing – what was tested and what was not tested and any deviation from the original plan
*  test exit or acceptance criteria – what functionality/components/aspects of the software to test and the level of stability reached; usually it also includes agreement on outstanding defects such all critical and high severity defects must be fixed before testing can be completed 
*  test strategy – what systems were used for testing, what was manual versus automated, what was the testing setup, what methodology was used for testing to include any tools or frameworks used
*  final results – number of defined test cases (how many manual versus automated), which were executed or not; final status of the testing effort and often a summary and conclusion of the perception (e.g. current stability) of the product and the test effort; charts and numbers over timeline (e.g. number of test cases executed for example per week or month and defects found and defects fixed during that timeframe)
*  defects and current status – there may be a list of defects grouped in some logical matter or just categories of defects and numbers (e.g. per severity or per component or functionality); there can be statistical data how long it took for defects to be fixed, how many blocking defects there were and how long they blocked the testing; and current status of defects as far as which fixed, in progressed, moved to be fixed in next release, etc.

**Citation**

Some of the content comes from the following reference, with a number of modifications:

Jenkins, N. (2017). Software Testing Primer v2.

---

