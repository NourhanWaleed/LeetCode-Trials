class MyStack {
    private Queue<Integer> queue =new LinkedList<Integer>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.add(x);
       int n = queue.size();
        while (n-- > 1)
            queue.add(queue.poll());
    }
    
    public int pop() {
       return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */