package SerializeAndDeserializeTree;

import java.util.LinkedList;

public class Node {
    Node left;
    Node right;
    int value;

    public Node(){};
    public Node(int value) {
        this.value = value;
    }

    // Encode a tree to a single string
    public String serialize() {

        if (this == null)
            return "";
        StringBuilder sb = new StringBuilder();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            Node t = queue.poll();
            if (t != null) {
                sb.append(String.valueOf(t.value) + ",");
                queue.add(t.left);
                queue.add(t.right);
            } else {
                sb.append("#,");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    //Decode a string to a tree
    public void  deserialize(String str) {
        if (str == null || str.length() == 0)
            return;

        String[] arr = str.split(",");
        this.value = Integer.valueOf(arr[0]);
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this);

        int i = 1;
        while (!queue.isEmpty()) {
            Node t = queue.poll();
            if (t == null)
                continue;

            if (!arr[i].equals("#")) {
                t.left = new Node(Integer.valueOf(arr[i]));
                queue.offer(t.left);
            } else {
                t.left = null;
                queue.offer(null);
            }
            i++;
            if (!arr[i].equals("#")) {
                t.right = new Node(Integer.valueOf(arr[i]));
                queue.offer(t.right);
            } else {
                t.right = null;
                queue.offer(null);
            }
            i++;
        }

    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
