import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @org.junit.jupiter.api.Test
    void insertAndSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);

        assertTrue(bst.search(5));
        assertTrue(bst.search(3));
        assertTrue(bst.search(7));
        assertTrue(bst.search(2));
        assertTrue(bst.search(1));

        assertFalse(bst.search(4));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);

        // Delete a leaf node
        bst.delete(1);
        assertFalse(bst.search(1));

        // Delete a node with one child
        bst.delete(4);
        assertFalse(bst.search(4));

        // Delete a node with two children
        bst.delete(4);
        assertFalse(bst.search(4));
    }
}