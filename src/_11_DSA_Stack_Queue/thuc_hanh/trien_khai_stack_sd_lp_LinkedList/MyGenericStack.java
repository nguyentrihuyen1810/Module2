package _11_DSA_Stack_Queue.thuc_hanh.trien_khai_stack_sd_lp_LinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    private boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    protected static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3. Size of stack after pop operations: " + stack.size());
    }

    protected static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3. Size of stack after pop operations: " + stack.size());
    }
}
