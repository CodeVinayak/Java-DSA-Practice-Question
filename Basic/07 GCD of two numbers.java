// url : https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

    class Solution {
        public static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
        }
    }
            
//Time complexity: O(log n)
// Space complexity: O(log n),