package xyz.yanglei.sort.test;

import java.util.Random;

import xyz.yanglei.sort.Sorter;

/**
 * 基础测试类，提供常用基础方法
 * 
 * @author yanglei
 *
 */
public class SorterTest {
	/**
	 * 测试用的数组长度
	 */
	protected static Integer arrayLength = 10;

	/**
	 * 测试方法
	 * 
	 * @param sorter 排序方式
	 */
	public static void test(Sorter sorter) {
		Integer[] array = createArray();

		System.out.println("排序前");
		printArray(array);

		long begin = System.nanoTime();
		sorter.sort(array);
		long time = System.nanoTime() - begin;

		System.out.println("排序后");
		printArray(array);

		System.out.println("用时：" + formatNanoTime(time));
	}

	/**
	 * 创建一个随机的数组
	 * 
	 * @return Integer类型数组
	 */
	protected static Integer[] createArray() {
		Random random = new Random();
		Integer[] array = new Integer[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = random.nextInt(99);
		}
		return array;
	}

	/**
	 * 打印数组
	 * 
	 * @param array 要打印的数组
	 */
	protected static void printArray(Integer[] array) {
		for (Integer item : array) {
			System.out.print(item + ",");
		}
		System.out.println();
	}

	/**
	 * 格式化时间
	 * 
	 * @param nanoTime 纳秒
	 * @return 格式化后字符串
	 */
	protected static String formatNanoTime(Long nanoTime) {
		StringBuffer sb = new StringBuffer();
		long time = nanoTime;
		long s = 0;// 秒
		long ms = 0;// 毫秒
		long μs = 0;// 微秒
		long ns = 0;// 纳秒

		ns = time % 1000;// 计算纳秒
		time = time / 1000;// 换成微秒
		μs = time % 1000;// 计算微秒
		time = time / 1000;// 换成毫秒
		ms = time % 1000;// 计算毫秒
		time = time / 1000;// 换成妙
		s = time % 1000;// 计算秒

		sb.append(s).append("秒").append(ms).append("毫秒").append(μs).append("微秒").append(ns).append("纳秒");

		return sb.toString();
	}
}
