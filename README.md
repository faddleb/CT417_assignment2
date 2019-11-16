# CT417_assignment2
Git Repo for Java Maven/CI assignement


Create a Java project using Maven. The project should contain three classes
and each class should have suitable accessor and mutator methods:
1. A student class should contain some attribute ssuch as (Name, Age, DOB,
ID, username, courses and modules registered for, etc.).A specific method
(getUsername()) will generate the student’s username by concatenating
their name and age.
2. A module class, which should contain information such as module name,
id(e.g. CT417), list of students, courses it is associated with).
3. A course programme class containing course name (CS and IT or ECE,
etc.), list of modules,list of students that are enrolled, academic start
date and end date. Start and end dates should use Joda Time classes(i.e.
DateTime), which must be added as a project dependency.

Write a simple unit test using JUnit to make sure that all the above works
(e.g.get getUsername()) as expected.

Assignment deliverables:
• Links to your Github repositories which contain the source code
• Screenshots of your local (Git) revision histories, i.e. your Git commits
• Screenshots from Shippable’s Jobs and Insights pane to see the build history of the automatic build
