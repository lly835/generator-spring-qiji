package com.qiji.demo.common.enums;

import com.store59.kylin.utils.EnumMsg;

/**
 *
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2017/2/8
 * @since 1.0
 */
public enum DemoResultEnum implements EnumMsg<Integer> {
    UNKNOWN_ERROR(-1, "未知异常"),
    SUCCESS(0, "成功"),
    ;

    private Integer code;

    private String msg;

    DemoResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
