/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: LogController
 * Author:   White
 * Date:     2021/4/20 18:26
 * Description: 日志
 * History:
 */
package com.ylesb.bsfs.controller;

import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.LogRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rpto.RPTO;
import com.ylesb.bsfs.rqto.LogRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
import com.ylesb.bsfs.service.LogService;
import com.ylesb.bsfs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 *
 * 〈日志〉
 *
 * @author White
 * @create 2021/4/20
 */
@Controller
@RequestMapping("/sys")
public class SystemController {
    @Autowired
    private LogService logService;
    @ResponseBody
    @RequestMapping(value = "/loglogin",method = RequestMethod.POST)
    public RPTO login(@RequestBody @Valid LogRQTO log) {
        LogRPTO rpto1=logService.add(log);
        if(rpto1 == null){
           return new RPTO<>("添加失败请联系管理员");
       }
        return new RPTO<>(ActionCode.SUCCESS,rpto1);
    }
}