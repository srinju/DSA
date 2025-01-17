package stack;

import java.util.ArrayList;

public class StackArrayList {

    static class stack {

        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public void push(int data) {
            list.add(data);
        }

        //pop
        public void pop() {
            if (!isEmpty()) {
                list.remove(list.size() - 1); // Removes the last element in the list
            } else {
                System.out.println("Stack is empty, cannot pop.");
            }
        }

        //peek
        public int peek() {
            if (!isEmpty()) {
                return list.get(list.size() - 1); // Returns the last element in the list
            } else {
                throw new IllegalStateException("Stack is empty, cannot peek.");
            }
        }
    }

    public static void main(String[] args) {

        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
