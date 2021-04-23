package com.ylesb.bsfs.controller;


import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.*;
import com.ylesb.bsfs.rqto.*;
import com.ylesb.bsfs.service.SignService;
import com.ylesb.bsfs.service.UserService;
import com.ylesb.bsfs.serviceIml.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cc_want on 2018/6/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService mUserService;
    @Autowired
    private SignService mSignService;

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
    @ResponseBody
    @RequestMapping(value = "/findall",method = RequestMethod.POST)
    public RPTO findall() {
        List<UserBean> rpto = mUserService.findall();

       // String rpto=mUserService.findall();
        if(rpto == null){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findfaceimg",method = RequestMethod.POST)
    public RPTO findfaceimg() {
        List<FaceImgUrlBean> rpto = mUserService.findfaceimg();
        if(rpto == null){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/addfaceimg",method = RequestMethod.POST)
    public RPTO addfaceimg(@RequestBody @Valid AddFaceimgRQTO addfaceimg) {
        AddFaceimgRPTO rpto = mUserService.addfaceimg(addfaceimg);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public RPTO sign(@RequestBody @Valid SignRQTO signRQTO) {
        SignRPTO rpto1=mSignService.sign(signRQTO);
        if(rpto1 == null){
            return new RPTO<>("签到失败请联系管理员");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto1);
    }
    @ResponseBody
    @RequestMapping(value = "/findsign",method = RequestMethod.POST)
    public RPTO findsign(@RequestBody @Valid SignRQTO signRQTO) {
        SignRPTO rpto1=mSignService.findsign(signRQTO);
        if(rpto1 == null){
            return new RPTO<>("查找失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto1);
    }
}
