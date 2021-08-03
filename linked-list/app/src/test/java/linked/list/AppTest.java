/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;

import static linked.list.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void linkedListTest() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

        // empty linked list test
        LinkedList test = new LinkedList();
        assertNull(test.head);


        //Can properly insert into the linked list
        test.insert(4);
        assertEquals(4, test.head.value);


        //The head property will properly point to the first node
        assertEquals(4, test.head.value);
        assertNull(test.head.next);


        //Can properly insert multiple nodes into the linked list
        test.insert(3);
        test.insert(2);
        assertEquals(2,test.head.value);


        //Will return true when finding a value within the linked list that exists
        assertTrue(test.includes(3));


        //Will return false when searching for a value in the linked list that does not exist
        assertFalse(test.includes(20));


        //Can properly return a collection of all the values that exist in the linked list
        assertEquals("{2} -> {3} -> {4} -> NULL" , test.toString());




//        Can successfully add a node to the end of the linked list
          test.append(7);
          assertEquals("{2} -> {3} -> {4} -> {7} -> NULL",test.toString());


//        Can successfully add multiple nodes to the end of a linked list
        test.append(8);
        test.append(9);
        assertEquals("{2} -> {3} -> {4} -> {7} -> {8} -> {9} -> NULL",test.toString());


//        Can successfully insert a node before a node located in the middle of a linked list
        test.insertBefore(7,6);
        assertEquals("{2} -> {3} -> {4} -> {6} -> {7} -> {8} -> {9} -> NULL",test.toString());


//        Can successfully insert a node before the first node of a linked list
        test.insertBefore(2,1);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {6} -> {7} -> {8} -> {9} -> NULL",test.toString());


//        Can successfully insert after a node in the middle of the linked list
        test.insertAfter(4,5);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> {7} -> {8} -> {9} -> NULL",test.toString());


//        Can successfully insert a node after the last node of the linked list
        test.insertAfter(9,10);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> {7} -> {8} -> {9} -> {10} -> NULL",test.toString());



        // code challenge 06

        //Where k and the length of the list are the same
        //this will return a value of 0 and though an exception
        assertEquals(0,test.kthFromEnd(10));


//        Where k is greater than the length of the linked list
        //this also return a value of 0 and through an exception
        assertEquals(0,test.kthFromEnd(15));


//        Where k is not a positive integer
        //this also return a value of 0 and through an exception
        assertEquals(0,test.kthFromEnd(-4));


//        Where the linked list is of a size 1
        LinkedList newList = new LinkedList();
        newList.insert(1);
        assertEquals(1,newList.kthFromEnd(0));


//    Happy Path where k is not at the end, but somewhere in the middle of the linked list
        assertEquals(7, test.kthFromEnd(3));




    }


    @Test void zipTwoLinkedListTest(){

        // two linked lists with the same size
        LinkedList testList = new LinkedList();
        testList.append(1);
        testList.append(3);
        testList.append(5);

        LinkedList testList2 = new LinkedList();
        testList2.append(2);
        testList2.append(4);
        testList2.append(6);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {5} -> {6} -> NULL",zipTwoLinkedLists(testList,testList2).toString());


        // two linked lists with different sizes
        LinkedList test1= new LinkedList();
        test1.append(1);
        test1.append(3);

        LinkedList test2 = new LinkedList();
        test2.append(2);
        test2.append(4);
        test2.append(6);
        assertEquals("{1} -> {2} -> {3} -> {4} -> {6} -> NULL",zipTwoLinkedLists(test1,test2).toString());


        // two linked lists with one of them is empty
        LinkedList test3= new LinkedList();

        LinkedList test4 = new LinkedList();
        test4.append(2);
        test4.append(4);
        test4.append(6);
        assertEquals("{2} -> {4} -> {6} -> NULL",zipTwoLinkedLists(test3,test4).toString());


        // two linked lists are empty
        LinkedList test5= new LinkedList();

        LinkedList test6 = new LinkedList();

        assertEquals("NULL",zipTwoLinkedLists(test5,test6).toString());
    }
}



