package arraylist;

import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(int size, Object[] elements){
        this.size = size;
        this.elements = elements;
    }
    public MyList(){
        size = 0;
        elements =new Object[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getDefaultCapacity(){
        return DEFAULT_CAPACITY;
    }
    public Object getElement(){
        return elements;
    }
    public void setElements(E[] elements){
        this.elements=elements;
    }
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf((elements),newSize);
        size = newSize;
    }
    public E get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException("Index: "+ index+", size: "+index);
        }
        return (E) elements[index];
    }
    public void printArray() {
        for (int index = 0; index < size; index++) {
            System.out.println(elements[index]);
        }
    }

    public void add(int index, E element){
        E temp1 = (E) elements[index];
        elements[index] = element;
        for(int count = index; count<=size; count++){
            E temp2 = (E) elements[count];
            elements[count]=temp1;
            temp1=temp2;
        }
        size++;
    }
    public boolean add(E element){
        boolean check = false;
        if(size == DEFAULT_CAPACITY){
            return false;
        }else{
            elements[size] = element;
            size++;
            check = true;
        }
        return check;
    }
    public E remove(int index){
        E element = (E) elements[index];
        for(int count = index; count<size-1;count++){
            elements[count] = elements[count+1];
        }
        size--;
        return element;
    }
    public boolean contains(E element){
        boolean check = false;
        for(Object ele: elements){
            if((E)ele == element){
                check = true;
                break;
            }
        }
        return check;
    }
    public void clear(){
        for(Object element:elements){
            element = null;
        }
        elements=null;
    }
}
