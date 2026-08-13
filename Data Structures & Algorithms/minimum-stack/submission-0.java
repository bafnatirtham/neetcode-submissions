class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minimum ;

    public MinStack() {
        stack = new Stack<>();
        minimum = new Stack<>();
        int minNum= Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);

        if(minimum.isEmpty()){
        minimum.push(val);}
        else{
        minimum.push(Math.min(val,minimum.peek()));
    }
    }
    
    public void pop() {
        stack.pop();
        minimum.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */