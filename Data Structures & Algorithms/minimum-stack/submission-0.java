class MinStack {
    Stack<Integer>st;
    Stack<Integer>mins;
    public MinStack() {
        st=new Stack<>();
        mins=new Stack<>();
    }
    
    public void push(int val) {
        if(mins.isEmpty())mins.push(val);
        else mins.push(Math.min(val,mins.peek()));
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty())st.pop();
        if(!mins.isEmpty())mins.pop();
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        return st.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
