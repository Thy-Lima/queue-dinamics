package Interface;

/**
 *
 * @author guinh
 * @param <T>
 */
public interface InterfaceTAD<T> {
    public int sizeQueue();
    public boolean isEmpty();
    public void append(T data);
    public boolean contains(T data);
    public String show();
    public boolean clear();
    public void remove();
    public T pool();
    public T peek();
    public T[] toArray();
    
}
