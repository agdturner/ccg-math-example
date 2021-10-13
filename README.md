# ccg-math-example
An example use of [ccg-math](https://github.com/agdturner/ccg-math).
The [pom.xml](https://github.com/agdturner/ccg-math-example/blob/pom.xml) provides an example of how to load and use the library.

## Requirements
[Maven](https://maven.apache.org/).
Java version 11 or higher.

## How to run
- Fork/clone or download this repository as a zip file.
- Open the Maven project in your favourite Integrated Development Enviornment (IDE) such as [Netbeans](https://netbeans.apache.org/).
Run [Arithmetic.jar](https://github.com/agdturner/ccg-math-example/blob/main/src/main/java/uk/ac/leeds/ccg/math/example/Arithmetic.java)

## What to expect
It should take a second or two to run and produce the following output which explains some of the utility of the library:
```
-------------------------------------------------
Consider the square root of 2 which is irrational
-------------------------------------------------
Use a Math_BigRationalSqrt and write out the number to the order of magnitude -50
Math_BigRationalSqrt root2 = new Math_BigRationalSqrt(2, 0);
root2 = Math_BigRationalSqrt(x=2, negative=false, sqrtx=null, oomi=0, sqrtxapprox=1, oom=0)
root2 to Order of Magnitude -50 = 1.41421356237309504880168872420969807856967187537695
root2 = Math_BigRationalSqrt(x=2, negative=false, sqrtx=null, oomi=-50, sqrtxapprox=1.41421356237309504880168872420969807856967187537695, oom=-50)
The square root of 2 calculated using Math and represented as a double = 1.4142135623730951
The square root of 2 to the power of 2, or the square root of 2 multiplied by itself should equal 2 exactly.
Math.sqrt(2.0d).pow(2) = 2.0000000000000004
Math.sqrt(2.0d) * Math.sqrt(2.0d) = 2.0000000000000004
... so there is an error with double, but with Math_BigRationalSqrt we can get the exact result:
root2.multiply(root2).getSqrt() = 2
root2 to Order of Magnitude -200 = 1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764157273501384623091229702492483605585073721264412149709993583141322266592750559275579995050115278206057147

----------------------------------------------------
Consider floating point (im)precision more generally
----------------------------------------------------
1.0f/10.0f added to itself 100 times = 10.000002
1.0d/10.0d added to itself 100 times = 9.99999999999998
new BigDecimal("0.1") added to itself 100 times = 10.0
Math_BigRational.valueOf(1, 10) added to itself 100 times = 10
1.0f/10.0f added to itself 1M times = 1087937.0
1.0d/10.0d added to itself 1M times = 999999.9998389754
new BigDecimal("0.1") added to itself 1M times = 1000000.0
Math_BigRational.valueOf(1, 10) added to itself 1M times = 1000000
BigDecimal is great, but a single BigDecimal cannot accurately represent numbers like a third. Two of them can, which is exactly how Math_BigRational stores it.
```
