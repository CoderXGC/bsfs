package com.ylesb.bsfs.controller;


import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.RPTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;
import java.util.List;

/**
 *
 * 〈测试接口〉
 *
 * @author White
 * @create 2021/4/16
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public RPTO exceptionHandler(Exception ex) throws IOException {
      log.error("异常:",ex);
        if (ex instanceof MethodArgumentNotValidException) {
            BindingResult result = ((MethodArgumentNotValidException) ex).getBindingResult();
            if (result.hasErrors()) {
                StringBuffer sb = new StringBuffer();
                printBindException(sb, result);
                return new RPTO<>(ActionCode.VALID,sb.toString(),null);
            }
        }
        return new RPTO<>(ActionCode.EXCEPTION);
    }
    private void printBindException(StringBuffer message, BindingResult result) {
        List<ObjectError> allErrors = result.getAllErrors();
        for (int i = 0; i < allErrors.size(); i++) {
            message.append(allErrors.get(i).getDefaultMessage());
            if (allErrors.size() > 1 && i < allErrors.size() - 1) {
                message.append(",");
            }
        }
    }
}
