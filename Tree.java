public class Tree {
    private TreeNode root;

    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            
        }
    }
    public Tree(){
        this.root = null;
    }
    public void createBinaryTree(){
        TreeNode first =  new TreeNode(1);
        TreeNode second =  new TreeNode(2);
        TreeNode third =  new TreeNode(3);
        TreeNode fourth =  new TreeNode(4);
        TreeNode fifth =  new TreeNode(5);

        root=first;
        first.left = second;
        first.right = third;
        third.left = fourth;
        second.left = fifth;
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data+"-->");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.data+"-->");
        preOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data+"-->");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.createBinaryTree();
        tree.preOrder(tree.root);
    }
}
