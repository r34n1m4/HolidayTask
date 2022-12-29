package ArrayList;

import java.util.Arrays;

public class ArrayList {
    //array storage
    private Object[] arrayStore;
    //array actual size
    private int actualSize = 0;

    public ArrayList(){
        arrayStore = new Object[10];
    }
    //get()
    public Object get(int index){
        if(index < actualSize){
            return arrayStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    //add()
    public void add(Object object){
        //perform check for increasing array size
        if(arrayStore.length - actualSize <= 5){
            increaseListSize();
        }
        arrayStore[actualSize++] = object;
    }
    //remove()
    public Object remove(int index){
        if(index < actualSize){
            Object object = arrayStore[index];
            arrayStore[index] = null;
            int temp = index;
            while(temp < actualSize){
                arrayStore[temp] = arrayStore[temp + 1];
                arrayStore[temp + 1] = null;
                temp++;
            }
            actualSize--;
            return object;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    //size()
    public int size(){
        return actualSize;
    }
    //increasing array size by 5 to not run out of insertions
    private void increaseListSize(){
        arrayStore = Arrays.copyOf(arrayStore, arrayStore.length + 5);
        System.out.println("\nNew length: "+ arrayStore.length);
    }
}
