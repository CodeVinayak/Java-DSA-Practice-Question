// url: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1?page=1&category=Strings&difficulty=Basic&sortBy=submissions

class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
      int count[]=new int[256];
      int n=line.length();
      
    // Count occurrences of each character in the string
      for(int i=0;i<n;i++){
          char ch=line.charAt(i);
          count[ch]++;
      }
      int max=-1;
      char result='\0';
    // Find the character with the maximum frequency
      for(int i=0;i<256;i++){
          if(count[i]>max){
              max=count[i];
              result=(char) i;
          }
      }
      return result;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)