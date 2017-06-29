package LinkedList;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    Node<T> head;
    Node<T> end;
    @Override
    public Iterator<T> iterator() {

        return new ListIterator(head);
    }
    public void add(T obj) {
        Node<T> node = new Node<T>(obj);
        Node<T> curr = null;
        if (head == null) {
            head = node;
            head.next =end;
        } else if(end==null){
          end =node;
          end.previous=head;
        }
        else {
            end.next=node;
            node.previous=end;
            end=node;
        }
    }
    public void addFirst(T obj) {
        Node<T> node = new Node<T>(obj);
        node.next = head;
        head = node;
    }
    public void reverse() {
        Node<T> newHead = null;
        if (head == null || head.next == null)
            return;
        Node<T> curr = head;
        while (curr != null) {
            Node<T> next = curr.next;
            curr.next = newHead;
            newHead = curr;
            curr = next;
        }
        head = newHead;
    }
    public boolean hasLoop() {
        if (head == null)
            return false;
        Node<T> slow = head, fast = head.next;
        while (fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }

    public void reverce1() {
        if (head == null || head.next == null)
            return;
        Node<T> point1 = null;
        Node<T> point2 = head.next;
        while (point2 != null) {
            head.next = point1;
            point1 = head;
            head = point2;
            point2 = point2.next;
        }
    }

}
