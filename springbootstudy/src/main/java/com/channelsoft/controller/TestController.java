package com.channelsoft.controller;

import com.alibaba.fastjson.JSONObject;
import com.channelsoft.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <dl>
 * <dt>TestController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018-12-24 11:25</dd>
 * </dl>
 *
 * @author nanrt
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

	@GetMapping("/sayHello")
	public String test() {
		List<Integer> list = new ArrayList<>();
		User user = new User();
		user.setName("张山");
		user.setAge(22);
		log.debug("输出内容：{}", user.toString());
		log.info("输出内容：{}", user.toString());
		return JSONObject.toJSONString(user);
	}

}
