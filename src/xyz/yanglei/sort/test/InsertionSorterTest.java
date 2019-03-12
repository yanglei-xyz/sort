package xyz.yanglei.sort.test;

import xyz.yanglei.sort.InsertionSorter;
import xyz.yanglei.sort.Sorter;

/**
 * 测试插入排序
 * 
 * @author yanglei
 *
 */
public class InsertionSorterTest extends SorterTest {

	public static void main(String[] args) {
//		arrayLength = 1000;
		Sorter sorter = new InsertionSorter();
		test(sorter);
	}

}
