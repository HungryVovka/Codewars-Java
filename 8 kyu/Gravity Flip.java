// -----------------------------------------------------------
// Description:
// If you've completed this kata already and want a bigger challenge, here's the 3D 
// version (https://www.codewars.com/kata/5f849ab530b05d00145b9495/)
// 
// Bob is bored during his physics lessons so he's built himself a toy box to help pass 
// the time. The box is special because it has the ability to change gravity.
// 
// There are some columns of toy cubes in the box arranged in a line. The i-th 
// column contains a_i cubes. At first, the gravity in the box is pulling the cubes 
// downwards. When Bob switches the gravity, it begins to pull all the cubes to a 
// certain side of the box, d, which can be either 'L' or 'R' (left or right). Below 
// is an example of what a box of cubes might look like before and after switching 
// gravity.
// 
// +---+                                       +---+
// |   |                                       |   |
// +---+                                       +---+
// +---++---+     +---+              +---++---++---+
// |   ||   |     |   |   -->        |   ||   ||   |
// +---++---+     +---+              +---++---++---+
// +---++---++---++---+         +---++---++---++---+
// |   ||   ||   ||   |         |   ||   ||   ||   |
// +---++---++---++---+         +---++---++---++---+
// 
// Given the initial configuration of the cubes in the box, find out how many cubes 
// are in each of the n columns after Bob switches the gravity.
// 
// Examples (input -> output:
// * 'R', [3, 2, 1, 2]      ->  [1, 2, 2, 3]
// * 'L', [1, 4, 5, 3, 5 ]  ->  [5, 5, 4, 3, 1]
// -----------------------------------------------------------

import java.util.Arrays;

public class Kata {
  public static int[] flip(char dir, int[] arr) {
    int[] answer = Arrays.copyOf(arr, arr.length);
    Arrays.sort(answer);
    if (dir == 'L'){
      int leftIndex = 0;
      int rightIndex = answer.length - 1;
      while (leftIndex < rightIndex){
        int temp = answer [leftIndex];
        answer[leftIndex] = answer[rightIndex];
        answer[rightIndex] = temp;
        leftIndex++;
        rightIndex--;
      }
    }
    return answer;
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