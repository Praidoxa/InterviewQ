package LinkedList;

/**
 * Created by praidoxa on 27.05.17.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(8);

        ListIterator iterator = (ListIterator) list.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
