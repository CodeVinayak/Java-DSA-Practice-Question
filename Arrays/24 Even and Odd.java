// url:    https://www.geeksforgeeks.org/problems/even-and-odd/1?page=1&category=Arrays&difficulty=Easy&sortBy=accuracy

class Solution {
    static int reArrange(int[] arr, int N) {
        int evenIndex = 0; // Start with index 0 for even numbers
        int oddIndex = 1; // Start with index 1 for odd numbers
        int[] temp = new int[N]; // Create a temporary array

        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                // Place even numbers at even locations
                temp[evenIndex] = arr[i];
                evenIndex += 2; // Increment by 2 to get the next even index
            } else {
                // Place odd numbers at odd locations
                temp[oddIndex] = arr[i];
                oddIndex += 2; // Increment by 2 to get the next odd index
            }
        }

        // Check if the rearrangement is correct
        boolean isCorrect = true;
        for (int i = 0; i < N; i++) {
            if ((temp[i] % 2 == 0 && i % 2 != 0) || (temp[i] % 2 != 0 && i % 2 == 0)) {
                isCorrect = false;
                break;
            }
        }

        // Copy the rearranged elements back to the original array
        for (int i = 0; i < N; i++) {
            arr[i] = temp[i];
        }

        return isCorrect ? 1 : 0;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)