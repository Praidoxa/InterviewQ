package SerializeAndDeserializeTree;



public class TestNode {
    public static void main(String[] args) {

        Node  node = new Node(3);
        node.left = new Node(2);
        node.left.left = new Node(4);
        System.out.println(node.serialize());

        Node node1 = new Node();
        node1.deserialize("3,2,4,#,#,#,#");
    }
}
