package stack.and.queue;

public class Queue <T> {
    Node<T> front;
    Node<T> rear;

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if (front != null){
           rear.next = newNode;
           rear=newNode;
        }else{
           front = newNode;
            rear = front;
        }
    }

    public T dequeue(){
        T temp = null;
        try{
            temp = front.value;
            front= front.next;
        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }

    public T peek(){
        try {
            return front.value;
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return null;
    }


    public boolean isEmpty(){
        return front == null;
    }

}
