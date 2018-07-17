public class MyArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    // Constructor that creates an array with a default size
    public MyArrayList () {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    // Parameterized constructor that allows users to specify how large the intial array should be
    public MyArrayList (int customSize) {
        this.data = new int[customSize];
        this.elements = 0;
    }

    // Adds the value to the end of the list
    // The end of the list is the first index that doesn't currently have a value
    // Returns the list with the new value at the end of the list
    public int[] add (int val) {
        this.data[this.elements] = val;
        this.elements++;

        return this.data;
    }

    // Adds the val at a specified index, replacing the original value at that index
    // Shifts other elements to make room
    // Returns the list with the new value at the specified index
    public int[] addAtIndex (int val, int index) {
        this.data[index] = val;



        this.elements++;
        return this.data;
    }

    // Removes the first occurrence of a specified value from the list
    // Shift elements to remove gaps
    // Returns the updated list
    public int[] removeValue (int val) {
        int i = 0;

        while (this.data[i] != val) {
            i++;
        }

//        for (i = 0; i < data.length; i++) {
//            if (data[i] == 0) {
//                System.out.println("i equal zero at index: " + data[i]);
//            }
//        }

        this.data[i] = 0;
        this.elements--;
        return this.data;
    }

    // Removes the value at the specified index
    // Shift elements to remove gaps
    // Returns the updated list
    public int[] removeAtIndex (int val, int index) {
        this.data[index] = 0;
        this.elements--;

        return this.data;
    }

    // Returns the number of elements in the array
    public int size () {
        return this.elements;
    }

    // Returns the value of the index in the array
    public int get (int index) {
        return this.data[index];
    }
}