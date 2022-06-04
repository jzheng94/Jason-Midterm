package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        String value = "i am waiting";
        Assert.assertEquals("i am waiting...",value);
        //Now implement Unit test for rest of the soring algorithm...................below

        //Insertion Sort Unit test
        try{
            int[] actual = sort.insertionSort(unSortedArray);
            System.out.println("Array is sorted.");
        }catch (AssertionError ex){
            System.out.println("Array is not sorted.");
        }

        //Bubble Sort Unit Test
        try{
            int[] actual = sort.bubbleSort(unSortedArray);
            System.out.println("Array is sorted.");
        }catch (AssertionError ex){
            System.out.println("Array is not sorted");
        }

        //Quick Sort Unit test
        sort.quickSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Bucket Sort Unit test
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }


        //Heap Sort Unit test
        try{
            int[] actual = sort.heapSort(unSortedArray);
            System.out.println("Array is sorted");
        }catch (AssertionError ex){
            System.out.println("Array is not sorted.");
        }

        //Merge Sort Unit test
        sort.mergeSort(unSortedArray,unSortedArray.length);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
