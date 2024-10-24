package no.ntnu.idata2302.lab04;

import java.util.ArrayList;

public class Heap {

    public static Heap fromValues(int... values) {
        var heap = new Heap();
        for (var each : values) {
            heap.insert(each);
        }
        return heap;
    }

    private ArrayList<Integer> array;

    public Heap() {
        array = new ArrayList<Integer>();
        array.add(0);
    }

    public void insert(Integer k) {
        int i = 0;
        while(array.get(i) < k && i < array.size() - 1) {
            i++;
        }
        array.add(i, k);
    }

    public int takeMinimum() {
        Integer minimum = array.get(0);
        array.remove(0);
        return minimum;
    }

    public void decreaseKey(int i, int k) {
        if (!array.contains(k)) {
            throw new RuntimeException("Element doesn't appear in tree");
        } else if (array.indexOf(k) >= i) {
            throw new RuntimeException("New key cannot be equal or grater than previous key");
        }
        array.remove(k);
        array.add(i,k);
    }

    private int parentOf(int index) {
        return index / 2;
    }

    private int leftChildOf(int index) {
        return index * 2;
    }

    private int rightChildOf(int index) {
        return index * 2 + 1;
    }

    void swap(int pos1, int pos2) {
        int temp = array.get(pos1);
        array.set(pos1, array.get(pos2));
        array.set(pos2, temp);
    }
}
