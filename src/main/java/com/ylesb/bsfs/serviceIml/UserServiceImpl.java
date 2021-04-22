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

import com.ylesb.bsfs.bean.FaceImgUrlBean;
import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.UserMapper;
import com.ylesb.bsfs.rpto.AddFaceimgRPTO;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.AddFaceimgRQTO;
import com.ylesb.bsfs.rqto.FindRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
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
        rpto.setFaceimg(user.getFaceimg());
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
}