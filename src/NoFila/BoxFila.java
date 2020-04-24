package NoFila;

/**
 *
 * @author guinh
 * @param <T>
 */
public class BoxFila<T> {
    protected T data;
    protected BoxFila<T> next;
    
    public BoxFila(T data){
        this.data = data;
        this.next = null;
    }
    
    public BoxFila(BoxFila<T> newBox){
        this.data = newBox.data;
        this.next = null;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public void setNext(BoxFila<T> next){
        this.next = next;
    }
    
    public T getData(){
        return this.data;
    }
    
    public BoxFila<T> getNext(){
        return this.next;
    }
    
}
