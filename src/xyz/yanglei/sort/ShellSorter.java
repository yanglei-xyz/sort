package xyz.yanglei.sort;

import java.util.Comparator;

/**
 * <strong>希尔排序（Shell Sort）</strong> 希尔排序（Shell
 * Sort）1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * 
 * <strong>算法描述</strong> 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述： 1.
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1； 2. 按增量序列个数k，对序列进行k 趟排序； 3.
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。 仅增量因子为1
 * 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 * 
 * <strong>算法分析</strong> 希尔排序的核心在于间隔序列的设定。既可以提前设定好间隔序列，也可以动态的定义间隔序列。
 * 动态定义间隔序列的算法是《算法（第4版）》的合著者Robert Sedgewick提出的。
 * 
 * 
 * @author yanglei
 *
 */
public class ShellSorter implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		Integer len = list.length;
		for (int gap = (int) Math.floor(len / 2); gap > 0; gap = (int) Math.floor(gap / 2)) {
			// 注意：这里和动图演示的不一样，动图是分组执行，实际操作是多个分组交替执行
			for (int i = gap; i < len; i++) {
				int j = i;
				T current = list[i];
				while (j - gap >= 0 && current.compareTo(list[j - gap]) > 0) {
					list[j] = list[j - gap];
					j = j - gap;
				}
				list[j] = current;
			}
		}
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		// TODO:
	}
}
