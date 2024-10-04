class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int size = arr.length;
        int[] ans = new int[size];
        Stack<Integer> stack = new Stack<>();

        for(int i = 2 * size - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[i % size] >= stack.peek()) {
                stack.pop();
            }

            if(i < size) {
                if(!stack.isEmpty()) {
                    ans[i] = stack.peek();
                } else {
                    ans[i] = -1;
                }
            }

            stack.push(arr[i % size]);
        }

        return ans;
    }
}