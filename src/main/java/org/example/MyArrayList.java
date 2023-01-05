package org.example;

public class MyArrayList {
    private int size = 0;

    public String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    private String[] array = new String[10];
//6.
    public void add(String s){
        array[size] = s;
        size++;
        if (size==array.length){
            String[] newArray = new String[array.length*2];
            for(int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }
//7.
    public void remove(int index) {
        if (index >= 0 && index < size) { //9.
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
//8.
        public String get ( int index) { //9.
            if (index >= 0 && index < size) {
                return array[index];
            }
            return "Элемент не найден";
        }
//10.
        public void remove(String s){
            for (int i=0; i<array.length;i++){
                if(array[i]==s){
                    remove(i);
                }
            }
        }
    }


