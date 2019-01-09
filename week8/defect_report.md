#### Weekly Learning Objectives and Goals

1. Learn the different types of software defects

#### What is a Defect

So let’s look at some details of defects. After all, finding and eventually fixing defects is the number one reason for software testing. Can you define a defect? A defect is a fault due to an error in code whether due to incorrect design, logic, or implementation where the software does not behave as expected. The expected behavior of course is based on user requirements and/or reasonable behavior for that type of software.

---

#### Defect Management

Defects need to be handled in a methodical and systematic fashion. There's no point in finding a defect if it's not going to be fixed (or at least documented with a workaround). There's no point getting it fixed if you don't know it has been fixed and there's no point in releasing software if you don't know which defects have been fixed and which remain.

How will you know? The answer is to have a defect tracking system. The simplest can be a database or a spreadsheet. A better alternative is a dedicated system, which enforce the rules and process of defect handling and makes reporting easier. Some of these systems are costly but there are many freely available variants.

A badly written defect report wastes time and effort for many people. A concisely written, descriptive report results in the elimination of a bug in the easiest possible manner. Also, for testers, defect reports represent the primary deliverable for their work. The quality of a tester’s defect reports is a direct representation of the quality of their skills.

Defect Reports have a longevity that far exceeds their immediate use. They may be distributed beyond the immediate project team and passed on to various levels of management within different organizations. Developers and testers alike should be careful to always maintain a professional attitude when dealing with defect reports. 

---

#### Writing a Defect - Introduction

So what makes a good defect report? Often defect reports do not have enough information or they are inaccurate and so they are either rejected or when reviewed later, it is impossible to say what the actual problem was. But there are guidelines on what makes a good report, as discussed in the next units:

* Characteristics of a Good Defect Report
* Isolation and Generalization
* Severity
* Status
* Elements of a Defect Report
* Root Cause Analysis

---

#### Writing a Defect - Characteristics of a Good Defect Report

* **Objective** – criticizing someone else’s work can be difficult. Care should be taken that defects are objective, non-judgmental and unemotional. e.g. don’t say “your program crashed” say “the program crashed” and don’t use words like “stupid” or “broken”.

* **Specific** – one report should be logged per defect and only one defect per report.

* **Concise** – each defect report should be simple and to-the-point. Defects should be reviewed and edited after being written to reduce unnecessary complexity.

* **Reproducible** – the single biggest reason for developers rejecting defects is because they can’t reproduce them. As a minimum, a defect report must contain enough information to allow anyone to easily reproduce the issue if it can be reproduced at will. Timing issues may be hard to reproduce but in that case there should be other information that can help in determining where in the code the error may be

* **Explicit** – defect reports should state information clearly or they should refer to a specific source where the information can be found. e.g. “click the button to continue” implies the reader knows which button to click, whereas “click the ‘Next’ button” explicitly states what they should do.

* **Persuasive** –the pinnacle of good defect reporting is the ability to champion defects by presenting them in a way which makes developers want to fix them.

---

#### 