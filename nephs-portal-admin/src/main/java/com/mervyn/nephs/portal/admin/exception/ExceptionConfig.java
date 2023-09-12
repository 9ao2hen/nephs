package com.mervyn.nephs.portal.admin.exception;

import com.mervyn.nephs.common.Result;
import com.mervyn.nephs.common.Results;
import com.mervyn.nephs.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 2hen9ao
 * @date 2023/9/8 20:15
 */
@Slf4j
@RestControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(ServiceException.class)
    public Result<Void> serviceException(ServiceException exp) {
        //todo
        return Results.error(exp.getCode(), exp.getMessage());
    }

}
