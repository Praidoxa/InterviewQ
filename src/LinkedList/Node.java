package LinkedList;

/**
 * Created by praidoxa on 03.03.17.
 */
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> previous;
    // constractor getters and setters
//constractor
    public Node(T data) {
        this.data = data;
    }


//setters getters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
