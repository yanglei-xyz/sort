package xyz.yanglei.sort;

import java.util.Comparator;

/**
 * <strong>插入排序</strong>
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 
 * <strong>算法描述</strong> 
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 * 1.从第一个元素开始，该元素可以认为已经被排序； 
 * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描； 
 * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置； 
 * 5.将新元素插入到该位置后； 
 * 6.重复步骤2~5。
 * 
 * 
 * <strong>算法分析</strong>
 * 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
 * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * 
 * 
 * @author yanglei
 *
 */
public class InsertionSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		Integer len = list.length;
		Integer preIndex;
		T current;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			current = list[i];
			while(preIndex >= 0 && current.compareTo(list[preIndex]) > 0) {
				list[preIndex + 1] = list[preIndex];
				preIndex--;
			}
			list[preIndex + 1] = current;
		}
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		Integer len = list.length;
		Integer preIndex;
		T current;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			current = list[i];
			while(preIndex >= 0 && comp.compare(current,list[preIndex]) > 0) {
				list[preIndex + 1] = list[preIndex];
				preIndex--;
			}
			list[preIndex + 1] = current;
		}
	}
}
