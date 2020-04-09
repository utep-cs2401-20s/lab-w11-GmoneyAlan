import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {

    @Test
    public void test1(){
        newSorting ns = new newSorting();
        int[] alan = {1,4,6,3,5};
        ns.sort(alan,2);
        int[] answer = {1,3,4,5,6};
        assertArrayEquals(answer,alan);
    }
    @Test
    public void test2(){
        newSorting ns = new newSorting();
        int[] alan = {6,1,8,1,3,1,5};
        ns.sort(alan,3);
        int[] answer = {1,1,1,3,5,6,8};
        assertArrayEquals(answer,alan);
    }
    @Test
    public void test3(){
        newSorting ns = new newSorting();
        int[] alan = {};
        ns.sort(alan,2);
        int[] answer = {};
        assertArrayEquals(answer,alan);
    }
    @Test
    public void test4(){
        newSorting ns = new newSorting();
        int[] alan = {};
        ns.sort(alan,4);
        int[] answer = {};
        assertArrayEquals(answer,alan);
    }
    @Test
    public void test5(){
        newSorting ns = new newSorting();
        int[] alan = {};
        ns.sort(alan,3);
        int[] answer = {};
        assertArrayEquals(answer,alan);
    }

}
