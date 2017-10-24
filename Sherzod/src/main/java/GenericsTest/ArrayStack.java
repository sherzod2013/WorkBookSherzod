package GenericsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by Sherzod on 10/20/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    private Object[] objects;
    private int capacity;
    private int size;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        size = 0;
        objects = new Object[capacity];
    }

    public static void main(String[] args) {
        ArrayStack<Number> numberArrayStack = new ArrayStack<>(10);
        numberArrayStack.push(1);
        numberArrayStack.push(2);

        ArrayStack<Integer> numberArrayStack1 = new ArrayStack<>(10);
        numberArrayStack1.push(1);
        numberArrayStack1.push(2);


        List<Number> numbers = new ArrayList<>();
        numberArrayStack.pushAll(numbers);

        numberArrayStack1.pushAll(numbers);
    }
    @Override
    public void push(Object element) throws EmptyStackException {
        if(isFool()){
            throw  new EmptyStackException();
        }
        objects[size]=element;
        size++;
    }

    @Override
    public E pop() throws EmptyStackException {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size!=capacity;
    }

    @Override
    public boolean isFool() {
        return size == capacity;
    }

    @Override
    public void pushAll(Collection src) throws EmptyStackException {

    }

    @Override
    public void popAll(Collection dst) throws EmptyStackException {

    }
}
