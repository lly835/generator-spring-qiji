package com.qiji.demo.api.controller;

import com.qiji.demo.core.business.DemoBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/2/8
 * @since 1.0
 */
@RestController
public class DemoController {

    @Autowired
    private DemoBusiness demoBusiness;
}
