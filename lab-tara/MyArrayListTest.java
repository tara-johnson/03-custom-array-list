import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void addToEmptyListTest() {
        MyArrayList arr = new MyArrayList();
        int val = 36;
        String result = Arrays.toString(arr.add(val));
        System.out.println("Result: " + result);

        String expected = Arrays.toString(new int[] {36, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result) ;
    }

    @Test
    void addToPopulatedList() {
        MyArrayList arr = new MyArrayList();
        arr.add(1);
        arr.add(2);
        int val = 36;
        String result = Arrays.toString(arr.add(val));
        System.out.println("Result: " + result);

        String expected = Arrays.toString(new int[] {1, 2, 36, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result) ;
    }

    @Test
    void addToFullList() {
        MyArrayList arr = new MyArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int val = 36;
        String result = Arrays.toString(arr.add(val));
        System.out.println("Result: " + result);

        String expected = Arrays.toString(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 36});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result) ;
    }

    @Test
    void addAtIndexShiftTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(5);
        arr.add(2);
        arr.add(12);
        String result = Arrays.toString(arr.addAtIndex(8, 2));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {5, 2, 8, 12, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void addAtAvailableIndexTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(5);
        arr.add(2);
        arr.add(12);
        String result = Arrays.toString(arr.addAtIndex(36, 3));
        System.out.println("Result: " + result);

        String expected = Arrays.toString(new int[] {5, 2, 12, 36, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void addAtIndexEmptyArrayTest() {
        MyArrayList arr = new MyArrayList();

        String result = Arrays.toString(arr.addAtIndex(36, 3));
        System.out.println("Result: " + result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 36, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeValueEmptyArrayTest() {
        MyArrayList arr = new MyArrayList();
        int val = 24;
        String result = (Arrays.toString(arr.removeValue(val)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeValueSingleElementTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(24);
        int val = 24;
        String result = (Arrays.toString(arr.removeValue(val)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeValueFirstOccurrenceTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(24);
        arr.add(36);
        arr.add(32);
        arr.add(15);
        arr.add(36);
        int val = 36;
        String result = (Arrays.toString(arr.removeValue(val)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {24, 32, 15, 36, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeAtIndexEmptyTest() {
        MyArrayList arr = new MyArrayList();
        String result = (Arrays.toString(arr.removeAtIndex(16, 1)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeAtIndexSingleElementTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(8);
        String result = (Arrays.toString(arr.removeAtIndex(8, 0)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void removeAtIndexTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(8);
        arr.add(16);
        arr.add(32);
        String result = (Arrays.toString(arr.removeAtIndex(16, 1)));
        System.out.println("Result" + result);

        String expected = Arrays.toString(new int[] {8, 32, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("Expected" + expected);
        assertEquals(expected, result);
    }

    @Test
    void emptyArraySize() {
        MyArrayList arr = new MyArrayList();
        int result = arr.size();
        System.out.println("Result: " + result);

        int expected = 0;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void sizeSingleElementTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(5);
        int result = arr.size();
        System.out.println("Result: " + result);

        int expected = 1;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void sizeFullArrayTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(12);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(24);
        arr.add(62);
        arr.add(1);
        arr.add(90);
        arr.add(7);
        arr.add(4);
        int result = arr.size();
        System.out.println("Result: " + result);

        int expected = 10;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }

    @Test
    void getEmptyArrayTest() {
        MyArrayList arr = new MyArrayList();
        int result = arr.get(7);
        System.out.println("Result: " + result);

        int expected = 0;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result) ;
    }

    @Test
    void getSingleElementArrayTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(69);
        int result = arr.get(0);
        System.out.println("Result: " + result);

        int expected = 69;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result) ;
    }

    @Test
    void getFullArrayTest() {
        MyArrayList arr = new MyArrayList();
        arr.add(12);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(24);
        arr.add(62);
        arr.add(1);
        arr.add(90);
        arr.add(7);
        arr.add(4);
        int result = arr.get(9);
        System.out.println("Result: " + result);

        int expected = 4;
        System.out.println("Expected: " + expected);
        assertEquals(expected, result);
    }
}