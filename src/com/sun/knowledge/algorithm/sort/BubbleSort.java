package com.sun.knowledge.algorithm.sort;
/**
 * 冒泡排序算法的实现<br>
 * 算法简介:它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。<br>
 *       走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。<br>
 * 时间复杂度:O(n*n)<br>
 * 2015年7月23日 下午10:58:23
 * @author sunfeilong1993
 *
 */
public class BubbleSort {
	public static void sort(int[] arr) {
		for (int i = 0 ; i < arr.length-1 ; i++) {
			for (int j = 0 ; j < arr.length -1-i ; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
