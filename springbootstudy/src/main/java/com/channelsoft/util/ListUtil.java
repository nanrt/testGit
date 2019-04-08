package com.channelsoft.util;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt>ListUtil</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2019-01-03 18:58</dd>
 * </dl>
 *
 * @author nanrt
 */
public class ListUtil {

	public static void test() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		int j=0;
		for (int i = 0; i < 10; i++) {
			List<Integer> subList = list.subList(j,j+10);
			j+=10;
			subList.stream().forEach(System.out::print);
			System.out.println("*************");
		}
	}

	public static void main(String[] args) {
		test();
	}
}
