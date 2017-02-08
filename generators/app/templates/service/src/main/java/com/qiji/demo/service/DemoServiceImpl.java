package com.qiji.demo.service;

import com.qiji.demo.common.remoting.DemoService;
import com.qiji.demo.core.business.DemoBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/2/8
 * @since 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoBusiness demoBusiness;

}
