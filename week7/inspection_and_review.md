#### Weekly Learning Objectives and Goals

1. Learn how to conduct code inspection

2. Learn how to conduct a code reading


---

#### Introduction

It is a well-known fact in software industry that document and code reviews/inspections are extremely helpful in finding defects and issues. In fact, some defects and issues may only be found through this manual task (as opposed to testing) or they can be found a lot easier. That is why typically code review is done after unit test but before any function test to quickly find the more obvious problems in the code. Some typical issues found this way include:

·         Lack of or incorrect comments

·         Duplicate code

·         Overly complex or fancy code that is hard to maintain

·         Parts of algorithm that cannot be tested directly especially error paths

·         Obvious defects due to misunderstanding of requirements or inexperience with technology

·         Coding errors

---

#### Types of Reviews or Inspections

In general there are three types of typical reviews: Walkthrough, Code Review, and Inspection. Technically they are not the same although it is common to use these terms interchangeably especially code review versus code inspection.

1. Walkthrough
This is typically the least formal of code reviews and often it is called “peer review” or “sanity check”.  The code reviewed this way should be small such a few line change for a defect and the objective is to have another set of eyes double check the developer’s work.

Usually no more than one or two developers are asked to review the code and often at least one of the reviewer’s is either more senior or experienced with the code or an expert in what is being changed (e.g. security fix).

The review may be done in person or through email or review tool. The author of the code change explains the changes and asks the reviewer to look at it. The reviewer provides feedback and if changes are needed, there may be a discussion about that change. Then the author makes the modifications as needed and has the reviewer double check them again. Sometimes this additional check is skipped but that is not advisable as it can and does result in additional defects. In either case, normally the reviewer(s) have to sign off and approve the final.

Once the change is approved, often through a step in code integration and/or defect fix process, the change is integrated into the product.

2. Code Review
This type of review is typically more formal than a walkthrough (peer review). It is usually done for more substantial code change, such as adding new functionality or a complex or big defect fix. In agile development, a code review is conducted after each user story is completed.

The number of reviewers will differ based on what is being reviewed and how much code needs to be reviewed. For example, for a defect it may be a couple of developers from the same team and a tester. But for a new functionality code review there may be developers, a number of testers (function, system, and integration testers), technology or code experts, product owner, project manager, technical lead, and technical writers. Personnel managers should not attend code reviews as they may impede honest discussion of the defects present but sometimes they insist on attending.

Some of the reviewers are designated as mandatory where a review meeting cannot be conducted without their presence and some reviewers may be optional. For example, the expert and/or developers for the project must be present but a technical writer could just get the meeting notes if he/she cannot attend. The mandatory reviewers may change depending on what needs to be reviewed.

Code reviews are typically scheduled by the author of the code or code change. In person reviews are preferred but depending on physical location of the reviewers, there may web conference and/or phone conference setup as well. The author has to send code (or access to code) and documentation for the review a few days before the review to allow reviewers time to prepare. Depending on the size and difficulty of the code, it may be 48 hours or a week. The reviewers are expected to review the information before the meeting and come prepared with their comments and questions.

The author will typically run the meeting, where he/she will start at some point in the code and ask for comments or questions. Sometimes it will be done for each line of code and sometimes for some bigger scope such as a method or class. It will depend on the type of code being reviewed and standard procedures for that development team. Whichever the method though, the author will usually give a brief explanation of the code or change functionality under review (line of code, method, class, etc.) before asking questions.

Sometimes the author will take his own notes for the meeting but often another person is asked to be the formal note taker so that the author can concentrate on addressing the questions and running the meeting. The author will often take some additional notes of his own as well. The official notes are often kept with the review documents to be available for audit and sometimes are typed in directly into a review tool during the code review.

Reviewers’ job is to look for issues in the implementation. These can be code errors, missing or incorrect comments, or problems with layout of the code (modularization, readability, serviceability, etc.). While it is not unheard of to have whole day code reviews especially for safety critical system, usually code reviews last 2-3 hours. Anything longer than that becomes less productive and so multiple code review meetings may be needed.

Code review is not designed for discussion on how the code needs to be modified. If and when that happens, it takes away from the main purpose of the meeting and results in the code review not being completed and/or being less productive. A good code review concentrates on identifying problems and follow up meetings are scheduled with smaller group of essential individuals to discuss the technical aspects of the changes.

After code review meeting, the review notes are sent out to all attendees or made available in the review system. The author of the code reviews those notes along with his own, if he has any and proceeds to make any necessary changes. He may schedule some technical meetings for clarifications or to receive help with the changes that are needed.

Once all the code review notes are addressed and the code changed, there needs to be another review done before final approval. Often what follow up review is needed is decided at the end of the code review but typically small changes require a walkthrough while big require another formal code review.

3. Inspection
Inspection is the most formal type of review although often the “code review” and “code inspection” are used interchangeably and are referring to the code review as described above. Inspections also have a goal of finding defects and can be done for any number of documents such as  planning documents, requirements, designs, code, documentation, install instructions, test plans, and test cases.

Since inspection are more formal, they have specific rules for how much to review per meeting, length of the meeting, how reviewers need to prepare, etc. These will vary based on the organization and the team conducting the inspection.

They can take weeks to conduct (a few hours per day) especially for mission critical and safety-critical software. Just like code review above, they focus on finding errors and not solutions and reviewers need to be prepared before the meeting. Often there are standardized checklists that are used to eliminate common errors whether for the programming language or for the particular component being reviewed.

Inspection often has more formally defined roles for the participants and in some organizations, the inspectors and the moderator need specialized training.  In addition there is a greater emphasis on documenting everything and collecting metrics data. The inspection roles include:

·         Moderator – works with author to schedule inspection, send out materials, runs meeting, follows up with author on follow-ups from inspection (often team lead or project manager)

·         Author – provides moderator with inspection material, explains material as needed, responds to questions, responsible for rework based on inspection comments

·         Reader – walks though the code, saying what it does in English and stops for comments on that piece

·         Reviewer – technical experts for the document being inspected; provides comments and questions

·         Recorder – one of the reviewers who agrees to document issues raised at the meeting; usually compiles a list with categories (defect, suggestion, comment, etc.) and distributes to all after meeting; opens internal defect reports to help track fixes

An inspection has similar phases and process as a code review. It starts out with planning where the moderator and author plan the inspection meeting and distribute the needed documents.  Sometimes there is an Overview Meeting to explain the high level of the document’s purpose and help reviewers to get started.  The reviewers are usually given at least 2-3 days to prepare. Some studies suggest that reviewers can review 125-200 lines of code per hour and some organizations have other formulas to determine how much time is needed for the preparation.

During the inspection, a moderator runs the meeting and has a reader go through blocks of code that reviewers ask questions or make comments on and classifies defects (critical/severe, serious/important, trivial, comment; check something). Then after the meeting, an inspection report is created and distributed that contains all the comments and their classification, metrics for number of defects, types, severity, etc., and the information about the time spent preparing and reviewing the document/code.

Once rework of the document or code is completed, there may be another inspection depending on the number and severity of the changes needed. It is the moderator’s responsibility to follow-up to make sure all issues identified were addressed and another inspection or a review was conducted as needed.

---

#### Code Readings

In order to conduct code review or code inspection, or to make any changes to an existing code, you need to be able to read the code and understand what it does. That is often difficult especially for large and complex product. Often you can start with the documentation whether requirements documents, design documents, or comments in the code itself. However, documentation is notoriously outdated and while a good start, you cannot rely on it being complete and/or accurate.

As a general rule, you get better in reading code as you gain experience doing just that and writing code yourself. But there are some common approaches that help with code reading as well. One approach is to run the code to see what it does and use a debugger (program that allows to step through the code and inspect the state of data and memory) or to add print statements in areas of interest to gain a better understanding of what the code is doing there.

However, often running the code may not possible especially when preparing for a code review where as a reviewer you have no access to the code or a system to run it. So the approach is to use top-down approach where you try to understand the high level view of the code and then drill down for details as needed.

A good place to start is often the entry point of the system, such as a main method in many programming languages.  If the code is a library framework without a main, then you can look for the highest level component or class to start – one that would be initialized by main method or user interface if added.

So once you find the entry point, you should look at how the program initializes itself and how it ends whether normally or abnormally. If the code is written well the methods or functions it calls will have meaningful names that give you a hint and there will be comments as well.

For example, you may have code such as:

```
if (choice == 1) {
    m.addDevice(device);    // add a new device to the plan
}
else if (choice == 2) {
    m.removeDevice(device); // remove the device from the plan
}
else if (choice == 3) {
    m.updateDevice(device); // update an existing device
}
else {
    m.exit()                // clean up and exit menu
}
```

Without knowing anything else we can determine that this piece of code gets some input (choice) that determines what action should be performed and the actions include adding a device, removing a device, or updating a device in some plan. And if the input is not 1, 2, or 3 then the system will do some cleanup and exit a menu.

So that is a good start and to learn more we would look at the details how these actions are performed (look at each method being called) and look at the caller of this piece of code to learn how the input is determined and what exactly is stored in “device”.

Whether you trace the whole program using a systematic strategy or you only study portions of the code as needed, will depend on your objective for reading the code in the first place. For example, for a code review you may only need to understand some specific implementation of a functionality that will be reviewed. In either case you will need to find a starting point and then drill down to learn more details about the code.

There are two different ways of drilling deeper into the functionality. One way is to drill all the way down on a specific branch concentrating on that single functionality (depth first). For example starting with addDevice() and following the methods it calls and the methods they call until you reach the deepest code or the level of details you are interested in. Another approach is to look at each functionality one level at a time to gain understanding for each method as you progress (breath first). Which method is used is a personal preference and based on your objective. Given that time is always limited, you may use one approach or the other depending if you are more interested in details of a specific functionality or you need to understand all functionalities but not necessarily in as great detail.

Regardless of you approach, it is often useful to draw graphs or flowcharts and take notes of what you are finding and learning as you drilldown especially key methods or variables. And you want to understand and keep track of who calls whom especially for key classes/components and methods/functions.

Another approach in reading code is to look for some key areas based on what you want to learn. So for example if you want to know how the code is handling files it uses for storage, you would look for classes, methods, and code relating to files. And the way to start is to search the program for keywords whether in code or comments, for example “file” or “open” or “create” using a non-case sensitive search. Or if you want to learn about a database, you mail look for “database”, “record”, “table”, “query”, or “row”. You get the idea.

And lastly, for object-oriented code specifically, you also want to look for abstract classes and interfaces and the sub-classes that implement them and look for inheritance, polymorphism, and class libraries used. Understanding these relationships will make a great difference in your understanding of the code.

---




