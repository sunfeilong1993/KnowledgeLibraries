package com.sun.knowledge.algorithm.sort.test;

import java.util.Arrays;
import java.util.Random;

import com.sun.knowledge.algorithm.sort.BubbleSort;
import com.sun.knowledge.algorithm.sort.SelectionSort;

/**
 * 测试排序算法<br>
 * 2015年7月23日 下午11:02:18
 * @author sunfeilong1993
 *
 */

public class TestSort {
	
	public static void main (String[] args) {
		Random random = new Random();
		int bubbleSortArr[] = new int[100];
		for (int i = 0 ; i < 100 ; i++) {
			bubbleSortArr[i] = random.nextInt(1000);
		}
		int[] selectionSortArr = Arrays.copyOf(bubbleSortArr, bubbleSortArr.length);
		//冒泡排序
		BubbleSort.sort(bubbleSortArr);
		int temp = 1000;
		for (int i = 0 ; i < bubbleSortArr.length ; i++) {
			if(temp < bubbleSortArr[i]){
				System.err.println("temp:"+temp+" a:"+bubbleSortArr[i]);
			}else{
				System.out.print(bubbleSortArr[i]+" ");
			}
			temp = bubbleSortArr[i];
		}
		
		//选择排序
		temp = 1000;
		System.out.println();
		SelectionSort.sort(selectionSortArr);
		for (int i = 0 ; i < selectionSortArr.length ; i++) {
			if(temp < selectionSortArr[i]){
				System.err.println("temp:"+temp+" a:"+selectionSortArr[i]);
			}else{
				System.out.print(selectionSortArr[i]+" ");
			}
			temp = selectionSortArr[i];
		}
		
	}
}
