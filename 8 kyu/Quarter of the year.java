// -----------------------------------------------------------
// Given a month as an integer from 1 to 12, return to which quarter of the year it 
// belongs as an integer number.
// 
// For example: month 2 (February), is part of the first quarter; month 6 (June), is 
// part of the second quarter; and month 11 (November), is part of the fourth 
// quarter.
// 
// Constraint:
// 
// 1 <= month <= 12
// -----------------------------------------------------------

public class Kata {
    public static int quarterOf(int month) {
        if (month < 1 || month > 12) return month;
        return (month - 1) / 3 + 1;
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