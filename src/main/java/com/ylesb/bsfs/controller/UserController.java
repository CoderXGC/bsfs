package com.ylesb.bsfs.controller;


import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rpto.RPTO;
import com.ylesb.bsfs.rqto.FindRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
import com.ylesb.bsfs.service.UserService;
import com.ylesb.bsfs.serviceIml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by cc_want on 2018/6/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService mUserService;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public RPTO login(@RequestBody @Valid LoginRQTO login) {
        LoginRPTO rpto = mUserService.login(login);
        if(rpto == null){
            return new RPTO<>("用户名密码错误");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public RPTO find(@RequestBody @Valid FindRQTO find) {
        FindRPTO rpto = mUserService.find(find);
        if(rpto == null){
            return new RPTO<>("未找到此员工");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
}
