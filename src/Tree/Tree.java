package Tree;

import java.util.Iterator;

public class Tree implements Iterable<Integer>{
    int data;
    Tree parent;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
    }

    public boolean add(int data) {
        if (this.data == data) return false;
        Tree newTree=new Tree(data);
        if (data < this.data) {
            if (left == null) {

                left = newTree;
                newTree.parent=this;
                return true;
            }
            return left.add(data);
        } else {
            if (right == null){
                right=newTree;
                newTree.parent=this;
                return true;
            }
        return right.add(data);
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new TreeIterator(parent);
    }

    public int size(){
        int res=1;
        if(left != null)
            res +=left.size();
        if (right != null)
            res +=right.size();
        return res;
    }
}
