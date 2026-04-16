class myStack {
    Stack<Integer> s;
    int capacity;
    public myStack(int n) {
        // Define Data Structures
        s=new Stack<>();
        capacity=n;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return s.isEmpty();
    }

    public boolean isFull() {
        // check if the stack is full
        return s.size()==capacity;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(!isFull()){
            s.push(x);
    }
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(!isEmpty()){
            s.pop();
        }
    }

    public int peek() {
        // Returns the top element of the stack
        if(isEmpty()) return -1;
        return s.peek();
    }
}