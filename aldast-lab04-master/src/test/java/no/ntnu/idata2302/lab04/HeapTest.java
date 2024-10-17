package no.ntnu.idata2302.lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeapTest {

    @Test
    public void returnsTheMinimum() {
        var heap = Heap.fromValues(10, 20, 5, 23, 9);

        var minimum = heap.takeMinimum();

        assertEquals(5, (int) minimum);
    }

    @Test
    public void insertANewMinimum() {
        var heap = Heap.fromValues(10, 20, 5, 23, 9);

        heap.insert(2);

        var minimum = heap.takeMinimum();
        assertEquals(2, (int) minimum);
    }

    @Test
    public void insertAnotherLargerValue() {
        var heap = Heap.fromValues(10, 20, 5, 23, 9);

        heap.insert(25);

        var minimum = heap.takeMinimum();
        assertEquals(5, (int) minimum);
    }

    @Test
    public void extractMinimumFindTheNextMinimum() {
        var heap = Heap.fromValues(10, 20, 5, 23, 9);

        heap.takeMinimum();
        var minimum = heap.takeMinimum();

        assertEquals(9, (int) minimum);
    }

}
