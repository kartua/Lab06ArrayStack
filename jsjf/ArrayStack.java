package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * An array implementation of a stack in which the bottom of the stack is fixed
 * at index 0.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class ArrayStack<T> implements StackADT<T> {

    private final static int DEFAULT_CAPACITY = 100;

    private int top;
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity the initial size of the array
     */
    public ArrayStack(int initialCapacity) {
        top = 0;
        //we cannot creathe new T so we crate new Object and cast it to T
        stack = (T[]) (new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the top of this stack, expanding the
     * capacity of the array if necessary.
     *
     * @param element generic element to be pushed onto stack
     */
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    /**
     * Creates a new array to store the contents of this stack with twice the
     * capacity of the old one.
     */
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    /**
     * Removes the element at the top of this stack and returns a reference to
     * it.
     *
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack. The element
     * is not removed from the stack.
     *
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        return stack[top - 1];
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     *
     * @return true if this stack is empty
     */
    public boolean isEmpty() {

        // To be completed as a Programming Project
        if (stack[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in the stack
     */
    public int size() {
        // To be completed as a Programming Project
        int i = 0;
        while (i < stack.length && stack[i] != null) {
            i++;
        }
        return i;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return a string representation of the stack
     */
    public String toString() throws EmptyCollectionException {
        // To be completed as a Programming Project
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }
        String output = "[";
        for (int i = 0; i <= size() - 1; i++) {
            output += stack[i].toString() + ", ";
        }
        output = output.substring(0,output.length()-2) + "]";
        return output;
    }
}
