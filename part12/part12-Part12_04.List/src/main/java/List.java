/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 * @param <Type>
 */
public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // Not found
        }
        // If found
        moveToLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public Type value(int index) {
        if (index < 0 || index > this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }

    private void grow() {
        // Get new array size
        int newSize = (int) (this.values.length * 1.5);
        // Create new array with new size above
        Type[] newArray = (Type[]) new Object[newSize];
        // Copy elements from old to new array
        for (int i = 0; i < this.values.length; i++) {
            newArray[i] = this.values[i];
        }
        // Discard old array and point to new array
        this.values = newArray;
    }
    
    public int indexOfValue(Type value) {

        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i] == value && this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

}
