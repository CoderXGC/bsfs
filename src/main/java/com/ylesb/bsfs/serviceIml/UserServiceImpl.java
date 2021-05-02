/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   White
 * Date:     2021/4/16 16:02
 * Description: service接口实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ylesb.bsfs.serviceIml;

import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.UserMapper;
import com.ylesb.bsfs.rpto.AddFaceimgRPTO;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.*;
import com.ylesb.bsfs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 〈service接口实现〉
 *
 * @author White
 * @create 2021/4/16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
                @Autowired
                private UserMapper userMapper;

    @Override
    public LoginRPTO login(LoginRQTO login) {
        UserBean user = userMapper.login(login.getId(),login.getPassword());
        if(user == null){
            return null;
        }
        LoginRPTO rpto = new LoginRPTO();
        rpto.setUser_id(user.getId());
        rpto.setName(user.getName());
        return rpto;
    }

    @Override
    public FindRPTO find(FindRQTO find) {
        UserBean user = userMapper.find(find.getId());
        if(user == null){
            return null;
        }
        FindRPTO rpto = new FindRPTO();
        rpto.setDid(user.getDid());
        rpto.setEmail(user.getEmail());
        rpto.setTelnum(user.getTelnum());
        rpto.setId(user.getId());
        rpto.setRole(user.getRole());
        rpto.setName(user.getName());
        rpto.setFaceimg(user.getFaceimg());
        rpto.setSignintime(user.getSignintime());
        rpto.setSignouttime(user.getSignouttime());
        return rpto;
    }

    @Override
    public List<UserBean> findall() {
        List<UserBean> user = userMapper.findall();
        if(user == null){
            return null;
        }
        List<UserBean> list = new ArrayList<>();

        for (int i=0;i<user.size();i++) {
            UserBean userBean = new UserBean();
            userBean.setId(user.get(i).getId());
            userBean.setName(user.get(i).getName());
            userBean.setDid(user.get(i).getDid());
            userBean.setTelnum(user.get(i).getTelnum());
            userBean.setEmail(user.get(i).getEmail());
            userBean.setSignintime(user.get(i).getSignintime());
            userBean.setSignouttime(user.get(i).getSignouttime());
            userBean.setFaceimg(user.get(i).getFaceimg());
            list.add(userBean);
        }
        return list;
    }

    @Override
    public AddFaceimgRPTO addfaceimg(AddFaceimgRQTO addfaceimg) {
       // UserBean user =
        userMapper.addfaceimg(addfaceimg.getId(),addfaceimg.getFaceimg());
        String user="";
        if(user == null){
            return null;
        }
        AddFaceimgRPTO rpto = new AddFaceimgRPTO();
        rpto.setId(user);
        rpto.setFaceimg(user);
        return rpto;
    }

    @Override
    public List<FaceImgUrlBean> findfaceimg() {
        List<FaceImgUrlBean> user = userMapper.findfaceimg();
        if(user == null){
            return null;
        }
        List<FaceImgUrlBean> list = new ArrayList<>();

        for (int i=0;i<user.size();i++) {

            FaceImgUrlBean faceImgUrlBean = new FaceImgUrlBean();
            faceImgUrlBean.setId(user.get(i).getId());
            faceImgUrlBean.setFaceimg(user.get(i).getFaceimg());
            list.add(faceImgUrlBean);
        }
        return list;
    }

    @Override
    public LoginRPTO updatepwd(LoginRQTO login) {
      userMapper.updatepwd(login.getId(),login.getPassword());
        String user="";
        if(user == null){
            return null;
        }
        LoginRPTO rpto = new LoginRPTO();
        rpto.setUser_id(user);
        rpto.setFaceimg(user);
        return rpto;
    }

    @Override
    public ApplyRPTO addapply(ApplyRQTO applyRQTO) {
        // UserBean user =
        userMapper.addapply(applyRQTO.getApplyid(),applyRQTO.getMessage(),applyRQTO.getStarttime(),applyRQTO.getEndtime(),applyRQTO.getId(),applyRQTO.getType(),applyRQTO.getApplytime(),applyRQTO.getTime());
        String user="";
        if(user == null){
            return null;
        }
        ApplyRPTO rpto = new ApplyRPTO();

        return rpto;
    }

    @Override
    public ApplyRPTO findapply(ApplyRQTO applyRQTO) {
        ApplyBean applyBean =userMapper.findapply(applyRQTO.getId());
        String user="";
        if(user == null){
            return null;
        }
        ApplyRPTO rpto = new ApplyRPTO();
        rpto.setApplyid(applyBean.getApplyid());
        rpto.setMessage(applyBean.getMessage());
        rpto.setStarttime(applyBean.getStarttime());
        rpto.setEndtime(applyBean.getEndtime());
        rpto.setId(applyBean.getId());
        rpto.setType(applyBean.getType());
        rpto.setStatus(applyBean.getStatus());
        return rpto;
    }



    @Override
    public List<ApplyBean> finduserallapply(ApplyRQTO applyRQTO) {
        List<ApplyBean> apply = userMapper.finduserallapply(applyRQTO.getId());
        if(apply == null){
            return null;
        }
        List<ApplyBean> list = new ArrayList<>();

        for (int i=0;i<apply.size();i++) {
            ApplyBean applyBean=new ApplyBean();
            applyBean.setApplyid(apply.get(i).getApplyid());
            applyBean.setMessage(apply.get(i).getMessage());
            applyBean.setStarttime(apply.get(i).getStarttime());
            applyBean.setEndtime(apply.get(i).getEndtime());
            applyBean.setType(apply.get(i).getType());
            applyBean.setStatus(apply.get(i).getStatus());
            applyBean.setId(apply.get(i).getId());
            applyBean.setApplytime(apply.get(i).getApplytime());
            list.add(applyBean);
        }
        return list;
    }

    @Override
    public ApplyRPTO delapply(ApplyRQTO applyRQTO) {
        userMapper.delapply(applyRQTO.getApplyid());
        String user="";
        if(user == null){
            return null;
        }
        ApplyRPTO rpto = new ApplyRPTO();

        return rpto;
    }

    @Override
    public List<SignBean> findsignall(FindRQTO findRQTO) {
        List<SignBean> sign = userMapper.findsignall(findRQTO.getId());
        if(sign == null){
            return null;
        }
        List<SignBean> list = new ArrayList<>();

        for (int i=0;i<sign.size();i++) {
            SignBean signBean = new SignBean();
            signBean.setId(sign.get(i).getId());
            signBean.setDaytime(sign.get(i).getDaytime());
            signBean.setDid(sign.get(i).getDid());
            signBean.setSignintime(sign.get(i).getSignintime());
            signBean.setSignouttime(sign.get(i).getSignouttime());
            signBean.setSignid(sign.get(i).getSignid());
            signBean.setSignid(sign.get(i).getSignid());
            signBean.setLatetime(sign.get(i).getLatetime());
            signBean.setMachine(sign.get(i).getMachine());
            list.add(signBean);
        }
        return list;
    }

    @Override
    public FindRPTO updateuser(UserBean userBean) {
        userMapper.updateuser(userBean.getId(),userBean.getTelnum(),userBean.getEmail());
        String user="";
        if(user == null){
            return null;
        }
        FindRPTO rpto = new FindRPTO();
        rpto.setId(user);
        rpto.setFaceimg(user);
        return rpto;
    }


}