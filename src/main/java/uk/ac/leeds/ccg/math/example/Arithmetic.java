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

import uk.ac.leeds.ccg.math.number.Math_BigRationalSqrt;

/**
 * Arithmetic examples.
 * 
 * @author Andy Turner
 */
public class Arithmetic {
    
    public static void main(String[] args) {
        
        // The square root of 2.
        Math_BigRationalSqrt root2 = new Math_BigRationalSqrt(2, 0);
        for (int i = 0; i < 100; i ++) {
            int oom = -i;
            System.out.println("root2 to Order of Magnitude " + oom + ": " + 
                    root2.toBigDecimal(oom).toPlainString());
        }
        
    }
    
}
