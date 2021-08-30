/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Insertion.Sort.App.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

        int[] testing = {8,4,23,42,16,15};
        int[] result = {4,8,15,16,23,42};
        assertEquals(Arrays.toString(result),Arrays.toString(insertionSort(testing)));
    }

}
