public class Node {

    Node root;
    Node left;
    Node right;
    char value;

    public Node(char value) {
        this.value = value;
    }

    public static boolean breadthValues(Node root, char target) {

        // iterative method


//		Queue<Node> queue = new LinkedList<>();
//		queue.add(root); // added the first node value
//
//		while (!queue.isEmpty()) {
//			Node current = queue.poll();
//			if(current.value == target) {
//				return true;
//			}
//
//			if (current.left != null)
//				queue.add(current.left);
//			if (current.right != null)
//				queue.add(current.right);
//
//
//		}
//
//		return false;


        // recursion method...

        if (root == null) return false;
        if (root.value == target) return true;
        return breadthValues(root.left, target) || breadthValues(root.right, target);


    }

    public static void main(String[] args) {
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        Node node4 = new Node('d');
        Node node5 = new Node('e');
        Node node6 = new Node('f');

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        System.out.println(breadthValues(node1, 'a'));

    }

}


