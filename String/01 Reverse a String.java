//https://www.geeksforgeeks.org/problems/reverse-a-string/0

class Reverse
{
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int start=0;
        int end=str.length()-1;
        char[] charArray=str.toCharArray();
        char temp;
        while(start<end){
            temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)