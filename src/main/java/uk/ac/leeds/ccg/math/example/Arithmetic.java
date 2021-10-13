/*
 * Copyright 2021 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.math.example;

import java.math.BigDecimal;
import uk.ac.leeds.ccg.math.number.Math_BigRational;
import uk.ac.leeds.ccg.math.number.Math_BigRationalSqrt;

/**
 * Arithmetic examples.
 * 
 * @author Andy Turner
 */
public class Arithmetic {
    
    public static void main(String[] args) {
        
        // The square root of 2.
        System.out.println("Consider the square root of 2 which is irrational");
        System.out.println("Use a Math_BigRationalSqrt and write out the "
                + "number to the order of magnitude -50");
        Math_BigRationalSqrt root2 = new Math_BigRationalSqrt(2, 0);
        System.out.println("Math_BigRationalSqrt root2 = new "
                + "Math_BigRationalSqrt(2, 0);");
        System.out.println("root2 = " + root2);
        int oom = -50;
        System.out.println("root2 to Order of Magnitude " + oom + " = " + 
                    root2.toBigDecimal(oom).toPlainString());
        System.out.println("root2 = " + root2);
        System.out.println("The square root of 2 calculated using Math and "
                + "represented as a double = " + Math.sqrt(2.0d));
        System.out.println("The square root of 2 to the power of 2, or the "
                + "square root of 2 multiplied by itself should equal 2 "
                + "exactly.");
        System.out.println("Math.sqrt(2.0d).pow(2) = " 
                + Math.pow(Math.sqrt(2.0d), 2));
        System.out.println("Math.sqrt(2.0d) * Math.sqrt(2.0d) = " 
                + (Math.sqrt(2.0d) * Math.sqrt(2.0d)));
        System.out.println("... so there is an error with double, but with "
                + "Math_BigRationalSqrt we can get the exact result:");
        System.out.println("root2.multiply(root2).getSqrt() = " 
                + (root2.multiply(root2).getSqrt()));
        
        // Some work with rational numbers
        float tenth_float = 1.0f/10.0f;
//        float ninth_float = 1.0f/9.0f;
//        float seventh_float = 1.0f/7.0f;
//        float sixth_float = 1.0f/6.0f;
//        float fifth_float = 1.0f/5.0f;
//        float third_float = 1.0f/3.0f;
        double tenth_double = 1.0d/10.0d;
//        double ninth_double = 1.0d/9.0d;
//        double seventh_double = 1.0d/7.0d;
//        double sixth_double = 1.0d/6.0d;
//        double fifth_double = 1.0d/5.0d;
//        double third_double = 1.0d/3.0d;
        BigDecimal tenth_bd = new BigDecimal("0.1");
        Math_BigRational tenth_br = Math_BigRational.valueOf(1, 10);
//        Math_BigRational ninth_br = Math_BigRational.valueOf(1, 9);
//        Math_BigRational seventh_br = Math_BigRational.valueOf(1, 7);
//        Math_BigRational sixth_br = Math_BigRational.valueOf(1, 6);
//        Math_BigRational fifth_br = Math_BigRational.valueOf(1, 5);
//        Math_BigRational third_br = Math_BigRational.valueOf(1, 5);
        float sum_float = 0.0f;
        double sum_double = 0.0d;
        BigDecimal sum_bd = BigDecimal.ZERO;
        Math_BigRational sum_br = Math_BigRational.ZERO;
        for (int i = 0; i < 100; i ++) {
            sum_float += tenth_float;
            sum_double += tenth_double;
            sum_bd = sum_bd.add(tenth_bd);
            sum_br = sum_br.add(tenth_br);
        }
        System.out.println("1.0f/10.0f added to itself 100 times = "
                + sum_float);
        System.out.println("1.0d/10.0d added to itself 100 times = "
                + sum_double);
        System.out.println("new BigDecimal(\"0.1\") added to itself 100 times"
                + " = " + sum_bd);
        System.out.println("Math_BigRational.valueOf(1, 10) added to itself 100"
                + " times = " + sum_br);
        for (int i = 0; i < 9999900; i ++) {
            sum_float += tenth_float;
            sum_double += tenth_double;
            sum_bd = sum_bd.add(tenth_bd);
            sum_br = sum_br.add(tenth_br);
        }
        System.out.println("1.0f/10.0f added to itself 1M times = "
                + sum_float);
        System.out.println("1.0d/10.0d added to itself 1M times = "
                + sum_double);
        System.out.println("new BigDecimal(\"0.1\") added to itself 1M times = "
                + sum_bd);
        System.out.println("Math_BigRational.valueOf(1, 10) added to itself 1M "
                + "times = " + sum_br);
        System.out.println("BigDecimal is great, but a single BigDecimal "
                + "cannot accurately represent numbers like a third. Two of "
                + "them can, which is exactly how Math_BigRational stores it.");
    }
    
}
