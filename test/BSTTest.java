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
    @Test
    public void addNumberAlreadyInTree(){
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        boolean value = tree.add(4);
        assertFalse(value);
    }
    @Test
    public void displayPreOrder(){
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        tree.displayPreOrder();
    }

    @Test
    public void displayInOrder(){
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        tree.displayInOrder();
    }

    @Test
    public void displayPostOrder(){
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        tree.displayPostOrder();
    }
    /**
     * TO DO: Write a test that removes an element from the tree that exists in the tree
     */
    @Test
    public void removeAValueInTree() {
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        boolean answer = tree.remove(4);
        assertTrue(answer);
        //THIS DOES NOT WORK
    }

    /**
     * TO DO: Write a test that removes an element not in the tree, and therefore returns false
     */
    @Test
    public void removeAValueNotInTree() {
        BST tree = new BST(new Node(7));
        tree.add(3); tree.add(4); tree.add(2);
        boolean answer = tree.remove(5);
        assertFalse(answer);
    }
}