import java.util.ArrayList;
import java.util.List;

public class TraverseTree {
    Node root;
    List<Integer> order = new ArrayList<Integer>();

    TraverseTree() {
        root = null;
    }
    
    List<Integer> getOrder() {
        return order;
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");
        order.add(node.key);

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Wrapper over above recursive function
    List<Integer> printPreorderTree() {
        printPreorder(root);
        return getOrder();
   }
}




