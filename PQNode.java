public class PQNode<T> {
    public T data;
    public int priority;
    public PQNode<T> next;
    
    public PQNode() {
        data = null;
        priority = null;
        next = null;
    }
    public PQNode(T e, int p) {
        data = e;
        priority = p;
        next = null;
    }
}
