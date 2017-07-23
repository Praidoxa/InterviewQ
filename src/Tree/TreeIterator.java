package Tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeIterator implements Iterator<Integer> {
    Tree current;

    public TreeIterator(Tree root){
        if(root!= null){
            //for(current = root; current.left != null; current=current.left){}
            current=root;
            while (current.left!=null){
                current=current.left;
            }
        }
    }
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        if (current == null)
            new NoSuchElementException();
        int data = current.data;
        if (current.right != null){
            current=current.right;
            while (current.left != null){
                current=current.left;
            }
        }
        else{
            current=current.parent;
            while (current!=null && data >current.data){
                current=current.parent;
            }
        }
        return data;
    }

    @Override
    public void remove() {

    }
}
