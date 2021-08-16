/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        BinarySearchTree<Integer> test = new BinarySearchTree<>(5);
        test.root.leftChild = new Node<>(3);
        test.root.rightChild = new Node<>(6);
        test.root.leftChild.leftChild = new Node<>(2);
        test.root.leftChild.rightChild = new Node<>(4);


//        test.add(1);
//
//
//
//        System.out.println(test.contains(3,test.root));

//        System.out.println(test.maximum());
        System.out.println(breadthFirst(test));
    }



    public static ArrayList<Integer> breadthFirst(BinaryTree<Integer> tree) {
        ArrayList<Integer> values =new ArrayList<Integer>();
        Queue<Node> test = new LinkedList<>();
        if (tree.root != null) {
            test.add(tree.root);
            while (!test.isEmpty()) {
                Node node = test.remove();
                values.add((Integer)node.value);
                if (node.leftChild != null) {
                    test.add(node.leftChild);
                }
                if (node.rightChild != null) {
                    test.add(node.rightChild);
                }
            }
        }
        return values;
    }
}
