package io.github.wanggui.exception;

import io.github.wanggui.constants.HttpCode;
import io.github.wanggui.resp.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangGui
 * @Create 2024/5/23 13:23
 * 全局异常处理
 */
@RestController
public class RestCtrlExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(RestCtrlExceptionHandler.class);

    /**
     * 全局异常处理，统一返回状态码
     */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        logger.error("服务器抛出了异常:{}", e);
        return new Result<>(HttpCode.FAILURE, "执行失败", e.getMessage());
    }
}
