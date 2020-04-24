package Fila;

/**
 *
 * @author guinh
 * @param <T>
 */
import Interface.InterfaceTAD;
import NoFila.BoxFila;

public class Fila<T> implements InterfaceTAD<T>  {
    private BoxFila<T> head;
    
    public Fila(){
        this.head = null;
    }

    @Override
    public int sizeQueue() {
        int size = 0;
        
        if(this.head == null){
            return size;
        }
        else{
            size++;
            BoxFila temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
                size++;
            }
            
            return size;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.sizeQueue() == 0;
    }

    @Override
    public void append(T data) {
        BoxFila newBox = new BoxFila(data);
        if(this.head == null){
            this.head = newBox;
        }
        else{
            BoxFila temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            
            temp.setNext(newBox);
        }
    }

    @Override
    public boolean contains(T data) {
        if(this.head != null){
            BoxFila temp = this.head;
            while(temp.getNext() != null){
                if(temp.getData().equals(data)){
                    return true;
                }
                
                temp = temp.getNext();
            }
        }
        
        return false;
    }

    @Override
    public String show() {
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        if(this.head != null){
            BoxFila temp = this.head;
            while(temp.getNext() != null){
                s.append("").append(temp.getData());
                
                if(temp.getNext() != null){
                    s.append(", ");
                }
                
                temp = temp.getNext();
            }
        }
        
        s.append("]");
        
        return s.toString();
    }

    @Override
    public boolean clear() {
        if(this.head != null){
            this.head = null;
            return true;
        }
        
        return false;
    }

    @Override
    public void remove() {
        if(this.head != null){
            BoxFila temp = this.head;
            this.head = this.head.getNext();
            temp = null;
        }
    }

    @Override
    public T pool() {
        if(this.head != null){
            T data = this.head.getData();
            BoxFila temp = this.head;
            this.head = this.head.getNext();
            temp = null;
            return data;
        }
        
        return null;
    }

    @Override
    public T peek() {
        if(this.head != null){
            return this.head.getData();
        }
        
        return null;
    }

    @Override
    public T[] toArray() {
        if(this.head != null){
            T[] dataQueue = (T[]) new Object[this.sizeQueue()];
        
            BoxFila temp = this.head;
            int index = 0;
            while(temp.getNext() != null){
                dataQueue[index] = (T) temp.getData();
                index++;
                temp = temp.getNext();
            }
            
            return dataQueue;
        }
        
        return null;
    }
    
}
