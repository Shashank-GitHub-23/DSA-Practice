import java.util.Stack;

class Solution {
    static final int MOD = 1_000_000_007;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long totalSum = 0;

        // Arrays to store previous less and next less elements
        int[] prevLess = new int[n];
        int[] nextLess = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Calculate previous less elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevLess[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear the stack for reuse
        stack.clear();

        // Calculate next less elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextLess[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the total sum of subarray minimums
        for (int i = 0; i < n; i++) {
            // Contribution of arr[i] to the final sum
            long leftCount = i - prevLess[i];   // Subarrays where arr[i] is the minimum
            long rightCount = nextLess[i] - i;  // Subarrays where arr[i] is the minimum
            totalSum = (totalSum + (long) arr[i] * leftCount * rightCount) % MOD;
        }

        return (int) totalSum;
    }
}
