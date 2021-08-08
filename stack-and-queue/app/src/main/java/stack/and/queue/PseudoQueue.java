package stack.and.queue;

public class PseudoQueue <T>{
    Stack<T> instance1 = new Stack<T>();
    Stack<T> instance2 = new Stack<T>();


    public void enqueue(T value){
        while(true){
            if (! instance1.isEmpty()){
                instance2.push(instance1.pop());
            }else{
                break;
            }
        }

        instance1.push(value);

        while (true){
            if (!instance2.isEmpty()){
                instance1.push(instance2.pop());
            }else{
                break;
            }
        }
    }

    public T dequeue(){
        T returnValue= null;
        if(! instance1.isEmpty()){
            returnValue = instance1.top.value;
            instance1.pop();
        }
        return returnValue;
    }

}
