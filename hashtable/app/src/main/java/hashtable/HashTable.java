package hashtable;

public class HashTable <T>{
    Node<T>[] arrayOfNodes;
    int arrayOfNodesSize;

    public HashTable(int arraySize){
        this.arrayOfNodesSize = arraySize;
        this.arrayOfNodes = new Node[this.arrayOfNodesSize];
        for (Node node : arrayOfNodes) {
            node = new Node();
        }
    }


    public int hash(T key){
        int ascii=0;
        if (key instanceof String){
            for(char latter : ((String) key).toCharArray()){
                ascii += (int) latter;
            }
        }else{
            ascii = (Integer)key;
        }
        return ascii % arrayOfNodesSize;
    }





    public void add(T key , T value){

         int index =  hash(key);
        Node<T> newNode = new Node<T>(value,key);
        if (arrayOfNodes[index] == null){
            arrayOfNodes[index] = newNode;
        }else if (arrayOfNodes[index].next == null){
            arrayOfNodes[index].next = newNode;
        }else{
            newNode.next = arrayOfNodes[index].next;
            arrayOfNodes[index].next = newNode;
        }
    }


    public String get(T key){
        int index = hash(key);
        String returnValue=null;
        if(arrayOfNodes[index] == null){
            returnValue= "this key is not existed";
        }else{
            Node<T> curr = arrayOfNodes[index];

            while(curr != null){
                if (curr.key == key){
                    returnValue= (String)curr.value;
                    break;
                }else{
                    curr = curr.next;
                }
            }
        }
        return returnValue;
    }


    public boolean contains(T key){
        int index = hash(key);
        boolean returnValue = false;

        if (arrayOfNodes[index] != null){
            Node<T> curr = arrayOfNodes[index];
            while (curr != null){
                if (curr.key == key){
                    returnValue=true;
                    break;
                }else{
                    curr = curr.next;
                }
            }
        }
        return returnValue;
    }

}
