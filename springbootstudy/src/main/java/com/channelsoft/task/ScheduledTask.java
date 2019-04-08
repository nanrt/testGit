package com.channelsoft.task;

import com.channelsoft.util.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <dl>
 * <dt>ScheduledTask</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018-12-27 16:35</dd>
 * </dl>
 *
 * @author nanrt
 */
@Component
@Slf4j
@PropertySource(value = "classpath:/application.yml")
public class ScheduledTask {

	@Autowired
	private Config config;

	@Value("${configtask.cron}")
	private String con;

	/**
	 * fixedRate的单位是毫秒
	 */
	@Scheduled(fixedRate = 100 * 30)
	public void testTask1() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		Date ten = null;
		Date now = null;
		try {
			ten = simpleDateFormat.parse("09:40:00");
			now = new Date();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(ten);
		int a = calendar.get(Calendar.HOUR_OF_DAY);
		calendar.setTime(new Date());
		int b = calendar.get(Calendar.MINUTE);
		/*log.info("ten:{}", a);
		log.info("now:{}", b);
		log.info("当前时间是否大于指定时间{}", ten.before(now));
		log.info("启动第一个定时任务testTask1");
		log.info("Scheduling Tasks Examples: The time is now " + new Date());*/

		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(7);
		list.add(8);
		IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(value -> value));

		log.info("总和为：{}", collect.getSum());
	}

	@Scheduled(cron = "0 28 20,21,22,23 * * ?")
	public void testTask2() {
		log.info("获取的参数{}", "${configtask.cron}");
		log.info("获取的参数{}", config.getCron());
		log.info("启动第一个定时任务testTask2");
		log.info("Scheduling Tasks Examples: The time is now " + new Date());
	}

}
