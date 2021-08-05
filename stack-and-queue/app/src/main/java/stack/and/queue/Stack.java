package stack.and.queue;

public class Stack <T>{
    Node<T> top;


    public void push(T value){
        Node<T> newNode = new Node<T>(value);

        if (top != null){
            newNode.next = top;
        }
        top = newNode;
    }

    public T pop(){
        T temp = null;
        try {
            temp = top.value;
            top = top.next;
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return temp;
    }

    public T peek(){
        try {
            return top.value;
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        return null;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
