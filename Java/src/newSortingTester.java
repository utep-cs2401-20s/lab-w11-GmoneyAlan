import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester {

    //Testing a simple array that needs sorted
    @Test
    public void test1(){
        newSorting ns = new newSorting(); //Initiating class to sort array
        int[] alan = {1,4,6,3,5};
        ns.sort(alan,3);  //Sorts the arrays of length 3
        int[] answer = {1,3,4,5,6}; //The expected output
        assertArrayEquals(answer,alan);
    }
    //Seeing if repetitions of get sorted in the array or end up being mixed up and if it will get sorted when size is
    //equal to the length of the array
    @Test
    public void test2(){
        newSorting ns = new newSorting(); //Initiating class to sort array
        int[] alan = {6,1,8,1,3,1,5};
        ns.sort(alan,5); //Sorting with arrays of length 2
        int[] answer = {1,1,1,3,5,6,8};  //The expected answer
        assertArrayEquals(answer,alan);
    }
    //If the method will work with one single number
    @Test
    public void test3(){
        newSorting ns = new newSorting(); //Initiating class to sort array
        int[] alan = {1};
        ns.sort(alan,2);  //Breaks down the array into arrays of length 2 or less
        int[] answer = {1}; //The expected product
        assertArrayEquals(answer,alan);
    }
    //Making Sure it will go into the base case of sort since the length of the array is equal to size
    @Test
    public void test4(){
        newSorting ns = new newSorting(); //Initiating class to sort array
        int[] alan = {2,1};
        ns.sort(alan,2); //Breaks down the arrays into length 2 or less then sorts
        int[] answer = {1,2}; //The expected solution
        assertArrayEquals(answer,alan);
    }
        //Testing if the methods take into account negative numbers with positive
    @Test
    public void test5(){
        newSorting ns = new newSorting(); //Initiating class to sort array
        int[] alan = {4,3,3,2,-1,-10,-2};
        ns.sort(alan,3);  //Breaks down the arrays until their arrays of lenght 3 or less and sorts
        int[] answer = {-10,-2,-1,2,3,3,4}; //What alan sorted is suppose to return after being sorted
        assertArrayEquals(answer,alan);
    }
}
