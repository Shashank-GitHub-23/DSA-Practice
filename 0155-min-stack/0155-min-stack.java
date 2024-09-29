class MinStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stack
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Pushes an element onto the stack
    public void push(int x) {
        mainStack.push(x);

        // Push to minStack if it's empty or the current element is less than or equal to the min element
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pops the top element from the stack
    public void pop() {
        // If the popped element is the same as the top of minStack, pop minStack too
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    // Returns the top element of the stack
    public int top() {
        return mainStack.peek();
    }

    // Retrieves the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }
}
