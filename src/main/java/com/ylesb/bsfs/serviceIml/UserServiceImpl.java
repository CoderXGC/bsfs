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

import com.ylesb.bsfs.bean.UserBean;
import com.ylesb.bsfs.mapper.UserMapper;
import com.ylesb.bsfs.rpto.FindRPTO;
import com.ylesb.bsfs.rpto.LoginRPTO;
import com.ylesb.bsfs.rqto.FindRQTO;
import com.ylesb.bsfs.rqto.LoginRQTO;
import com.ylesb.bsfs.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}