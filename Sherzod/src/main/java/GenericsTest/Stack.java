package GenericsTest;

import java.util.Collection;
import java.util.EmptyStackException;

/**
 * Created by Sherzod on 10/19/2017.
 */
public interface Stack<E> {
    void push(E element) throws EmptyStackException;
    E pop() throws EmptyStackException;
    E peek();
    int getSize();
    boolean isEmpty();
    boolean isFool();
    void pushAll(Collection<E> src) throws EmptyStackException;
    void popAll(Collection<E> dst) throws EmptyStackException;
}
