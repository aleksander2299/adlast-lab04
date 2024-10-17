package no.ntnu.idata2302.lab04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTTest {

    private BST tree;

    @Before
    public void setup() {
        tree = BST.fromValues(5, 2, 7, 4, 8);
    }

    @Test
    public void size() {
        assertEquals(5, tree.size());
    }

    @Test
    public void containItemThatWereInserted() {
        assertTrue(tree.contains(7));
    }

    @Test
    public void noItemThatWasNotInserted() {
        assertFalse(tree.contains(9));
    }

    @Test
    public void insertANewMinimum() {
        tree.insert(0);
        assertTrue(tree.contains(0));
    }

    @Test
    public void insertANewMaximum() {
        tree.insert(15);
        assertTrue(tree.contains(15));
    }

    @Test
    public void deleteRemoveMaximum() {
        assertTrue(tree.contains(8));
        tree.delete(8);
        assertFalse(tree.contains(8));
    }

    @Test
    public void deleteRoot() {
        tree.delete(5);
        assertFalse(tree.contains(5));
    }

    @Test
    public void findMinimum() {
        assertEquals(2, tree.minimum());
    }

    @Test
    public void findMaximum() {
        assertEquals(8, tree.maximum());
    }

}
