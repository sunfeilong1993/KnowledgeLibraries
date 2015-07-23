package com.sun.knowledge.algorithm.sort;
/**
 * 选择排序<br>
 * 算法描述:每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，<br>
 * 直到全部待排序的数据元素排完。<br>
 * 选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。<br>
 * 时间复杂度:O(n*n)不稳定<br>
 * 2015年7月23日 下午11:25:48
 * @author sunfeilong1993
 *
 */

public class SelectionSort {
	//选择排序的一般实现
	public static void sort(int arr[]){
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = i ; j < arr.length ; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
