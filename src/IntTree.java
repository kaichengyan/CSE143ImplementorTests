public class IntTree {

    private IntTreeNode root;

    public IntTree() {

    }

    public IntTree(int rootData) {
        this.root = new IntTreeNode(rootData);
    }

    private static class IntTreeNode {
        public final int data;
        public IntTreeNode left;
        public IntTreeNode right;

        public IntTreeNode(int data) {
            this(data, null, null);
        }

        public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

}
