public class BST{
    static class Node {
        int data;
        Node right;
        Node left;
        Node(int data) {
            this.data = data;
        }
    }
    public Node insert(Node root,int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);        
    }
    public boolean search(Node root,int val) {
        if(root == null){
            return false;
        }
        if(root.data > val){
            search(root.left, val);
        }else if(root.data < val){
            search(root.right, val);
        }else if(root.data == val){
            return true;
        }
        return true;        
    }
    public Node delete(Node root,int val){
        
        return root;
    }
    public static void main(String[] args) {
        int[] arr={5,7,2,4,1,6,9};
        Node root = null;
        BST bst = new BST();
        for(int i=0;i<arr.length;i++)
        {
            root = bst.insert(root, arr[i]);
        }
        bst.inorder(root);
        System.out.println(bst.search(root, 4));
        bst.inorder(root);
        
    }
}