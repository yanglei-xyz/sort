package xyz.yanglei.sort.test;

import xyz.yanglei.sort.BubbleSorter;
import xyz.yanglei.sort.Sorter;

/**
 * 测试冒牌排序
 * 
 * @author yanglei
 *
 */
public class BubbleSorterTest extends SorterTest {

	public static void main(String[] args) {
//		arrayLength = 10000;
		Sorter sorter = new BubbleSorter();
		test(sorter);
	}

}
