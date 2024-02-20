public class ArrayStack<T> implements Stack<T> {
    private int maxsize;
    private int top;
    private T[] nodes;

    /** Creates a new instance of ArrayStack */
    public ArrayStack(int n) {
        maxsize = n;
        top = -1;
        nodes = (T[]) new Object[n];
    }
    public boolean empty(){
        return top == -1;
    }
    public boolean full(){
        return top == maxsize - 1;
    }
    public void push(T e){
        nodes[++top] = e;
    }
    public T pop(){
        return nodes[top--];
    }
}