package edu.cscc;

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
    public void add(Object value){
        Object[] newArray = new Object[array.length + 1];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
    }


//    Add the given element, value, to the list at the given index
    public void add(int index, Object value){
    if (array.length > array.size()){
        Object[] newArray = new Object[2 * array.length];
    }else{
//        do nothing
    }

    }
//    Add check to determine if array is full
//    After
//    this operation is complete, get(index) will return value. This
//    operation is only valid for 0 <= index <= size().
//    Whenever the array fills, double the size.


//    Get method
    public Object get(int index){
        return array[index];
    }


//    Remove method
    public Object remove(Object value){
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
//    Removes and returns the first occurrence of the specified element from
//    this list, if it is present.


//    Remove and return the element with the given index from the list
    public Object remove(int index){
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
