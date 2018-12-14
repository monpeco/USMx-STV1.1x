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