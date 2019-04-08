package com.channelsoft.task;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * <dl>
 * <dt>ThreadPoolTask</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2019-01-02 10:09</dd>
 * </dl>
 *
 * @author nanrt
 */
public class ThreadPoolTask {
	ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();

	public void test(){
		taskExecutor.execute(()->{});
	}
}
