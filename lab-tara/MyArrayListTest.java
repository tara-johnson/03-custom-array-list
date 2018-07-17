import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void add() {
        MyArrayList arr = new MyArrayList();
        int val = 36;
        String result = Arrays.toString(arr.add(val));

        String expected = Arrays.toString(new int[] {36, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(expected, result) ;
    }

    @Test
    void addAtIndex() {
        MyArrayList arr = new MyArrayList();
        arr.addAtIndex(12, 2);
        arr.addAtIndex(8, 9);
        arr.addAtIndex(45, 4);
        String result = Arrays.toString(arr.addAtIndex(36, 4));
        System.out.println(result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 36, 0, 0, 0, 0, 0});
        assertEquals(expected, result);
    }

    @Test
    void removeValue() {
        MyArrayList arr = new MyArrayList();
        arr.add(24);
        arr.add(0);
        arr.add(36);
        arr.add(24);
        arr.add(15);
        System.out.println("Input: " + Arrays.toString(arr.add(36)));
        int val = 36;
        String result = (Arrays.toString(arr.removeValue(val)));

        String expected = Arrays.toString(new int[] {24, 15, 24, 15, 36, 0, 0, 0, 0, 0});
        assertEquals(expected, result);
    }

    @Test
    void removeAtIndex() {
        MyArrayList arr = new MyArrayList();
        int val = 36;
        int index = 8;
        arr.addAtIndex(val, index);
        String result = (Arrays.toString(arr.removeAtIndex(val, index)));

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(expected, result);
    }

    @Test
    void emptySize() {
        MyArrayList arr = new MyArrayList();
        int result = arr.size();

        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void size() {
        MyArrayList arr = new MyArrayList();
        System.out.println(Arrays.toString(arr.add(5)));
        int result = arr.size();

        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void size2() {
        MyArrayList arr = new MyArrayList();
        arr.add(5);
        arr.add(10);
        System.out.println(Arrays.toString(arr.add(99)));
        int result = arr.size();

        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void get() {
        MyArrayList arr = new MyArrayList();
        int val = 69;
        arr.add(val);
        int result = arr.get(0);

        int expected = 69;
        assertEquals(expected, result) ;
    }

    @Test
    void get2() {
        MyArrayList arr = new MyArrayList();
        arr.addAtIndex(12, 3);
        int result = arr.get(3);

        int expected = 12;
        assertEquals(expected, result);
    }
}