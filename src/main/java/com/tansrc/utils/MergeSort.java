package com.tansrc.utils;

public class MergeSort {
	
	// splits array into two and performs sort
	private static void mergeSort(int[] array, int left, int mid, int right) {
		//get sizes of the two half arrays
		int sizeLeft = mid - left + 1;
		int sizeRight = right - mid;
		
		//make temp holder arrays per half
		int[] tempLeftArray = new int[sizeLeft];
		int[] tempRightArray = new int[sizeRight];
		
		// copy data into temp arrays
		for (int i = 0; i < sizeLeft; i++) {
			tempLeftArray[i] = array[left + i];
		}
		for (int j = 0; j < sizeRight; j++) {
			tempRightArray[j] = array[mid + 1 + j];
		}			
		
		// merge-sort in place
		int tempLeftMarker = 0; 
		int tempRightMarker = 0;
		int arrayMarker = left; // initialize mergedArray marker
		
		while (tempLeftMarker < sizeLeft && tempRightMarker < sizeRight) {
			if (tempLeftArray[tempLeftMarker] <= tempRightArray[tempRightMarker]) {
				array[arrayMarker] = tempLeftArray[tempLeftMarker];
				tempLeftMarker++;
			} else {
				array[arrayMarker] = tempRightArray[tempRightMarker];
				tempRightMarker++;
			}
			arrayMarker++;
		}
		
		// copy any danglers back onto original array
		while (tempLeftMarker < sizeLeft) {
			array[arrayMarker] = tempLeftArray[tempLeftMarker];
			tempLeftMarker++;
			arrayMarker++;
		}
		
		while (tempRightMarker < sizeRight) {
			array[arrayMarker] = tempRightArray[tempRightMarker];
			tempRightMarker++;
			arrayMarker++;
		}
	}

	// sorts input array
	public static void process(int[] array, int left, int right) {
		if (left < right) {
			
			// find midpoint
			int mid = (left + (right - 1))/2;
			
			// recursively process each half
			process(array, left, mid);
			process(array, mid+1, right);
			
			// reconcile merge sort
			mergeSort(array, left, mid, right);
		}
	}
}