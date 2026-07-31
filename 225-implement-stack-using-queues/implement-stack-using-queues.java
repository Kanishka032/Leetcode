import java.util.*;

class MyStack {
    private Queue<Integer> one;
    private Queue<Integer> two;

    public MyStack() {
        one = new LinkedList<>();
        two = new LinkedList<>();
    }

    public void push(int x) {
        one.add(x);
    }

    public int pop() {
        
        while (one.size() > 1) {
            two.add(one.remove());
        }

        int removed = one.remove(); 

        Queue<Integer> temp = one;
        one = two;
        two = temp;

        return removed;
    }

    public int top() {
        while (one.size() > 1) {
            two.add(one.remove());
        }

        int top = one.peek();

        two.add(one.remove()); 

        Queue<Integer> temp = one;
        one = two;
        two = temp;

        return top;
    }

    public boolean empty() {
        return one.isEmpty() && two.isEmpty();
    }
}