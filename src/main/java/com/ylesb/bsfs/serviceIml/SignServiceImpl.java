/**
 * Copyright (C), 2020-2021, www.ylesb.com
 * FileName: SignServiceImpl
 * Author:   White
 * Date:     2021/4/23 16:33
 * Description: 签到实现
 * History:
 */
package com.ylesb.bsfs.serviceIml;

import com.ylesb.bsfs.bean.SignBean;
import com.ylesb.bsfs.mapper.SignMapper;
import com.ylesb.bsfs.rpto.SignRPTO;
import com.ylesb.bsfs.rqto.SignRQTO;
import com.ylesb.bsfs.service.SignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 〈签到实现〉
 *
 * @author White
 * @create 2021/4/23
 */
@Slf4j
@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignMapper signMapper;

    @Override
    public SignRPTO signin(SignRQTO signRQTO) {
    //    SignBean sign=
        signMapper.signin(signRQTO.getId(),signRQTO.getSignid(),signRQTO.getLatetime(),signRQTO.getSignintime(),signRQTO.getDaytime(),signRQTO.getDid(),signRQTO.getMachine(),signRQTO.getSignouttime());
        String user="111";
        if(user == null){
            return null;
        }
        SignRPTO rpto = new SignRPTO();
        rpto.setUser_id(user);
        rpto.setSignid(user);
        return rpto;

    }

    @Override
    public SignRPTO signout(SignRQTO signRQTO) {
        signMapper.signout(signRQTO.getId(),signRQTO.getSignid(),signRQTO.getDaytime(),signRQTO.getMachine(),signRQTO.getSignouttime());
        String user="111";
        if(user == null){
            return null;
        }
        SignRPTO rpto = new SignRPTO();
        rpto.setUser_id(user);
        rpto.setSignid(user);
        return rpto;
    }

    @Override
    public SignRPTO findsign(SignRQTO signRQTO) {
        SignBean findsign= signMapper.findsign(signRQTO.getId(),signRQTO.getSignid());
        if(findsign == null){
            return null;
        }
        SignRPTO rpto = new SignRPTO();
        rpto.setSignintime(findsign.getSignintime());
        rpto.setUser_id(findsign.getId());
        rpto.setSignouttime(findsign.getSignouttime());
        return rpto;
    }
}