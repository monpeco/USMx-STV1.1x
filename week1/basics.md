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


