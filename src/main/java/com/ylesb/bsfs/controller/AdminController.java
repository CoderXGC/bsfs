/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminController
 * Author:   White
 * Date:     2021/4/27 18:26
 * Description: 管理员
 * History:
 */
package com.ylesb.bsfs.controller;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rpto.RPTO;
import com.ylesb.bsfs.rqto.*;
import com.ylesb.bsfs.service.AdminService;
import com.ylesb.bsfs.serviceIml.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

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
    @ResponseBody
    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public RPTO adduser(@RequestBody @Valid AddUserRQTO addUserRQTO) {
        LoginRPTO rpto = adminService.adduser(addUserRQTO);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        // /* INSERT INTO user(id,name,pwd,did,signintime,signouttime,telnum,email)VALUES(#{id}, #{name}, #{pwd}, #{did}, #{signintime} ,#{signouttime}, #{telnum},#{email})*/
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findallapply",method = RequestMethod.POST)
    public RPTO findallapply() {
        List<ApplyBean> rpto = adminService.findallapply();
        if(rpto.size()== 0){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/upaudit",method = RequestMethod.POST)
    public RPTO updatepwd(@RequestBody @Valid ApplyRQTO applyRQTO) {
        ApplyRPTO rpto=adminService.upaudit(applyRQTO);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findsignall",method = RequestMethod.POST)
    public RPTO findall() {
        List<SignBean> rpto = adminService.findsignall();

        // String rpto=mUserService.findall();
        if(rpto.size() ==0){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findsignalltime",method = RequestMethod.POST)
    public RPTO findall(@RequestBody @Valid SignRQTO signRQTO) {
        List<SignBean> rpto = adminService.findsignalltime(signRQTO);

        // String rpto=mUserService.findall();
        if(rpto.size() ==0){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/updatesigntime",method = RequestMethod.POST)
    public RPTO updatepwd(@RequestBody @Valid UserBean userBean) {
        LoginRPTO  rpto=adminService.updatesigntime(userBean);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/deluser",method = RequestMethod.POST)
    public RPTO delapply(@RequestBody @Valid FindRQTO findRQTO) {
        FindRPTO rpto = adminService.deluser(findRQTO);
        if(rpto == null){
            return new RPTO<>("删除成功！");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
}