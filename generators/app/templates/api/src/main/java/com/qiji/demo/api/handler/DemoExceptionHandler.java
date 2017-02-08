/**
 * Copyright (c) 2016, 59store. All rights reserved.
 */
package com.qiji.demo.api.handler;

import com.qiji.demo.common.enums.DemoResultEnum;
import com.store59.kylin.common.exception.BaseException;
import com.store59.kylin.common.model.Result;
import com.store59.kylin.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author <a href="mailto:lly835@163.com">凌云</a>
 * @version 1.0 2016/10/13
 * @since 1.0
 */
@ControllerAdvice
public class DemoExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(DemoExceptionHandler.class);

    /**
     * 全局异常捕获，返回异常状态及信息
     *
     * @param ex 发生的异常
     * @return 已知异常返回定义的状态码和信息，未知异常返回状态码－1和异常信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<?> handleBadRequest(Exception ex) {
        Result<?> r = new Result<>();
        if (ex instanceof BaseException) {
            BaseException e = (BaseException) ex;
            r.setStatus(e.getStatus());
            r.setMsg(e.getMsg());
        } else {
            r.setStatus(DemoResultEnum.UNKNOWN_ERROR.getCode());
            r.setMsg(DemoResultEnum.UNKNOWN_ERROR.getMsg());
        }
        logger.error("发生异常: {}", JsonUtil.getJsonFromObject(r), ex);
        return r;
    }
}
