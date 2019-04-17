package xyz.yanglei.sort.test;

import xyz.yanglei.sort.ShellSorter;
import xyz.yanglei.sort.Sorter;

/**
 * 测试选择排序
 * 
 * @author yanglei
 *
 */
public class ShellSorterTest extends SorterTest {

	public static void main(String[] args) {
		arrayLength = 40;
		Sorter sorter = new ShellSorter();
		test(sorter);
	}

}
