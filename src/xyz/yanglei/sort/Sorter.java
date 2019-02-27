package xyz.yanglei.sort;

import java.util.Comparator;

/**
 * 排序器接口 
 * (策略模式: 将算法封装到具有共同接口的独立的类中使得它们可以相互替换)
 * 
 * @author yanglei
 *
 */
public interface Sorter {
	/**
	 * 排序
	 * 
	 * @param list 待排序的数组
	 */
	public <T extends Comparable<T>> void sort(T[] list);

	/**
	 * 排序
	 * 
	 * @param list 待排序的数组
	 * @param comp ⽐比较两个对象的⽐比较器器
	 */
	public <T> void sort(T[] list, Comparator<T> comp);
}
