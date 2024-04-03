// url: https://www.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte0446/1

class Solution{
    static int swapNibbles(int N) {
        int reverse;
        reverse=((N&0x0F)<<4|(N&0xF0)>>4);
        return reverse;
    }
}

//Time complexity: O(1)
// Space complexity: O(1)