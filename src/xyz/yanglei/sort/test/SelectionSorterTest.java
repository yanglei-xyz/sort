package xyz.yanglei.sort.test;

import xyz.yanglei.sort.SelectionSorter;
import xyz.yanglei.sort.Sorter;

/**
 * 测试选择排序
 * 
 * @author yanglei
 *
 */
public class SelectionSorterTest extends SorterTest {

	public static void main(String[] args) {
		arrayLength = 1000;
		Sorter sorter = new SelectionSorter();
		test(sorter);
	}

}
