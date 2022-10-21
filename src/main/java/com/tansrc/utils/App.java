package com.tansrc.utils;

import com.tansrc.utils.MergeSort;
import java.util.Arrays;

/**
 * Demo App
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
		
		System.out.println("Demo: Use MergeSort on array");
		int[] array = {2, 4, 6, 1, 5, 16, 4, 8};
		
		System.out.println("Test array: " + Arrays.toString(array));
		MergeSort.process(array, 0, array.length - 1);
		
		System.out.println("MergeSort result: " + Arrays.toString(array)); 
    }
}
