package xyz.yanglei.sort;

import java.util.Comparator;

/**
 * <strong>冒泡排序</strong>
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * 
 * <strong>算法描述</strong> 1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数； 3.针对所有的元素重复以上的步骤，除了最后一个；
 * 4.重复步骤1~3，直到排序完成。
 * 
 * @author yanglei
 *
 */
public class BubbleSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		//由于双层循环，外层循环不需要遍历到最后一个元素，因此循环结束条件为i < len - 1。
		for (int i = 0, len = list.length; i < len - 1; i++) {
			//内层循环，第一个索引从i+1开始即可，因为前面的字段都是已经排序好的。
			for (int j = i + 1; j < len; j++) {
				//从小到大排序，如果第i个元素>第j个元素，则交换位置，否则进入下次循环
				if (list[i].compareTo(list[j]) > 0) {
					//交换位置
					T temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}


	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		for (int i = 0, len = list.length; i < len - 1; i++) {
			for (int j = i + 1; j < len - i; j++) {
				if (comp.compare(list[i], list[j]) > 0) {
					T temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}
