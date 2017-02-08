package com.qiji.demo.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 项目的配置
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/2/8
 * @since 1.0
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
}
