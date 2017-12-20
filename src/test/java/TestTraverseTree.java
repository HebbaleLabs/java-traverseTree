import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTraverseTree {
    
    @Test
    public void testTraverseTreePreorder() {
        List<Integer> expectedOrder = new ArrayList<Integer>(Arrays.asList(1,2,4,6,7,5,3));
        TraverseTree tree = new TraverseTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7); 
        List<Integer> actualOrder = tree.printPreorderTree();
        assertEquals(expectedOrder, actualOrder);     
    }
    
    @Test
    public void testTraverseTreePreorderNegative() {
        List<Integer> expectedOrder = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        TraverseTree tree = new TraverseTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5); 
        List<Integer> actualOrder = tree.printPreorderTree();
        assertEquals(expectedOrder, actualOrder);
    }
}





