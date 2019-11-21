package edu.cscc;

import java.util.Arrays;

public class ArrayList {
    private Object[] array;


//    Empty ArrayList object
    public ArrayList() {
        this.array = new Object[2];
    }


//    Size method
    public int size(){
        int elements = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                elements++;
            }
        }
        return elements;
    }


//    Return true if this ArrayList has no items
    public boolean isEmpty() {
        return ArrayList.this.size() == 0;
    }


//    Add the given element, value, to the end of the list
    public void addEnd(Object value){
        if (array.length > this.size()) {
            array[this.size()] = value;
        } else {
            if (array.length == this.size()) {
                array = Arrays.copyOf(array, 2 * this.size());
                array[this.size()] = value;
            }
        }
    }


    //    Add the given element, value, to the list at the given index
    public void addIndex(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.  Please select valid index.");
        }
        boolean currentIndex = false;
        boolean foundIndex = false;
        Object[] newArray = new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                currentIndex = true;
            }
            if (currentIndex == false) {
                newArray[i] = array[i];
            }
            if (foundIndex == true) {
                newArray[i + 1] = array[i];
            }
        }
        array = newArray;
    }


//    Get method
    public Object get(int index){
        return array[index];
    }


//    Remove method
    public Object removeFirst(Object value){
        boolean removedIndex = false;
        Object removedElement = null;
        Object[] newArray = new Object[array.length - 1];
        for(int i = 0; i < array.length - 1; i++) {
            if (value.equals(array[i])) {
                removedIndex = true;
                removedElement = array[i];
            }
            if (removedIndex == false) {
                newArray[i] = array[i];
            }
            if (removedIndex == true) {
                newArray[i] = array[i + 1];
            }
        }
        if (removedIndex == false) {
            return null;
        } else {
            array = newArray;
            return removedElement;
        }
    }


//    Remove and return the element with the given index from the list
    public Object removeIndex(int index){
        boolean removedIndex = false;
        Object removedElement = array[index];
        Object[] newArray = new Object[array.length - 1];

        for(int i = 0; i < array.length - 1; i++) {
            if (i == index) {
                removedIndex = true;
            }
            if (removedIndex == false) {
                newArray[i] = array[i];
            }
            if (removedIndex == true) {
                newArray[i] = array[i + 1];
            }
        }
        array = newArray;
        return removedElement;
    }


//    Clear method
    public void clear(){
        Object[] clearArray = new Object[2];
        array = clearArray;
    }

 }
