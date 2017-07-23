package LinkedList;

import java.util.Iterator;


public class ListIterator<T> implements Iterator {
    Node<T> curr;

    public ListIterator(Node head){

        curr = head;
    }

    @Override
    public boolean hasNext() {

        return curr != null;
    }

    @Override
    public T next() {
       T res=curr.getData();
        curr=curr.next;
        return res;
    }

    @Override
    public void remove() {

    }


}
