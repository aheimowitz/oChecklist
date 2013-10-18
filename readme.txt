========================================================================
Design Patterns, Assignment #2
Team members: Adam Heimowitz, Michael Welte
========================================================================

Compilation and running:
========================================================================
To compile this, navigate to the parent directory and run
"ant compile" in the terminal.

Modify the build.xml file at the bottom in the "arg value" tag to change
the debug value if you wish (see below for debug value details)
and then to run, run "ant run" in the terminal.

========================================================================

Debug Values:
========================================================================
Our program uses the following debug value scheme

Debug Value = 0
	No output printed from the application

Debug Value = 1
	prints to stdout

Debug Value = 2
	prints to stdout and prints a message everytime a constructor 
	is called	

========================================================================

Approach and Justifications:
========================================================================
We created an activity interface that all activities will share, and in
addition a abstract class for each type of activity and then finally a 
concrete class for each specific instance needed.

So for example:
	The bookstore "Mando's Bookstore" extends the AbstractBookstore 
	class, which implements the interface ActivityInterface.

We decided to use the builder pattern because we are creating objects
and the order does not matter.

========================================================================

Contributions:
========================================================================
Adam Heimowitz:
	-Builder class
	-Driver class

Michael Welte:
	-Interfaces
	-Abstract classes
	-Activities concrete classes
	-Build.xml modifications
	-Readme
	
========================================================================
