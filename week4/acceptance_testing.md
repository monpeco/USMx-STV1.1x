#### Weekly Learning Objectives and Goals

1. Learn how to conduct acceptance testing


#### Introduction 

So what do we mean by “human testing”? It is exactly what you may imagine – people doing testing, specifically manually, whether developers, testers, or customers. The key to this type of testing is that regardless who is doing the actual testing it needs to be done from the view of the final end –user, shareholder, or customer. In the next few sections we will describe different types of these tests done throughout the Development Life Cycle.

---

#### Acceptance Testing

As you should remember from week 2, acceptance testing plan for a larger scale project that uses development phases is usually done during the design phase and then the actual testing is done after the system is fully developed and tested (unit, function, system, performance, scalability, etc.) and defects are fixed during deployment phase.

The goal of acceptance test, also called User Acceptance Testing (UAT), is to evaluate and validate that the system’s functionality meets the customer’s requirements, standards, and business needs before the final delivery. This test level is meant to provide the confidence to the development and the customers that the product is what it needs to be and is ready to be deployed. This is also the time when someone has to officially sign off that the product is done and sign acceptance contracts, often delivering checks for the completion of the work.

Ideally it should be done by the customers or end users although often the testing is done in-house using the scenarios developed by testers and approved by the customers. The key however, is that the test needs to be done for real-life customer scenarios, the whole solution, and not just the individual requirements. Often a scenario would be a typical sequence of functions that a customer will have to perform daily using the system and there will be a set of these scenarios to test all the major functionality of the system.  The scenarios should concentrate on what should work and how it works and not on error checking (unlike other types of tests).

So what could be a typical testing scenario? Well imagine you had a system for tracking and ordering inventory. A daily scenario that the user may need to do on that system could be to run a report of what inventory is low, order that inventory, and track previously ordered inventory. So that is exactly what the testing scenarios would spell out with steps and details of how to accomplish these tasks.

One of the problems with UAT is that since it is usually done at the end of the product cycle, it is too late to make changes especially those requiring major re-writes. And of course, most organizations do not want to have customers be the first ones to test something. So often the customer scenarios are already tested by developers or testers beforehand and if possible, there is a mini test done by the customer earlier in the cycle to make sure that there are no major issues with the design and functionality.

In agile development where the development happens in a series of iterations of 2-6 weeks with all the testing (e.g. unit, function, system) done within each iteration, ideally you want the acceptance test to be done within the iteration as well after the other testing is completed. There are a number of advantages to this approach. Since customers or shareholders are already part of the process, a lot more closely than in traditional development approach, having official acceptance testing in the iteration, encourages them to get more involved and hands on. Otherwise while they might attend demonstration of the new/changed functionality at the end of iteration and thus provide feedback, they may not be as engaged as when testing the actual product. In addition, when the customer completes the acceptance test and it passes, it would serve as more formal acceptance of the product’s functionality developed so far. This would decrease the chance of finding serious defects in how the functionality was designed late in the cycle.

However, depending on the product and the customer involvement level and availability, a team may decide to wait a few iterations where specific functionality is complete before conducting an acceptance test for it. This way the customer would get a better picture of the look and feel of the final product for the functionality and yet it is still early enough in the cycle to make any needed changes and improvements.

Sometimes as part of the system test and sometimes as part of acceptance in-house testing, there is also the testing of the documentation, manuals, training documents, etc. These are normally not tested earlier because all the functionality and the complete solution needs to be available and in the final format for a proper evaluation. And the documents themselves are not completed until this time for the same reason.

The term “acceptance testing” is also sometimes used for any hand-off of code to another stage or organization. So for example, the function test team may run “acceptance testing” before giving the code to the system test group. They want to check that the code is at acceptable level of stability and ready for the next stage, in this case system test. Sometimes it is also called “sanity testing” where there is a subset of tests usually regression tests done right before the code is released. And in that case those tests may be a combination of automated and manual tests.

In addition there are other types of acceptance testing done at different stages of the development process and pre-production such as

·         Factory Acceptance Testing (FAT) - a third party such as a vendor may test software before the product is shipped to customers

·         Site Acceptance Testing (SAT) -  done at the customer’s site after install and setup and it verifies that the software is ready to be used by the customer in their production process/system

·         When commercially available off-the-shelf (COTS) software product is installed, there may be acceptance testing similar to SAT testing to make sure the product is installed and integrated correctly

·         Operational/Production acceptance test concentrates on checking the operation functionality such as backup systems, recovery systems, security, and maintenance services. It is usually done by the administrator responsible for the maintenance and update of the system and is completed before the system is released to the end users.

·         Compliance/regulation acceptance testing – checks that the system meets regulations such as the government standards for legal and safety 

---

