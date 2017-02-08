package com.qiji.demo.common.remoting;

import com.store59.kylin.rpc.context.annotation.Remote;

/**
 * 对外提供的服务接口
 * 注意: 需要在global.yml里配置包名对应的服务
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/2/8
 * @since 1.0
 */
@Remote(path = "/demo")
public interface DemoService {
}
