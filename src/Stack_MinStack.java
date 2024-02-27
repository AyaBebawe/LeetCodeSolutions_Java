import java.util.Stack;

public class Stack_MinStack {
	 private int min = Integer.MAX_VALUE;
	 private Stack<Integer> newStack;

	    public Stack_MinStack() {   
	     newStack = new  Stack<Integer>();
	    }
	    
	    
	    public void push(int val) {
	       if (val <= min)
	       {
	        newStack.push(min);  
	        min = val ;
	       }
	       newStack.push(val); 
	    }
	    
	    public void pop() {

	       if (newStack.pop()== min)
	       {
	           min = newStack.pop();
	       }   
	    }
	    
	    public int top() {
	       return  newStack.peek();
	        
	    }
	    
	    public int getMin() {

	        return min ;
	        
	    }
	

}

/* another solution by 2 stacks 
 * class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            if (mainStack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            mainStack.pop();
        }
    }

    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
}
  
 */
