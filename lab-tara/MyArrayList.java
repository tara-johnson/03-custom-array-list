import java.util.Arrays;

public class MyArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;
    private int elements;

    // Constructor that creates an array with a default size
    public MyArrayList () {
        this.data = new int[DEFAULT_SIZE];
        this.elements = 0;
    }

    // Parameterized constructor that allows users to specify how many elements should be in the initial array
    public MyArrayList (int customSize) {
        this.data = new int[customSize];
        this.elements = 0;
    }

    // Adds a value to the end of the list
    // The end of the list is the first index that doesn't currently have a value
    // Returns the list with the new value at the end of the list
    public int[] add (int val) {
        if (this.elements >= DEFAULT_SIZE) {
            int[] arr2 = new int[this.elements + 1];
            for (int i = 0; i < this.elements; i++) {
                arr2[i] = data[i];
                arr2[this.elements] = val;
            }
            return arr2;
        }
        this.data[this.elements] = val;
        this.elements++;
        return data;
    }

    // Adds the val at a specified index
    // Shifts other elements to make room
    // Returns the list with the new value at the specified index
    public int[] addAtIndex (int val, int index) {
        int[] tempArr = new int[data.length];
        int rightOfIndex = (data.length - 1) - index;

        for (int i = 0; i < index; i++) {
            tempArr[i] = data[i];
        }

        tempArr[index] = val;
        this.elements++;

        for (int i = index; i <= rightOfIndex; i++){
            tempArr[i + 1] = data[i];
        }

        return tempArr;
    }

    // Removes the first occurrence of a specified value from the list
    // Shift elements to remove gaps
    // Returns the updated list
    public int[] removeValue (int val) {
        int i = 0;

        while (this.data[i] != val && i < this.data.length - 1) {
            i++;
        }

        int[] tempArr = new int[data.length];
        if (this.data[i] == val) {
            int index = i;
            System.out.println("Index: " + index);
            this.data[i] = 0;
            this.elements--;

            int rightOfIndex = (data.length - 1) - index;

            for (i = 0; i < index; i++) {
                tempArr[i] = data[i];
            }

            for (i = index + 1; i < rightOfIndex + 1; i++){
                tempArr[i - 1] = data[i];
            }
        }
        return tempArr;
    }

    // Removes the value at a specified index
    // Shift elements to remove gaps
    // Returns the updated list
    public int[] removeAtIndex (int val, int index) {
        this.data[index] = val;
        this.data[index] = 0;
        this.elements--;

        int[] tempArr = new int[data.length];
        int rightOfIndex = (data.length - 1) - index;

        for (int i = 0; i < index; i++) {
            tempArr[i] = data[i];
        }

        for (int i = index + 1; i < rightOfIndex + 1; i++){
            tempArr[i - 1] = data[i];
        }

        return tempArr;
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