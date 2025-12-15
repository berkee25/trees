public class Main {
    public static void main(String[] args) {

        BasicTree tree = new BasicTree();

        // Tree creation
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder: ");
        tree.preorder(tree.root);

        System.out.print("\nInorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);

        System.out.println("\nHeight: " + tree.height(tree.root));

        System.out.println(
                "Depth of node 5: " +
                        tree.depth(tree.root, tree.root.left.right, 0)
        );
    }
}
