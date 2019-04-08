package com.channelsoft.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dt>Config</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018-12-27 17:57</dd>
 * </dl>
 *
 * @author nanrt
 */
@ConfigurationProperties(prefix = "configtask")
@Component
@Setter@Getter
public class Config {

	private String cron;

}
