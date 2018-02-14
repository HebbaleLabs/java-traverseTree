package com.talfinder.assessment;

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
    }

    // Wrapper over above recursive function
    List<Integer> printPreorderTree() {
        printPreorder(root);
        return getOrder();
   }
}




