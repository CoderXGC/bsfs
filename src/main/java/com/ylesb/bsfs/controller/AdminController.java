/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminController
 * Author:   White
 * Date:     2021/4/27 18:26
 * Description: 管理员
 * History:
 */
package com.ylesb.bsfs.controller;

import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rpto.RPTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
import com.ylesb.bsfs.service.AdminService;
import com.ylesb.bsfs.serviceIml.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 *
 * 〈管理员〉
 *
 * @author White
 * @create 2021/4/27
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    public AdminService adminService;
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public RPTO login(@RequestBody @Valid LoginRQTO login) {
        LoginRPTO rpto = adminService.login(login);
        if(rpto == null){
            return new RPTO<>("用户名密码错误");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
}