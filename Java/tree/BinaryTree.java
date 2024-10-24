public class BinaryTree {
    Node root;

    BinaryTree(){
        root=null;
    }

   // postorder(root->left)
   // postorder(root->right)
   // display(root->data)

    void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+" --> ");

    }

    // inorder(root->left)
    // display(root->data)
    // inorder(root->right)

    void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data+" --> ");
        inOrder(node.right);
    }

   // display(root->data)
   // preorder(root->left)
   // preorder(root->right)

    void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data+" --> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left= new Node(4);
        binaryTree.root.left.right= new Node(5);

        System.out.println("Inorder traversal");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("\nPreorder traversal ");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\nPostorder traversal");
        binaryTree.postOrder(binaryTree.root);
    }
}
