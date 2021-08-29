/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        int[] testing = {8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(testing)));
    }


    public static int[] insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int j = i-1;
            int temp = list[i];

            while (j>=0 && temp<list[j]){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
        return list;
    }
}