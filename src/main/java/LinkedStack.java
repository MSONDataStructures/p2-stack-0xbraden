/**
 * A {@link LinkedStack} is a stack that is implemented using
 * a Linked List structure to allow for unbounded size.
 * <p></p>
 * The {@code isEmpty} and {@code size} methods are provided,
 * on the house.
 * @param <T> the elements stored in the stack
 */
public class LinkedStack<T> implements StackInterface<T> {
    Node<T> first;
    int size;

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T element = first.getElement();
        first = first.getNext();
        size--;
        return element;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return first.getElement();
    }

    @Override
    public void push(T elem) throws NullPointerException {
        if (elem == null) {
            throw new NullPointerException("Can't push null");
        }
        Node<T> newNode = new Node<>(elem);
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}