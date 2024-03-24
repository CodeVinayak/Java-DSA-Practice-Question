// url: https://www.geeksforgeeks.org/problems/count-digits5716/1?page=4&difficulty=Easy&sortBy=submissions

class Solution{
    static int evenlyDivides(int N){
    // Convert N to a string
    String strN=String.valueOf(N);
    int count=0;
    //iterate through each digit of N
       for(int i=0;i<strN.length();i++){
           // Convert the current digit from a character to an integer
           int digit=Character.getNumericValue(strN.charAt(i));
           {
               // Check if the digit is not zero and whether N is divisible by the digit without a remainder
               if(digit!=0 && N%digit==0){
                   count++;
               }
           }
       }
       return count;
    }
}

// Converting the integer N to string takes O(log N) time complexity, where log N is the number of digits in N.
// space complexity of code is O(log N) as well because the conversion of N to a string requires additional space to store the characters representing the digits.
// Time Complexity: O(log N)
// Space Complexity: O(log N)