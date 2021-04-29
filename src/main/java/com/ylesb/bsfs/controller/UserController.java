package com.ylesb.bsfs.controller;


import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.core.ActionCode;
import com.ylesb.bsfs.rpto.*;
import com.ylesb.bsfs.rqto.*;
import com.ylesb.bsfs.service.SignService;
import com.ylesb.bsfs.service.UserService;
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
 *
 * 〈日志〉
 *
 * @author White
 * @create 2021/4/20
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
        if(rpto.size() ==0){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findfaceimg",method = RequestMethod.POST)
    public RPTO findfaceimg() {
        List<FaceImgUrlBean> rpto = mUserService.findfaceimg();
        if(rpto.size()==0){
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
    @RequestMapping(value = "/updatepwd",method = RequestMethod.POST)
    public RPTO updatepwd(@RequestBody @Valid LoginRQTO loginRQTO) {
        LoginRPTO  rpto=mUserService.updatepwd(loginRQTO);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public RPTO signin(@RequestBody @Valid SignRQTO signRQTO) {
        SignRPTO rpto1=mSignService.signin(signRQTO);
        if(rpto1 == null){
            return new RPTO<>("签到失败请联系管理员");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto1);
    }
    @ResponseBody
    @RequestMapping(value = "/signout",method = RequestMethod.POST)
    public RPTO signout(@RequestBody @Valid SignRQTO signRQTO) {
        SignRPTO rpto1=mSignService.signout(signRQTO);
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
    @ResponseBody
    @RequestMapping(value = "/addapply",method = RequestMethod.POST)
    public RPTO addapply(@RequestBody @Valid ApplyRQTO applyRQTO) {
        ApplyRPTO rpto = mUserService.addapply(applyRQTO);
        if(rpto == null){
            return new RPTO<>("添加失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findapply",method = RequestMethod.POST)
    public RPTO findapply(@RequestBody @Valid ApplyRQTO applyRQTO) {
        ApplyRPTO rpto = mUserService.findapply(applyRQTO);
        if(rpto == null){
            return new RPTO<>("查找失败");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/findallapply",method = RequestMethod.POST)
    public RPTO findallapply() {
        List<ApplyBean> rpto = mUserService.findallapply();
        if(rpto.size()== 0){
            return new RPTO<>("未找到");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }
    @ResponseBody
    @RequestMapping(value = "/finduserallapply",method = RequestMethod.POST)
    public RPTO finduserallapply(@RequestBody @Valid ApplyRQTO applyRQTO) {
        List<ApplyBean> rpto = mUserService.finduserallapply(applyRQTO);
        if(rpto.size() == 0){
            return new RPTO<>("未找到您的申请信息！");
        }
        return new RPTO<>(ActionCode.SUCCESS,rpto);
    }

}
