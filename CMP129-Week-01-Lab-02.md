CMP 129 – Computer Science II
Week 1 – Lab 2: Loops and Patterns
Learning Objectives

After completing this lab, students should be able to:

Use loops to repeat programming statements.
Process multiple values entered by a user.
Use nested loops to produce output patterns.
Apply integer division in a calculation.
Test and debug programs containing loops.

Complete both programming problems. Create a separate Java file for each problem.

Problem 1: Sales Bar Chart

Write a Java program that asks the user to enter today’s sales for five stores. The program must display a bar chart comparing the sales amounts.

Each asterisk (*) in the bar chart represents $100 in sales.

For example:

Enter today's sales for store 1: 1000
Enter today's sales for store 2: 1200
Enter today's sales for store 3: 1800
Enter today's sales for store 4: 800
Enter today's sales for store 5: 1900

SALES BAR CHART
(Each * = $100)

Store 1: **********
Store 2: ************
Store 3: ******************
Store 4: ********
Store 5: *******************
Program Requirements
Use a loop to collect the sales amounts for all five stores.
Store each sales amount using an appropriate data type.
Use a loop to display the bar for each store.
Calculate the number of asterisks by dividing the store’s sales by 100.
Display the store number before each bar.
Assume that the user enters nonnegative whole-dollar sales amounts.
Required Filename
SalesBarChart.java
Problem 2: Increasing and Decreasing Patterns

Write a Java program that uses loops to display the following two patterns.

Pattern A

Pattern A begins with one plus sign and adds one plus sign to each new line until the final line contains ten plus signs.

+
++
+++
++++
+++++
++++++
+++++++
++++++++
+++++++++
++++++++++
Pattern B

Pattern B begins with ten plus signs and removes one plus sign from each new line until the final line contains one plus sign.

++++++++++
+++++++++
++++++++
+++++++
++++++
+++++
++++
+++
++
+
Program Requirements
Use loops to generate both patterns.
Use one section of loop logic for Pattern A.
Use another section of loop logic for Pattern B.
Do not write each line individually using separate println() statements.
Include headings identifying Pattern A and Pattern B.
Use nested loops when generating the rows and plus signs.
Required Filename
Patterns.java
General Requirements
Include your name, course number, lab number, and date in a comment at the beginning of each Java file.
Use meaningful variable names.
Indent the code correctly.
Include comments explaining the important parts of each program.
Use loops as required; do not manually repeat the same statements.
Test both programs with different input values.
Each program must compile and run without errors.
Do not submit completed code generated entirely by an AI tool.
If you use Copilot or another AI tool for explanations, hints, or debugging, document the assistance in the AI Use Report.
Submission

Push the following files to your Week 1 GitHub repository:

SalesBarChart.java
Patterns.java
AI-Use-Report.md

Make at least two meaningful commits while completing the lab. Use clear commit messages that describe your progress.
