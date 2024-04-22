import com.company.BST;
import com.company.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit Tests for BST
 */
public class BSTTest{
    @Test
   public void containsTestContainsTheSearchValue() {
        BST tree = new BST(new Node(9));
        tree.add(5); tree.add(2); tree.add(4);
        boolean value = tree.contains(4);
        assertTrue(value);
    }

    @Test
    public void containsTestDoesNotContainTheSearchValue() {
        BST tree = new BST(new Node(9));
        tree.add(5); tree.add(2); tree.add(4);
        boolean value = tree.contains(3);
        assertFalse(value);
    }

    /**
     * TO DO: Write a test adds a number into the BST that is already in the tree, therefore returns false
     */
    public void addNumberAlreadyInTree(){

    }

    /**
     * TO DO: Write a test that removes an element from the tree that exists in the tree
     */
    @Test
    public void removeAValueInTree() {
    }

    /**
     * TO DO: Write a test that removes an element not in the tree, and therefore returns false
     */
    @Test
    public void removeAValueNotInTree() {
    }
}