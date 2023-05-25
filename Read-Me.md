# **Monte Carlo Integration**

## **Description**
The Monte Carlo simulation is a mathematical technique that predicts possible outcomes of an uncertain event. This is a simple MonteCarlo simulation that numericallly computes a definite integral of the function y=f(x)=3x^4-10 between the values of x =0.0 and x=5.0.

In this simulation a random real number(double) is generated and manipulated into fitting between the ranges of the x values, which in this case is 0.0 and 5.0.

The generated and manipulated value is then used as a parameter for the function f, which is the mathematical function f(x)=3x^4-10


Unlike a normal forecasting model, Monte Carlo Simulation predicts a set of outcomes based on an estimated range of values versus a set of fixed input values. In other words, a Monte Carlo Simulation builds a model of possible results by leveraging a probability distribution, such as a uniform or normal distribution, for any variable that has inherent uncertainty. It, then, recalculates the results over and over, each time using a different set of random numbers between the minimum and maximum values. In a typical Monte Carlo experiment, this exercise can be repeated thousands of times to produce a large number of likely outcomes.

Monte Carlo Simulations are also utilized for long-term predictions due to their accuracy. As the number of inputs increase, the number of forecasts also grows, allowing you to project outcomes farther out in time with more accuracy. When a Monte Carlo Simulation is complete, it yields a range of possible outcomes with the probability of each result occurring.

## **Getting Started**
Dependencies
Describe any prerequisites, libraries, OS version, etc., needed before installing program.
ex. Windows 10
## **Installing**
How/where to download your program
Any modifications needed to be made to files/folders
Executing program
How to run the program
Step-by-step bullets
code blocks for commands
## **Help**
Any advise for common problems or issues.

command to run if program contains helper info
## **Authors**
Contributors names and contact info

ex. Dominique Pizzie
ex. @DomPizzie

## **Version History**
0.2
Random double values were originally generated using JAVA's util random package, but current;y uses Math.random 
Various bug fixes and optimizations
See commit change or See release history
0.1
Initial Release
