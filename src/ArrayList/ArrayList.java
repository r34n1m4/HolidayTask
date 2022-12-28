package ArrayList;

import java.util.Arrays;

public class ArrayList {

    private Object[] arrayStore;
    private int actSize = 0;

    public ArrayList(){
        arrayStore = new Object[10];
    }
    //get()
    public Object get(int index){
        if(index < actSize){
            return arrayStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    //add()
    public void add(Object obj){
        if(arrayStore.length-actSize <= 5){
            increaseListSize();
        }
        arrayStore[actSize++] = obj;
    }
    //remove()
    public Object remove(int index){
        if(index < actSize){
            Object obj = arrayStore[index];
            arrayStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                arrayStore[tmp] = arrayStore[tmp+1];
                arrayStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    //size()
    public int size(){
        return actSize;
    }

    private void increaseListSize(){
        arrayStore = Arrays.copyOf(arrayStore, arrayStore.length*2);
        System.out.println("\nNew length: "+ arrayStore.length);
    }
}
