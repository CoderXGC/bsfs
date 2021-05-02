/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: AdminServiceImpl
 * Author:   White
 * Date:     2021/4/27 18:22
 * Description: admin
 * History:
 */
package com.ylesb.bsfs.serviceIml;

import com.ylesb.bsfs.bean.AdminBean;
import com.ylesb.bsfs.bean.ApplyBean;
import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.AdminMapper;
import com.ylesb.bsfs.rpto.ApplyRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.*;
import com.ylesb.bsfs.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 〈admin〉
 *
 * @author White
 * @create 2021/4/27
 */
@Slf4j
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public LoginRPTO login(LoginRQTO login) {
        AdminBean admin = adminMapper.login(login.getId(),login.getPassword());
        if(admin == null){
            return null;
        }
        LoginRPTO rpto = new LoginRPTO();
        rpto.setUser_id(admin.getId());
        rpto.setName(admin.getName());
        return rpto;
    }

    @Override
    public LoginRPTO adduser(AddUserRQTO addUserRQTO) {
        adminMapper.adduser(addUserRQTO.getId(),addUserRQTO.getName(),addUserRQTO.getDid());
       // adminMapper.adduser(addUserRQTO.getId(),addUserRQTO.getName(),addUserRQTO.getPwd(),addUserRQTO.getDid(),addUserRQTO.getSignintime(),addUserRQTO.getSignouttime(),addUserRQTO.getTelnum(),addUserRQTO.getEmail());
            String user="";
            if(user == null){
                return null;
            }
            LoginRPTO  rpto = new LoginRPTO();
            rpto.setUser_id(user);
            return rpto;

    }

    @Override
    public List<ApplyBean> findallapply() {
        List<ApplyBean> apply = adminMapper.findallapply();
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
            applyBean.setTime(apply.get(i).getTime());
            list.add(applyBean);
        }
        return list;
    }

    @Override
    public ApplyRPTO upaudit(ApplyRQTO applyRQTO) {
        adminMapper.upaudit(applyRQTO.getApplyid(),applyRQTO.getStatus());
        String user="";
        if(user == null){
            return null;
        }
        ApplyRPTO rpto = new ApplyRPTO();
        rpto.setStatus(user);
        return rpto;
    }

    @Override
    public List<SignBean> findsignall() {
        List<SignBean> sign = adminMapper.findsignall();
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
    public List<SignBean> findsignalltime(SignRQTO signRQTO) {
        List<SignBean> sign = adminMapper.findsignalltime(signRQTO.getDaytime());
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
    public LoginRPTO updatesigntime(UserBean userBean) {
        adminMapper.updatesigntime(userBean.getSignintime(),userBean.getSignouttime());
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
    public FindRPTO deluser(FindRQTO findRQTO) {
        adminMapper.deluser(findRQTO.getId());
        String user="";
        if(user == null){
            return null;
        }
        FindRPTO rpto = new FindRPTO();

        return rpto;
    }


}