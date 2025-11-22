// -----------------------------------------------------------
// Snail Sort
// Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
// 
// array = [[1,2,3],
//          [4,5,6],
//          [7,8,9]]
// snail(array) #=> [1,2,3,6,9,8,7,4,5]
// 
// For better understanding, please follow the numbers of the next array consecutively:
// 
// array = [[1,2,3],
//          [8,9,4],
//          [7,6,5]]
// snail(array) #=> [1,2,3,4,5,6,7,8,9]
// 
// NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.
// 
// NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
// -----------------------------------------------------------

public class Snail {

    public static int[] snail(int[][] array) {
      int n = array.length;
      
      if (array.length == 0 || array[0].length == 0) return new int[0];
      
      int[] answer = new int [n * n];
      int index = 0;
      int top = 0;
      int bottom = n - 1;
      int left = 0;
      int right = n - 1;
      
      while (top <= bottom && left <= right){
        
        for (int i = left; i <= right; i++){
          answer[index++] = array[top][i];
        }
        top++;
        
        for (int i = top; i <= bottom; i++){
          answer[index++] = array[i][right];
        }
        right--;
        
        if (top <= bottom){
          for (int i = right; i >= left; i--){
            answer[index++] = array[bottom][i];
          }
          bottom--;
        }
        
        if (left <= right){
          for (int i = bottom; i >= top; i--){
            answer[index++] = array[i][left];
          }
          left++;
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