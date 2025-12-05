// -----------------------------------------------------------
// Introduction
// floats have limited precision and are unable to exactly represent some values. 
// Rounding errors accumulate with repeated computation, and numbers expected 
// to be equal often differ slightly.
// 
// As a result, it is common advice to not use an exact equality comparison (==) 
// with floats.
// 
// >>> a, b, c = 1e-9, 1e-9, 3.33e7
// >>> (a + b) + c == a + (b + c)
// False
// 
// >>> 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 == 1.0
// False
// 
// The solution is to check if a computed value is close to an expected value, 
// without requiring them to be exactly equal. It seems very easy, but many katas 
// test float results the wrong way.
// 
// Task
// You have:
// 
// a float value that comes from a computation and may have accumulated 
// errors up to ±0.001
// a reference value
// 
// The function is bugged and sometimes returns wrong results.
// 
// Your task is to correct the bug.
// 
// Note
// This kata uses fixed tolerance for simplicity reasons, but usually relative 
// tolerance is better. Fixed tolerance is useful for comparisons near zero or when 
// the magnitude of the values is known.
// -----------------------------------------------------------

import java.text.DecimalFormat;

public class FloatingPointComparison {
    public static boolean approxEquals(double a, double b) {
// Option 1: Fails on a=98.7655, b=98.7654999
//         double roundTo3Places = 1000.0;
//         a = Math.round(a * roundTo3Places) / roundTo3Places;
//         b = Math.round(b * roundTo3Places) / roundTo3Places;
//         return a == b;
      
// Option 2: Fails on a=98.7655, b=98.7654999       
//         String a_String = String.format("%.3f", a);
//         String b_String = String.format("%.3f", b);
//         return a_String.equals(b_String);
      
// Option 3: Fails on a=123.2345, b=123.2345010 and a=98.7655, b=98.7654999 (like the Python version)
        
        double epsilon = 0.001;
        return Math.abs(a - b) < epsilon;
    }
}

// -----------------------------------------------------------
// License
// Tasks are the property of Codewars (https://www.codewars.com/) 
// and users of this resource.
// 
// All solution code in this repository 
// is the personal property of Vladimir Rukavishnikov
// (vladimirrukavishnikovmail@gmail.com).
// 
// Copyright (C) 2025 Vladimir Rukavishnikov
// 
// This file is part of the HungryVovka/Codewars-C
// (https://github.com/HungryVovka/Codewars-C)
// 
// License is GNU General Public License v3.0
// (https://github.com/HungryVovka/Codewars-C/blob/main/LICENSE)
// 
// You should have received a copy of the GNU General Public License v3.0
// along with this code. If not, see http://www.gnu.org/licenses/
// -----------------------------------------------------------