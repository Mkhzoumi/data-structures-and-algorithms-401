/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        HashTable<Object> newHash = new HashTable<>(10);

//        newHash.add(30,"hello");
        newHash.add("hi", "this is hi");
        newHash.add("ih", "this is ih");


        System.out.println(newHash.get("h"));

        System.out.println(newHash.contains("ih"));


        System.out.println(newHash.hash("hi"));




//        System.out.println(newHash.arrayOfNodesSize);
//        System.out.println(newHash.arrayOfNodes[0].value);
//        System.out.println(newHash.arrayOfNodes[0].next.value);
//
//        System.out.println(Arrays.toString(newHash.arrayOfNodes));



    }






}
