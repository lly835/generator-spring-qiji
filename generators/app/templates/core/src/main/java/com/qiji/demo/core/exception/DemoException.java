package com.qiji.demo.core.exception;

import com.store59.kylin.common.exception.BaseException;
import com.store59.kylin.utils.EnumMsg;

/**
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/1/20
 * @since 1.0
 */
public class DemoException extends BaseException {
    public DemoException(EnumMsg<Integer> statusEnum) {
        super(statusEnum.getCode(), statusEnum.getMsg());
    }
}
