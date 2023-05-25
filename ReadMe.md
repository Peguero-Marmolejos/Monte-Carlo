# **Monte Carlo Integration**

## **Description**
The Monte Carlo simulation is a mathematical technique that predicts possible outcomes of an uncertain event. This is a simple MonteCarlo simulation that numericallly computes a definite integral of the function y=f(x)=3x^4-10 between the values of x =0.0 and x=5.0.

In this simulation a random real number(double) is generated and manipulated into fitting between the ranges of the x values, which in this case is 0.0 and 5.0.

The generated and manipulated value is then used as a parameter for the function f, which is the mathematical function f(x)=3x^4-10

An estimated integral is found by repeatedly evaluating the function at random values between the given range,summing the function values, and calculating the mean value. In this project the value of the function at random points is calculated 99000 times, since the more iterations under the Monte Carlo simulation the higher levels of accuracy.

Then by hardcoding the definite value of the one dimensional integral, I compared the Monte Carlo Integration result with the actual value of the integral and calculated the error percentage of accuracy. The Monte Carlo Integration is much more accurate at higher level functions.

## **Key Learnings**
* Improved readability
* Deep Understanding of calculus 
* Probabilistic Determination
* removed the JAVA util package

## **Authors**
Emily Peguero Marmolejos
@Emilymania

