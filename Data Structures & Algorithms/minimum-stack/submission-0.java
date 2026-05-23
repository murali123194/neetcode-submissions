class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack=new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int i=Integer.MAX_VALUE;
        for(int part:stack){
            if(part<i){
                i=part;
            }
        }
        return i;
        
    }
}
