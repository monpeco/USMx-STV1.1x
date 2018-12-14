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