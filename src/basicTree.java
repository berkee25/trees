class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BasicTree {
    Node root;

    BasicTree() {
        root = null;
    }

    void insert(Node node) {
        if (node == null)
            return;

        insert(node.left);
        System.out.print(node.data + " ");
        insert(node.right);
    }
    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    int height(Node node) {
        if (node == null)
            return -1;

        return 1 + Math.max(
                height(node.left),
                height(node.right)
        );
    }
    int depth(Node root, Node target, int level) {
        if (root == null)
            return -1;

        if (root == target)
            return level;

        int left = depth(root.left, target, level + 1);
        if (left != -1)
            return left;

        return depth(root.right, target, level + 1);
    }

}
