package linked.list;

public class LinkedList {
    Node head;

    public void insert(int num){
        Node addedNode = new Node(num);
        if (head != null) {
            addedNode.next = head;
        }
        head=addedNode;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null){
            if (current.value == value){
                return true;
            }
            current= current.next;
        }
        return false;
    }

    public String toString(){
        String printResult = "";
        Node current = head;
        while (current != null){
            printResult+= "{"+current.value+"} -> ";
            current= current.next;
        }
        printResult+="NULL";
        return printResult;
    }
}


