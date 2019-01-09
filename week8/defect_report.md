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

#### Writing a Defect - Isolation and Generalization

Isolation is the process of examining the causes of a defect. While the exact root cause might not be determined by a tester it is important to try and separate the symptoms of the problem from the cause. Isolating a defect is generally done by reproducing it multiple times in different situations to get an understanding of how and when it occurs.

Generalization on the other hand is the process of understanding the broader impact of a defect. Because developers reuse code elements throughout a program a defect present in one element of code can manifest itself in other areas. A defect that is discovered as a minor issue in one area of code might be a major issue in another area. Individuals logging defects should attempt to extrapolate where else an issue might occur so that a developer will consider the full context of the defect, not just a single isolated incident.

A defect report that is written without isolating and generalizing it is a half reported defect.

---

#### Writing a Defect - Severity

The importance of a defect is usually denoted as its “severity”. There are many schemes for assigning defect severity – some complex, some simple. Almost all feature “Severity-1” and “Severity-2” classifications which are commonly held to be defects serious enough to delay completion of the project. Normally a project cannot be completed with outstanding Severity-1 issues and only with limited Severity-2 issues.

Often problems occur with overly complex classification schemes. Developers and testers get into arguments about whether a defect is Sev-4 or Sev-5 and time is wasted. A simpler scheme may be more efficient.

Defects should be assessed in terms of impact and probability. Impact is a measure of the seriousness of the defect when it occurs and can be classed as “high” or “low” – high impact implies that the user cannot complete the task at hand, low impact implies there is a workaround or it is a cosmetic error. Probability is a measure of how likely the defect is to occur and again is assigned either “Low” or “High”. This removes the majority of debate in the assignment of severity.

---

#### Writing a Defect - Status

* **Status** represents the current stage of a defect in its life cycle or workflow. Commonly used status flags are:

* **New** – a new defect has been raised by testers and is awaiting assignment to a developer for resolution

* **Assigned** – the defect has been assigned to a developer for resolution

* **Rejected** – the developer was unable to reproduce the defect (or determined the behavior is not a defect because it is working as designed) and has rejected the defect report, returning it to the tester that raised it

* **Fixed** – the developer has fixed the defect and checked in the appropriate code

* **Ready for test** – the release manager has built the corrected code into a release and has passed that release to the tester for retesting

* **Failed retest** – the defect is still present in the corrected code (or a new related defect was introduced) and the defect is passed back to the developer

* **Closed** – the defect has been correctly fixed and the defect report may be closed, subsequent to review by a test lead.

---

#### Writing a Defect - Elements of a Defect Report

While the fields in the defect report may defer slightly based on a defect tracking tool used and the organization where the defect occurred, there are some basic fields or provided information that most defect reports include.

| Item | Description |
| ------- | ----------- | 
| Title   | A unique, concise and descriptive title for a defect is vital. It will allow the defect to be easily identified and discussed. Good : “Closed” field in “Account Closure” screen accepts invalid date. Bad : “Closed field busted” |
